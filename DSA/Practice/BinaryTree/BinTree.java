class Node3 {
    Node3 left;
    Node3 right;
    int data;

    Node3(int d) {
        data = d;
    }
}

public class BinTree {

    Node3 root;

    Node3 inserData(Node3 root, int d) {
        if (root == null) {
            root = new Node3(d);
            return root;
        }
        if (d < root.data) {
            root.left = inserData(root.left, d);
        } else if (d > root.data) {
            root.right = inserData(root.right, d);
        }
        return root;
    }

    int minValue(Node3 root) {
        int minv = root.data;
        while (root.left != null) {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }

    public void preorder(Node3 node) {
        if (node != null) {
            System.out.println(node.data);
            preorder(node.left);
            preorder(node.right);
        }
    }

    public void inorder(Node3 node) {
        if (node != null) {
            inorder(node.left);
            System.out.println(node.data);
            inorder(node.right);
        }
    }

    public void postorder(Node3 node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.println(node.data);
        }
    }

    public int countNode(Node3 root) {

        // base case
        if (root == null)
            return 0;

        // recursive call to left child and right child and
        // add the result of these with 1 ( 1 for counting the root)
        return 1 + countNode(root.left) + countNode(root.right);
    }

    public static void main(String[] args) {
        BinTree b1 = new BinTree();
        b1.root = new Node3(10);
        b1.inserData(b1.root, 8);
        b1.inserData(b1.root, 12);
        b1.inserData(b1.root, 9);
        b1.inserData(b1.root, 7);
        b1.postorder(b1.root);
        System.out.println(b1.countNode(b1.root));
        System.out.println(b1.minValue(b1.root));

    }
}
