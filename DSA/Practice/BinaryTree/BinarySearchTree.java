public class BinarySearchTree {

    Node root;

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int key) {
            data = key;
            left = null;
            right = null;
        }
    }

    void inorder(Node node) {
        if (node == null)
            return;
        inorder(node.left);
        System.out.println(node.data);
        inorder(node.right);

    }

    public Node inserdata(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.data) {
            root.left = inserdata(root.left, key);
        } else {
            root.right = inserdata(root.right, key);
        }
        return root;
    }

    public static void main(String[] args) {
        BinarySearchTree b1 = new BinarySearchTree();
        b1.root = new Node(10);
        b1.inserdata(b1.root, 10);
        b1.inserdata(b1.root, 12);
        b1.inserdata(b1.root, 15);
        b1.inserdata(b1.root, 8);
        b1.inserdata(b1.root, 2);
        System.out.println("preorder");
        b1.inorder(b1.root);
    }
}
