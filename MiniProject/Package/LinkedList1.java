package Package;

class Node {
    int data;
    Node next;

    Node() {
        next = null;
    }

    Node(int d) {
        data = d;
        next = null;
    }
}

public class LinkedList1 {

    static void printList(Node head) {
        Node current = head.next;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    static void insertElemnt(int data, Node head) {

        Node toInsert = new Node(data);
        if (head == null) {
            head = toInsert;
        } else {
            toInsert.next = null;
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = toInsert;
        }
    }

    static void deleteFirstElement(Node head) {
        System.out.println(head.data + " Deleted element");
        head = head.next;
    }

    public static void main(String[] args) {
        Node head = new Node();
        // deleteFirstElement(head);
        insertElemnt(20, head);
        // insertElemnt(30, head);
        printList(head);
    }
}
