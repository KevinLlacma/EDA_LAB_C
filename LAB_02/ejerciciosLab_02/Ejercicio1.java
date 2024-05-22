package ejerciciosLab_02;
public class Ejercicio1 {
    
    public static int invertirNumero(int numero) {
        
        if (numero < 10) {
            return numero;
        } else {
           
            int ultimoDigito = numero % 10;
            int longitud = (int) Math.log10(numero);
            return ultimoDigito * (int) Math.pow(10, longitud) + invertirNumero(numero / 10);
        }
    }
    public static void main(String[] args) {
        int numero = 12345;
        int numeroInvertido = invertirNumero(numero);
        System.out.println("El número invertido es: " + numeroInvertido);
    }
}
