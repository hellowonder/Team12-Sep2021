class BinaryDelete {
    Node root;

    static class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = right = null;
        }
    }

    void PreOrder(Node n) {
        if (n == null)
            return;
        System.out.print(n.data + " ");
        PreOrder(n.left);
        PreOrder(n.right);
    }

    void InOrder(Node n) {
        if (n == null)
            return;
        InOrder(n.left);
        System.out.print(n.data + " ");
        InOrder(n.right);
    }

    void PostOrder(Node n) {
        if (n == null)
            return;
        PostOrder(n.left);
        PostOrder(n.right);
        System.out.print(n.data + " ");
    }

    void PreOrder() {
        PreOrder(root); // Root,LC,RC
    }

    void InOrder() {
        InOrder(root); // LC,Root,RC
    }

    void PostOrder() {
        PostOrder(root); // LC,RC,Root
    }

    Node InsertData(Node root, int key) {
        // check if tree is Empty
        if (root == null) {
            root = new Node(key);
            return root;
        }
        // if root exist then compare element with root
        if (key <= root.data)
            root.left = InsertData(root.left, key); // for left subtree
        else
            root.right = InsertData(root.right, key); // for right subtree
        return root;

    }

    Node DeleteData(Node root, int key) {
        // when tree is empty
        if (root == null) {
            return root;
        }
        // Travesing
        if (key < root.data) {
            root.left = DeleteData(root.left, key);
        } else if (key > root.data) {
            root.right = DeleteData(root.right, key);
            // return root;
        }

        // for case 1st & 2nd condition of deletion
        else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // code for 3rd condition
            root.data = minvalue(root.right);
            // deleting the element in in-order and replace it with successor node
            root.right = DeleteData(root.right, root.data);
        }
        return root;
    }
    /*
     * 
     * dd(r(7),7) == return null dd(r(8),7) == assign null to the left of node 8
     * dd(r(5),5) ---- minvalue(8) op as 7 //////// rooot 7 dd(r(10),5) dlete(5)
     * 
     * 
     * 
     * delete with 1 node dd(r15.15) ==> node 13 dd(r20,15) dd(r12,15) dd(r10,15)
     * delete(15)
     */

    int minvalue(Node root) {
        int x = root.data;
        while (root.left != null) {
            x = root.left.data;
            root = root.left;
        }
        return x;
    }

    void Insert(int key) {
        root = InsertData(root, key);
    }

    void Delete(int key) {
        root = DeleteData(root, key);
    }

    public static void main(String[] args) {
        BinaryDelete b1 = new BinaryDelete();
        b1.Insert(25);
        b1.Insert(36);
        b1.Insert(40);
        b1.Insert(20);
        b1.Insert(10);
        b1.Insert(30);
        // b1.Insert(22);
        // b1.Insert(5);
        // b1.Insert(28);
        // b1.Insert(37);
        // b1.Insert(48);
        // b1.Insert(37);
        // b1.Insert(12);
        // b1.Insert(1);
        // b1.Insert(15);
        // b1.Insert(8);
        // b1.Insert(50);
        // b1.Insert(45);

        b1.Delete(36);
        // b1.Delete(25);

        System.out.println("Preorder : ");
        b1.PreOrder();
        System.out.print("\n" + "_".repeat(48) + "\n");

        System.out.println("\nInorder : ");
        b1.InOrder();
        System.out.print("\n" + "_".repeat(48) + "\n");

        System.out.println("\nPostorder :      ");
        b1.PostOrder();
        System.out.print("\n" + "_".repeat(48) + "\n");
    }
}
