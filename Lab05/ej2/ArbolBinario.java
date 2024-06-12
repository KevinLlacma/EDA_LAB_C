package ej2;

import java.util.Random;

class ArbolBinario<T extends Comparable<T>> {
    Node<T> root;

    public ArbolBinario() {
        root = null;
    }

    //insertar una nueva clave
    void insert(T data) {
        root = insertRec(root, data);
    }

    //recursividad para insertar una nueva clave
    Node<T> insertRec(Node<T> root, T data) {
        if (root == null) {
            root = new Node<>(data);
            return root;
        }

        if (data.compareTo(root.data) < 0)
            root.left = insertRec(root.left, data);
        else if (data.compareTo(root.data) > 0)
            root.right = insertRec(root.right, data);

        return root;
    }

    // recorre el arbol en orden
    void inorder() {
        inorderRec(root);
    }

    // recursivo para recorrer el arbol en orden
    void inorderRec(Node<T> root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

   
    public static void main(String[] args) {
        ArbolBinario<Integer> intTree = new ArbolBinario<>();
        Random rand = new Random();

        // inserta 100 datos aleatorios 
        for (int i = 0; i < 100; i++) {
            intTree.insert(rand.nextInt(1000));
        }

        // recorrer el arbol en orden yverifica la estructura
        System.out.println("Recorrido:");
        intTree.inorder();
    }
}
