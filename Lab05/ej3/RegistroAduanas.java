package ej3;

import java.util.Scanner;

public class RegistroAduanas {
    public static void main(String[] args) {
        ArbolBinario<Turista> arbol = new ArbolBinario<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Registro de Turistas en Aduanas");
        System.out.println("Ingrese los datos de los turistas. 'fin' como nombre para terminar");

        while (true) {
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }


            System.out.print("Documento: ");
            String documento = scanner.nextLine();

            Turista turista = new Turista(nombre, documento);
            arbol.insert(turista);
        }

        System.out.println("\nTuristas registrados:");
        arbol.inorder();
    }
}


