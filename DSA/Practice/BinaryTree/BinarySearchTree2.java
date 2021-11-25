class Node2 {
    int data;
    Node2 left;
    Node2 right;

    Node2(int d) {
        data = d;
    }
}

public class BinarySearchTree2 {
    Node2 root;

    public void preorder(Node2 node) {
        if (node != null) {
            System.out.println(node.data);
            preorder(node.left);
            preorder(node.right);
        }
    }

    public void inorder(Node2 node) {
        if (node != null) {
            inorder(node.left);
            System.out.println(node.data);
            inorder(node.right);
        }
    }

    public void postorder(Node2 node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.println(node.data);
        }
    }

    public Node2 inserData(Node2 root, int data) {

        if (root == null) {
            root = new Node2(data);
            return root;
        }
        if (data < root.data) {
            root.left = inserData(root.left, data);
        } else {
            root.right = inserData(root.right, data);
        }
        return root;
    }

    public int countNode(Node2 root) {

        // base case
        if (root == null)
            return 0;

        // recursive call to left child and right child and
        // add the result of these with 1 ( 1 for counting the root)
        return 1 + countNode(root.left) + countNode(root.right);
    }

    public static void main(String[] args) {
        BinarySearchTree2 b1 = new BinarySearchTree2();
        b1.root = new Node2(10);
        b1.inserData(b1.root, 8);
        b1.inserData(b1.root, 12);
        b1.inserData(b1.root, 9);
        b1.inserData(b1.root, 7);
        // b1.preorder(b1.root);
        // b1.postorder(b1.root);
        b1.inorder(b1.root);
        System.out.println("Number of nodes in given binary tree: " + b1.countNode(b1.root));
    }
}
