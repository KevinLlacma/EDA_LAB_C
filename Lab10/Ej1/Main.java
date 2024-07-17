package Lab10.Ej1;

public class Main {
    public static void main(String[] args) {
        BTree tree = new BTree(3); 
        

        System.out.println(tree.isValid() ? "Este arbol es un B valido" : "Este arbol no es un B valido");
    }
}
