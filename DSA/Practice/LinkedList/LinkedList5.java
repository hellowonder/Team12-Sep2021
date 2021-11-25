class Node3 {
    int data;
    Node3 next;

    Node3(int d) {
        data = d;
    }
}

public class LinkedList5 {
    Node3 head;

    void insert(int d) {
        Node3 node = new Node3(d);
        if (head == null) {
            head = node;
        } else {
            Node3 n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    void insertAfter(int data, int d) {
        Node3 node = new Node3(d);
        Node3 n = head;
        Node3 temp = null;
        while (n.data != data && n != null) {
            temp = n;
            n = n.next;
        }
        node.next = n.next;
        n.next = node;
    }

    public void reverse() {
        Node3 current = head;
        Node3 prev = null;
        Node3 nxt = null;
        while (current != null) {
            nxt = current.next;
            current.next = prev;
            prev = current;
            current = nxt;
        }

        head = prev;
    }

    public void DeleteHead() {
        Node3 n = head;
        System.out.println("Node " + n.data + " deleted successfully");
        head = head.next;
    }

    public void delete(int data) {
        Node3 n = head;
        if (data == head.data) {
            DeleteHead();
        } else {
            Node3 temp = null;
            while (n.data != data && n != null) {
                temp = n;
                n = n.next;
            }
            temp.next = n.next;
        }
    }

    public void show() {
        Node3 n = head;
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }

    public static void main(String[] args) {
        LinkedList5 list = new LinkedList5();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insertAfter(40, 50);
        list.insertAfter(10, 15);
        // list.delete(40);
        list.show();
        // list.reverse();
        // list.show();
    }
}
