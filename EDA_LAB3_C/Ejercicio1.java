public class Ejercicio1 {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {1, 2, 3, 4, 6};

        System.out.println("Array1 y Array2 son iguales: " + esIgual(array1, array2));
        System.out.println("Array1 y Array3 son iguales: " + esIgual(array1, array3));
    }

    public static boolean esIgual(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        return esIgual(array1, array2, 0, array1.length - 1);
    }

    private static boolean esIgual(int[] array1, int[] array2, int izquierda, int derecha) {
        if (izquierda > derecha) {
            return true;
        }

        if (izquierda == derecha) {
            return array1[izquierda] == array2[izquierda];
        }

        int mid = izquierda + (derecha - izquierda) / 2;

        return esIgual(array1, array2, izquierda, mid) && esIgual(array1, array2, mid + 1, derecha);
    }
}
