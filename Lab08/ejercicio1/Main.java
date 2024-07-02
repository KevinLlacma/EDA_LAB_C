package Lab08.ejercicio1;

import java .util.*;
public class Main {


    public static void main(String[] args) {
       
        Scanner scan = new Scanner (System.in);
        System.out.println("Ingrese una palabra");
        String cadena = scan.nextLine();
        Pila pila = new Pila();
        separarCadena(cadena,pila, cadena);


        pila.mostrar();
        System.out.println("Elemento en la cima: " + pila.peek());
        System.out.println("Elemento sacado: " + pila.pop());
        pila.mostrar();
        System.out.println("¿La pila está vacía? " + pila.isEmpty());
    }
    static void separarCadena(String cadena,Pila pila, String string) {


        for (int i = 0; i < cadena.length(); i++){
            pila.push(string.charAt(i));
            
        }
    }


}
