package ejerciciosLab_02;
public class Ejercicio1 {
    public static void main(String[] args) {
        int numero = 12345;
        int numeroInvertido = invertirNumero(numero);
        System.out.println("El número invertido es: " + numeroInvertido);
    }

    public static int invertirNumero(int numero) {
        // Si el número tiene solo un dígito, simplemente devuélve
        if (numero < 10) {
            return numero;
        } else {
            // Obtenemos el último dígito del número y lo multiplicamos por la potencia de 10 correspondiente al número de dígitos menos uno
            int ultimoDigito = numero % 10;
            int longitud = (int) Math.log10(numero);
            return ultimoDigito * (int) Math.pow(10, longitud) + invertirNumero(numero / 10);
        }
    }
}
