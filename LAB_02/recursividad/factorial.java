package recursividad;

public class factorial {

    public static long calcularFactorial(int n) {
        // Caso base: El factorial de 0 es 1
        if (n == 0) {
            return 1;
        }
        // Caso recursivo: n! = n * (n-1)!
        else {
            return n * calcularFactorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int numero = 9;
        long factorial = calcularFactorial(numero);
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}