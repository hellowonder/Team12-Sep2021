
class BinaryTree {

    Node root;

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }

    }

    public BinaryTree() {

    }

    public BinaryTree(int d) {
        this.root = new Node(d);
    }

    static void preorder(Node node) {
        if (node == null)
            return;
        System.out.println(node.data);
        preorder(node.left);
        preorder(node.right);
    }

    void inorder(Node node) {
        if (node == null)
            return;
        inorder(node.left);
        System.out.println(node.data);
        inorder(node.right);

    }

    void postorder(Node node) {
        if (node == null)
            return;
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.data);
    }

    // Node add(int key) {
    // if (this.root == null) {
    // this.root = new Node(key);
    // }
    // }

    public static void main(String[] args) {
        BinaryTree b1 = new BinaryTree();
        b1.root = new Node(11);

        b1.root.left = new Node(22);
        b1.root.right = new Node(33);

        b1.root.left.left = new Node(44);
        b1.root.left.right = new Node(55);

        b1.root.right.left = new Node(66);
        b1.root.right.right = new Node(77);

        System.out.println("preorder");
        b1.preorder(b1.root);
        System.out.println("Inorder");
        b1.inorder(b1.root);
        System.out.println("postorder");
        b1.postorder(b1.root);
    }
}