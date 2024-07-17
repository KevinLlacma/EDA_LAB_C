package Lab10.Ej3;

import java.util.ArrayList;
import java.util.List;

public class BTree {
    Node root;
    int t; 

    public BTree(int t) {
        this.root = null;
        this.t = t;
    }
    public void insert(int key) {
        if (root == null) {
            root = new Node(t, true);
            root.keys[0] = key;
            root.n = 1;
        } else {
            if (root.n == 2 * t - 1) {
                Node s = new Node(t, false);
                s.children[0] = root;
                dividir(s, 0, root);
                int i = 0;
                if (s.keys[0] < key) {
                    i++;
                }
                insertNoFull(s.children[i], key);
                root = s;
            } else {
                insertNoFull(root, key);
            }
        }
    }
    
    private void insertNoFull(Node node, int key) {
        int i = node.n - 1;
        if (node.leaf) {
            while (i >= 0 && node.keys[i] > key) {
                node.keys[i + 1] = node.keys[i];
                i--;
            }
            node.keys[i + 1] = key;
            node.n++;
        } else {
            while (i >= 0 && node.keys[i] > key) {
                i--;
            }
            i++;
            if (node.children[i].n == 2 * t - 1) {
                dividir(node, i, node.children[i]);
                if (node.keys[i] < key) {
                    i++;
                }
            }
            insertNoFull(node.children[i], key);
        }
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

    public List<Integer> inOrden() {
        List<Integer> result = new ArrayList<>();
        inOrden(root, result);
        return result;
    }

    private void inOrden(Node node, List<Integer> result) {
        if (node != null) {
            int i;
            for (i = 0; i < node.n; i++) {
                if (!node.leaf) {
                    inOrden(node.children[i], result);
                }
                result.add(node.keys[i]);
            }
            if (!node.leaf) {
                inOrden(node.children[i], result);
            }
        }
    }

   
    public List<Integer> preOrden() {
        List<Integer> result = new ArrayList<>();
        preOrden(root, result);
        return result;
    }

    private void preOrden(Node node, List<Integer> result) {
        if (node != null) {
            int i;
            for (i = 0; i < node.n; i++) {
                result.add(node.keys[i]);
                if (!node.leaf) {
                    preOrden(node.children[i], result);
                }
            }
            if (!node.leaf) {
                preOrden(node.children[i], result);
            }
        }
    }

   
    public List<Integer> postOrden() {
        List<Integer> result = new ArrayList<>();
        postOrden(root, result);
        return result;
    }

    private void postOrden(Node node, List<Integer> result) {
        if (node != null) {
            int i;
            for (i = 0; i < node.n; i++) {
                if (!node.leaf) {
                    postOrden(node.children[i], result);
                }
            }
            if (!node.leaf) {
                postOrden(node.children[i], result);
            }
            for (i = 0; i < node.n; i++) {
                result.add(node.keys[i]);
            }
        }
    }
    
    
}