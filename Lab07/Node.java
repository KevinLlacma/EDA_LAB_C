package EDA_LAB_C.Lab07;
class Node<T> {
    T dato;
    Node<T> next;

    //Constructor para inicializar un Node
    public Node(T dato) {
        this.dato = dato;
        this.next = null;
    }

    public T getDato(){
        return this.dato;
    }
}
