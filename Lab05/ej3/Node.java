package ej3;

class Node<T> {
    T data;
    Node<T> left, right;

    public Node(T item) {
        this.data = item;
        this.left = this.right = null;
    }
}
