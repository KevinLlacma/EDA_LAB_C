package Lab10.Ej1;
import java.util.*;

public class BTree {
    Node root;
    int t; 

    public BTree(int t) {
        this.root = null;
        this.t = t;
    }

    
    public boolean isValid() {
        if (root == null) {
            return true; 
        }
        return isValid(root, new ArrayList<>());
    }

    private boolean isValid(Node node, List<Integer> leafDepths) {
        
        if (node.n < t - 1 || node.n > 2 * t - 1) {
            return false;
        }

        
        for (int i = 1; i < node.n; i++) {
            if (node.keys[i - 1] > node.keys[i]) {
                return false;
            }
        }

        
        if (node.leaf) {
            int depth = getDepth(node);
            if (!leafDepths.isEmpty() && leafDepths.get(0) != depth) {
                return false;
            }
            if (leafDepths.isEmpty()) {
                leafDepths.add(depth);
            }
        } else {
            
            for (int i = 0; i <= node.n; i++) {
                if (node.children[i] == null) {
                    return false; 
                }
                if (!isValid(node.children[i], leafDepths)) {
                    return false;
                }
            }
        }
        return true;
    }

    
    private int getDepth(Node node) {
        int depth = 0;
        while (!node.leaf) {
            node = node.children[0];
            depth++;
        }
        return depth;
    }

}
