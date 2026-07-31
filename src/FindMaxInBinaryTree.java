class Node {
    int value;
    Node left, right;

    public Node(int item) {
        value = item;
        left = right = null;
    }
}

public class FindMaxInBinaryTree {
    Node root;

    // Finds the maximum value in the binary tree using recursion
    public int findMax(Node root) {
        // Base case: if the node is null, return the smallest possible integer
        if (root == null) {
            return Integer.MIN_VALUE;
        }

        // Recursively find the maximum value in the left and right subtrees
        int leftMax = findMax(root.left);
        int rightMax = findMax(root.right);

        // Return the maximum among the current node, left subtree, and right subtree
        return Math.max(root.value, Math.max(leftMax, rightMax));
    }

    public static void main(String[] args) {
        FindMaxInBinaryTree tree = new FindMaxInBinaryTree();

        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(30);
        tree.root.left.right = new Node(25);
        tree.root.right.right = new Node(50);

        System.out.println("Maximum value in the tree: " + tree.findMax(tree.root));
    }
}