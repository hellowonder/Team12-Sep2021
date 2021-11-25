// class Node {
//     int data;
//     Node next;
// }

public class LinkedList2 {
    Node head;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void show() {
        Node node = head;

        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    public static void main(String[] args) {
        LinkedList2 list = new LinkedList2();
        list.insert(10);
        list.insert(20);
        list.insert(30);

        list.show();
    }
}
