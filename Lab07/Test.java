package EDA_LAB_C.Lab07;


public class Test {

    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<>();

        llenarLista(lista);
       
        System.out.println("Lista:");
        lista.mostrarLista();

        lista.eliminarNode(5);
        System.out.println("si existe se elimina el dato 5:");
        lista.mostrarLista();

        System.out.println("Esta el dato 4 en la lista? " + lista.buscarNode(4));
        System.out.println("Esta el dato 2 en la lista? " + lista.buscarNode(2));
       
    }
    public static void llenarLista(LinkedList<Integer> lista){
        for (int i = 0; i < 5; i++) {
            lista.agregarAlFinal((int) (Math.random() * 10) + 1);
        }
    }
}
