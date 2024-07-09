package Lab09;

import javax.swing.tree.TreeNode;

class BinaryTree {
    Node root;

    public BinaryTree() {
        this.root = null;
    }
   
    public void preOrden(Node node) {
        if (node != null) {
            System.out.print(node.val + " ");
            preOrden(node.left);
            preOrden(node.right);
        }
    }

    public void inOrden(Node node) {
        if (node != null) {
            inOrden(node.left);
            System.out.print(node.val + " ");
            inOrden(node.right);
        }
    }

    public void postOrden(Node node) {
        if (node != null) {
            postOrden(node.left);
            postOrden(node.right);
            System.out.print(node.val + " ");
        }
    }
    public int alturaArbol(Node node) {
        if (node == null) {
            return 0;
        } else {
            
            int alturaIzquierda = alturaArbol(node.left);
            int alturaDerecha = alturaArbol(node.right);
            
            return Math.max(alturaIzquierda, alturaDerecha) + 1;
        }
    } 
    public boolean esBST(Node node) {
        return esBSTUtil(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean esBSTUtil(Node node, int minValue, int maxValue) {
        if (node == null) {
            return true;
        }
        
        if (node.val <= minValue || node.val >= maxValue) {
            return false;
        }
        
        return esBSTUtil(node.left, minValue, node.val) && esBSTUtil(node.right, node.val, maxValue);
    }
    public int contarNodos(Node node) {
        if (node == null) {
            return 0;
        }
               
        return 1 + contarNodos(node.left) + contarNodos(node.right);
    }

   
}