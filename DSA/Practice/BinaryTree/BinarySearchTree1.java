class Node {
    int data;
    Node left;
    Node right;

    Node(int d) {
        data = d;
    }
}

public class BinarySearchTree1 {
    Node root;

    public void preorder(Node node) {
        if (node != null) {
            System.out.println(" " + node.data);
            preorder(node.left);
            preorder(node.right);
        }
    }

    public void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.println(" " + node.data);
            inorder(node.right);
        }
    }

    public void postorder(Node node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.println(" " + node.data);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree1 b1 = new BinarySearchTree1();
        b1.root = new Node(11);

        b1.root.left = new Node(22);
        b1.root.right = new Node(33);

        b1.root.left.left = new Node(44);
        b1.root.left.right = new Node(55);

        b1.root.right.left = new Node(66);
        b1.root.right.right = new Node(77);
        System.out.println("_".repeat(50));
        System.out.println("preorder");
        b1.preorder(b1.root);

        System.out.println("_".repeat(50));
        System.out.println("inorder");
        b1.inorder(b1.root);

        System.out.println("_".repeat(50));
        System.out.println("postorder");
        b1.postorder(b1.root);
    }
}
