// class Node {
//     int data;
//     Node next;
// }

public class LinkedList1 {
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

    public void delete(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node n = head;
            Node n1 = null;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
            System.out.println("n1 " + n1.data);
        }
    }

    public void deleteData(int data) {
        Node n = head;
        Node prev = null;

        while (n != null && n.data != data) {
            prev = n;
            n = n.next;
        }

        prev.next = n.next;
    }

    public void show() {
        Node node = head;

        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    public void insertAt(int index, int data) {
        Node node = new Node();
        node.data = data;
        node.next = head;

        Node n = head;
        for (int i = 0; i < index - 1; i++) {
            n = n.next;
        }
        node.next = n.next;
        n.next = node;
    }

    public void Mid() {
        Node slow = head;
        Node fast = head;
        Node data = null;
        int count = 1;
        while (fast != null && fast.next != null) {
            // System.out.println(node.data);
            count++;
            data = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if (count % 2 == 0) {
            System.out.println("Mid data " + data.data);
        } else {
            System.out.println("Mid Element is " + slow.data);
        }
    }

    public void Mid1() {
        Node d = head;
        int curr = 0;
        while (d != null && d.next != null) {
            curr++;
            d = d.next;
        }

        int mid = curr / 2;
        if (curr % 2 == 1)
            mid++;

        Node e = head;
        for (int i = 0; i < mid; i++) {
            e = e.next;
        }
        System.out.println("Mid Element is " + e.data);
    }

    public static void main(String[] args) {
        LinkedList1 list = new LinkedList1();
        list.insert(18);
        list.insert(7);
        list.insert(15);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        // list.insertAtStart(25);
        // list.insertAt(2, 55);
        // list.delete(2);

        list.show();
        list.Mid();
        list.Mid1();
    }
}