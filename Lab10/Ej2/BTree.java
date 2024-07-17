package Lab10.Ej2;

public class BTree {
    Node root;
    int t; 

    public BTree(int t) {
        this.root = null;
        this.t = t;
    }

    
    public static BTree fusionBTree(BTree tree1, BTree tree2) {
        if (tree1.t != tree2.t) {
            throw new IllegalArgumentException("Los arboles tiene que tener el mismo grado para poder fusionarlos");
        }

        BTree fusion = new BTree(tree1.t);

        if (tree1.root == null) {
            return tree2;
        }
        if (tree2.root == null) {
            return tree1;
        }

        fusion.root = new Node(tree1.t, false);
        fusion.root.keys[0] = tree1.root.keys[tree1.root.n / 2];
        fusion.root.n = 1;
        fusion.root.children[0] = tree1.root;
        fusion.root.children[1] = tree2.root;

        if (fusion.root.n == 2 * fusion.t - 1) {
            Node s = new Node(fusion.t, false);
            s.children[0] = fusion.root;
            fusion.dividir(s, 0, fusion.root);
            fusion.root = s;
        }

        return fusion;
    }

    
    private void dividir(Node x, int i, Node y) {
        Node z = new Node(y.t, y.leaf);
        z.n = t - 1;

        for (int j = 0; j < t - 1; j++) {
            z.keys[j] = y.keys[j + t];
        }

        if (!y.leaf) {
            for (int j = 0; j < t; j++) {
                z.children[j] = y.children[j + t];
            }
        }

        y.n = t - 1;

        for (int j = x.n; j >= i + 1; j--) {
            x.children[j + 1] = x.children[j];
        }

        x.children[i + 1] = z;

        for (int j = x.n - 1; j >= i; j--) {
            x.keys[j + 1] = x.keys[j];
        }

        x.keys[i] = y.keys[t - 1];
        x.n++;
    }

    
}