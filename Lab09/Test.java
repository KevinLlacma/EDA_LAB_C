package Lab09;

public class Test {
    public static void main(String[] args) {
         
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(11);
        tree.root.left = new Node(18);
        tree.root.right = new Node(27);
        tree.root.left.left = new Node(29);
        tree.root.left.right = new Node(46);


        System.out.println("Recorrido en preorden:");
        tree.preOrden(tree.root);


        System.out.println("\nRecorrido en inorden:");
        tree.inOrden(tree.root);


        System.out.println("\nRecorrido en postorden:");
        tree.postOrden(tree.root);


        int altura = tree.alturaArbol(tree.root);
        System.out.println("Altura: " + altura);

        BinaryTree bstTree = new BinaryTree();
        bstTree.root = new Node(4);
        bstTree.root.left = new Node(2);
        bstTree.root.right = new Node(6);
        bstTree.root.left.left = new Node(1);
        bstTree.root.left.right = new Node(3);
        bstTree.root.right.left = new Node(5);
        bstTree.root.right.right = new Node(7);
        
        
        BinaryTree nonBSTTree = new BinaryTree();
        nonBSTTree.root = new Node(3);
        nonBSTTree.root.left = new Node(2);
        nonBSTTree.root.right = new Node(5);
        nonBSTTree.root.left.left = new Node(1);
        nonBSTTree.root.left.right = new Node(4); 


        
        System.out.println("¿El primer árbol es un BST? " + bstTree.esBST(bstTree.root));
        System.out.println("¿El segundo árbol es un BST? " + nonBSTTree.esBST(nonBSTTree.root));


        int numNodos = tree.contarNodos(tree.root);
        System.out.println("Número de nodos en el árbol binario: " + numNodos);

    }

}
