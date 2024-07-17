package Lab10.Ej3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BTree tree = new BTree(3);

        int[] keys = {10, 20, 5, 6, 12, 30, 7, 17};
        for (int key : keys) {
            tree.insert(key);
        }

        List<Integer> inOrder = tree.inOrden();
        System.out.println("InOrder: " + inOrder);

        List<Integer> preOrder = tree.preOrden();
        System.out.println("PreOrder: " + preOrder);

        List<Integer> postOrder = tree.postOrden();
        System.out.println("PostOrder: " + postOrder);
    }
}
