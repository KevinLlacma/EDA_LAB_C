package EDA_LAB_C.Lab07;
class LinkedList<T> {
    private Node<T> head;

    public LinkedList() {
        this.head = null;
    }
   
    public void agregarAlFinal(T dato) {
        Node<T> newNode = new Node<>(dato);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> actual = head;
            while (actual.next != null) {
                actual = actual.next;
            }
            actual.next = newNode;
        }
    }

    public void mostrarLista() {
        Node<T> actual = head;
        while (actual != null) {
            System.out.print(actual.dato + "  ");
            actual = actual.next;
        }
        System.out.println();
    }

    public void eliminarNode(T dato) {
        if (head == null) {
            return;
        }
        if (head.dato.equals(dato)) {
            head = head.next;
            return;
        }
        Node<T> actual = head;
        while (actual.next != null && !actual.next.dato.equals(dato)) {
            actual = actual.next;
        }
        if (actual.next != null) {
            actual.next = actual.next.next;
        }
    }

   
    public boolean buscarNode(T dato) {
        Node<T> actual = head;
        while (actual != null) {
            if (actual.dato.equals(dato)) {
                return true;
            }
            actual = actual.next;
        }
        return false;
    }
}
