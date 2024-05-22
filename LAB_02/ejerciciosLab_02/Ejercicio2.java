package ejerciciosLab_02;

public class Ejercicio2 {

    // si un número está ordenado de forma creciente
    public static boolean estaOrdenadoCreciente(int numero) {
        String numStr = String.valueOf(numero);
        for (int i = 0; i < numStr.length() - 1; i++) {
            if (numStr.charAt(i) > numStr.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    // si está ordenado de forma decreciente
    public static boolean estaOrdenadoDecreciente(int numero) {
        String numStr = String.valueOf(numero);
        for (int i = 0; i < numStr.length() - 1; i++) {
            if (numStr.charAt(i) < numStr.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int numero = 123456789;
        System.out.println("El número " + numero + " está ordenado de forma creciente: " + estaOrdenadoCreciente(numero));
        System.out.println("El número " + numero + " está ordenado de forma decreciente: " + estaOrdenadoDecreciente(numero));
    }
}
