public class Ejercicio2 {

    public static void main(String[] args) {
        int[] array = {3, 5, 1, 8, 4, 9, 2, 7};
        Result result = encuentraMinMax(array, 0, array.length - 1);
        System.out.println();
        System.out.println("Min: " + result.min + ", Max: " + result.max);
    }

    public static Result encuentraMinMax(int[] array, int izquierda, int derech) {
        if (izquierda == derech) { 
            return new Result(array[izquierda], array[izquierda]);
        }
        if (derech == izquierda + 1) { 
            if (array[izquierda] < array[derech]) {
                return new Result(array[izquierda], array[derech]);
            } else {
                return new Result(array[derech], array[izquierda]);
            }
        }

       
        int mid = izquierda + (derech - izquierda) / 2;

       
        Result izquierdaResult = encuentraMinMax(array, izquierda, mid);
        Result derechResult = encuentraMinMax(array, mid + 1, derech);

        
        int min = Math.min(izquierdaResult.min, derechResult.min);
        int max = Math.max(izquierdaResult.max, derechResult.max);

        return new Result(min, max);
    }
}

class Result {
    int min;
    int max;

    Result(int min, int max) {
        this.min = min;
        this.max = max;
    }
}
