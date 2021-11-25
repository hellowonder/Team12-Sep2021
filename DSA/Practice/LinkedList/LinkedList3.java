class Node1 {
    int data;
    Node1 next;

    // Node1(int data) {
    // this.data = data;
    // next = null;
    // }
}

public class LinkedList3 {
    Node1 head;

    public void insertion(int data) {
        // Node1 node = new Node1(data);

        Node1 node = new Node1();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node1 n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void insertAtStart(int data) {
        Node1 node = new Node1();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    public void show() {
        Node1 n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public static void main(String[] args) {
        LinkedList3 list = new LinkedList3();
        list.insertion(30);
        list.insertion(40);
        list.insertion(50);
        list.insertAtStart(20);
        list.show();
    }
}
