package Lab10.Ej3;

class Node {
    int[] keys;
    int t; 
    Node[] children;
    int n; 
    boolean leaf;

    public Node(int t, boolean leaf) {
        this.t = t;
        this.leaf = leaf;
        this.keys = new int[2 * t - 1];
        this.children = new Node[2 * t];
        this.n = 0;
    }
}







    

