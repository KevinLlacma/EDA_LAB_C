package Lab10.Ej2;

public class Main {
    public static void main(String[] args) {
        
        BTree tree1 = new BTree(5);
        BTree tree2 = new BTree(5);

        
        BTree mergedTree = BTree.fusionBTree(tree1, tree2);
        System.out.println("Se ha fusionado");
    }
}
