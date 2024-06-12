package ej3;

class ArbolBinario<T extends Comparable<T>> {
    Node<T> root;

    public ArbolBinario() {
        root = null;
    }

    //inserta una nueva clave
    void insert(T data) {
        root = insertRec(root, data);
    }

    // recursividad para insertar una nueva clave
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

    //recorre el árbol en orden
    void inorder() {
        inorderRec(root);
    }

    // recursividad y recorrer el arbol en orden
    void inorderRec(Node<T> root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.data.toString());
            inorderRec(root.right);
        }
    }
}
