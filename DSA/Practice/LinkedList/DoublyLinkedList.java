class Node2 {
    int data;
    Node2 prev;
    Node2 next;
}

public class DoublyLinkedList {

    Node2 head;

    public void insertAtFirst(int data) {
        Node2 newNode = new Node2();
        newNode.data = data;
        newNode.prev = null;
        newNode.next = null;
        if (head == null) {
            head = newNode;
        } else {
            Node2 n = head;
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void insertAtLast(int data) {

        Node2 newNode = new Node2();
        newNode.data = data;
        newNode.prev = null;
        newNode.next = null;

        if (head == null) {
            head = newNode;
        } else {
            Node2 n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = newNode;
            newNode.prev = n;
        }
    }

    public void deleteAtHead() {
        head = head.next;
        head.prev = null;
    }

    public void delete(int data) {
        Node2 temp = head;
        while (temp.data != data && temp != null) {
            temp = temp.next;
        }
        temp.prev.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }

    }

    public void show() {
        Node2 n = head;
        Node2 n2 = null;
        System.out.println("printing List in normal order");
        while (n != null) {
            n2 = n;
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
        System.out.println("printing in Reverse order");
        while (n2 != null) {
            System.out.print(n2.data + " ");
            n2 = n2.prev;
        }
    }

    public void insertAt(int n, int data) {
        Node2 node = new Node2();
        node.data = data;
        node.prev = null;
        node.next = null;

        Node2 temp = head;
        for (int i = 0; i < n - 1; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        node.prev = temp;

        if (temp.next != null) {
            temp.next.prev = node;
        }
        temp.next = node;
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertAtFirst(20);
        list.insertAtFirst(30);
        list.insertAtFirst(40);
        list.insertAtLast(10);
        list.insertAt(2, 50);
        // list.show();
        list.delete(10);
        list.show();
        // list.deleteAtHead();
        list.show();
    }
}
