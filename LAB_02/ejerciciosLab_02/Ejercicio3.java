package ejerciciosLab_02;

public class Ejercicio3 {

        // si una palabra es un palíndromo true
    public static boolean esPalindromo(String palabra) {
        int izquierda = 0;
        int derecha = palabra.length() - 1;

        while (izquierda < derecha) {
            if (palabra.charAt(izquierda) != palabra.charAt(derecha)) {
                return false;
            }
            izquierda++;
            derecha--;
        }

        return true;
    }

    public static void main(String[] args) {
        String palabra = "reconocer";//si es false no loes, true si lo es
        System.out.println("La palabra \"" + palabra + "\" es un palíndromo: " + esPalindromo(palabra));
    }

}
