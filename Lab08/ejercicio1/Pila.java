package Lab08.ejercicio1;

import java.util.EmptyStackException;


public class Pila<T> {


    private Nodo top;


    private static class Nodo<T> {


        T data;
        Nodo next;


        Nodo(T data) {
            this.data = data;
            this.next = null;
        }
    }
    // Método para empujar (push) un elemento en la pila


    public <T> void push(T data) {
        Nodo nuevoNodo = new Nodo(data);
        nuevoNodo.next = top;
        top = nuevoNodo;
    }
    // Método para sacar (pop) un elemento de la pila


    public <T> T pop() {
        if (top == null) {
            throw new EmptyStackException();
        }
        T data = (T) top.data;
        top = top.next;
        return data;
    }
    // Método para ver el elemento en la cima de la pila


    public T peek() {
        if (top == null) {
            throw new EmptyStackException();
        }
        return (T) top.data;
    }
    // Método para verificar si la pila está vacía


    public boolean isEmpty() {
        return top == null;
    }
    // Método para mostrar todos los elementos de la pila


    public void mostrar() {
        Nodo actual = top;
        while (actual != null) {
            System.out.print(actual.data + " -> ");
            actual = actual.next;
        }
        System.out.println("null");
    }
}
