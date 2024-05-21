package ejerciciosLab_02;

public class Ejercicio4 {

    public static void main(String[] args) {
        int numDiscos = 3; // Número de discos
        moverDiscos(numDiscos, 'A', 'C', 'B'); // A es la barra de origen, C es la barra de destino, B es la barra auxiliar
    }

    // Método recursivo para resolver el problema de la Torre de Hanoi
    public static void moverDiscos(int numDiscos, char origen, char destino, char auxiliar) {
        if (numDiscos == 1) {
            System.out.println("Mover disco 1 de " + origen + " a " + destino);
            return;
        }
        // Mover los n-1 discos de la barra de origen a la barra auxiliar, usando la barra de destino
        moverDiscos(numDiscos - 1, origen, auxiliar, destino);
        // Mover el disco restante de la barra de origen a la barra de destino
        System.out.println("Mover disco " + numDiscos + " de " + origen + " a " + destino);
        // Mover los n-1 discos de la barra auxiliar a la barra de destino, usando la barra de origen
        moverDiscos(numDiscos - 1, auxiliar, destino, origen);
    }
}

