package ejerciciosLab_02;

public class Ejercicio5 {

    
    public static int busquedaBinaria(int[] arreglo, int objetivo) {
        int izquierda = 0;
        int derecha = arreglo.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            
            if (arreglo[medio] == objetivo) {
                return medio;
            }

            // Si el objetivo es mayor, ignorar la mitad izquierda
            if (arreglo[medio] < objetivo) {
                izquierda = medio + 1;
            }
            // Si el objetivo es menor, ignorar la mitad derecha
            else {
                derecha = medio - 1;
            }
        }

        // si el elemento no está presente en el arreglo
        return -1;
    }
    public static void main(String[] args) {
        int[] arreglo = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19}; 
        int objetivo = 7; 

        int resultado = busquedaBinaria(arreglo, objetivo);

        if (resultado != -1) {
            System.out.println("Encontrado: en la posición: " + resultado);
        } else {
            System.out.println("NO fue encontrado en el arreglo.");
        }
    }
}

