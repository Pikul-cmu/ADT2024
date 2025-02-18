import java.util.LinkedList;
import java.util.Queue;

class BST {
    int data;
    BST lLink, rLink; // Left and right children

    public BST(int data) {
        this.data = data;
        this.lLink = null;
        this.rLink = null;
    }
}

class BinarySearchTree {
    BST root;

    public BinarySearchTree() {
        root = null;
    }

    public void breadthFirst() {
        if (root == null) return; // Handle empty tree case

        Queue<BST> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            BST node = q.poll(); // Dequeue the front element
            visit(node);

            if (node.lLink != null) q.add(node.lLink);
            if (node.rLink != null) q.add(node.rLink);
        }
    }

    private void visit(BST node) {
        System.out.print(node.data + " ");
    }

    // Helper function to insert nodes
    public void insert(int data) {
        root = insertRec(root, data);
    }

    private BST insertRec(BST root, int data) {
        if (root == null) {
            return new BST(data);
        }
        if (data < root.data) {
            root.lLink = insertRec(root.lLink, data);
        } else {
            root.rLink = insertRec(root.rLink, data);
        }
        return root;
    }
}

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(7);
        tree.insert(12);
        tree.insert(18);

        System.out.println("Breadth-First Traversal:");
        tree.breadthFirst();
    }
}

	
	
	
