public class BinarySearchDelete {
    static Node root;

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int d) {
            data = d;
        }
    }

    Node insertData(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.data) {
            root.left = insertData(root.left, key);
        } else if (key > root.data) {
            root.right = insertData(root.right, key);
        }
        return root;
    }

    Node deleteData(Node root, int key) {
        // if tree is empty
        if (root == null) {
            return root;
        }

        if (key < root.data) {
            root.left = deleteData(root.left, key);
        } else if (key > root.data) {
            root.right = deleteData(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.data = minValue(root.right);
            root.right = deleteData(root.right, root.data);
        }
        return root;

    }

    int minValue(Node root) {
        int minv = root.data;
        while (root.left != null) {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }

    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.println(root.data + " ");
            inorder(root.right);
        }
    }

    void inorder() {
        inorder(root);
    }

    void insert(int key) {
        root = insertData(root, key);
    }

    void delete(int key) {
        root = deleteData(root, key);
    }

    // void minValue() {
    // // int n = minValue(root);
    // System.out.println(minValue(root));
    // }

    public static void main(String[] args) {
        BinarySearchDelete b1 = new BinarySearchDelete();
        b1.insert(50);
        b1.insert(45);
        b1.insert(55);
        b1.insert(47);
        b1.insert(52);

        b1.delete(55);
        b1.inorder();
        b1.minValue();
    }
}
