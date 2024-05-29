public class Ejemplo {

    public static void main(String[] args) {

        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int tar = 7;
        int result = busqBinaria(sortedArray, tar, 0, sortedArray.length - 1);
        System.out.println();
        if (result != -1) {
            System.out.println("Elemento encontrado en el índice: " + result);
        } else {
            System.out.println("Elemento no encontrado.");
        }
    }

    public static int busqBinaria(int[] array, int tar, int izq, int der) {
        if (izq > der) {
            return -1; // El elemento no está presente en el array
        }

        int mid = izq + (der - izq) / 2;

        // Verifica si el elemento está en el medio
        if (array[mid] == tar) {
            return mid;
        }

        // Si el elemento es menor que el medio, solo puede estar en la mitad izquierda
        if (array[mid] > tar) {
            return busqBinaria(array, tar, izq, mid - 1);
        }

        // Si el elemento es mayor que el medio, solo puede estar en la mitad derecha
        return busqBinaria(array, tar, mid + 1, der);
    }
}
