class Node {
    int data;
    Node next = null;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class LinkedList4 {
    Node head;

    // insertion at head
    public void insertAtHead(int d) {
        Node node = new Node(d);
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    // isertion at last
    public void insertAtLast(int d) {
        Node node = new Node(d);
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

    // insertion after the given data
    public void insertAfter(int data, int d) {
        Node node = new Node(d);
        Node n = head;
        while (n.data != data && n != null) {
            n = n.next;
        }
        node.next = n.next;
        n.next = node;
    }

    // Deletion of first node
    public void DeleteHead() {
        Node n = head;
        System.out.println("Node " + n.data + " deleted successfully");
        head = head.next;
    }

    // Deletion of last node
    public void DeleteLast() {
        Node n = head;
        Node temp = null;
        while (n.next != null) {
            temp = n;
            n = n.next;
        }
        temp.next = null;
    }

    // Deletion of given node
    public void DeleteInBetween(int data) {
        Node n = head;
        if (data == head.data) {
            DeleteHead();
        } else {
            Node temp = null;
            while (n.data != data) {
                temp = n;
                n = n.next;
            }
            temp.next = n.next;
        }
    }

    // Revere the linked List
    public void reverseLinkedList() {
        Node current = head;
        Node previous = null;
        Node nxt = null;
        while (current != null) {
            nxt = current.next;
            current.next = previous;
            previous = current;
            current = nxt;
        }
        head = previous;
        // return head;
    }

    public boolean hasCycle() {
        Node fast = head;
        Node slow = head;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    // Finding middle Node
    public void MiddleNode() {
        Node slow = head;
        Node fast = head;
        Node temp = null;
        int count = 0;
        while (fast != null && fast.next != null) {
            count++;
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if (count % 2 == 1) {
            System.out.println("Mid Element is " + temp.data);
        } else {
            System.out.println("Mid Element is " + slow.data);
        }
    }

    // printing the linked list
    public void show() {
        Node n = head;
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }

    // // printig the linked list in reverse order
    // public void show(Node n) {

    // while (n != null) {
    // System.out.println(n.data);
    // n = n.next;
    // }
    // }

    public static void main(String[] args) {
        LinkedList4 list = new LinkedList4();
        list.insertAtHead(1);
        list.insertAtLast(2);
        list.insertAtLast(3);
        list.insertAtLast(4);
        list.insertAfter(4, 5);
        list.insertAtLast(6);
        list.insertAtLast(7);
        // list.show();
        // list.DeleteHead();
        // list.show();
        // list.DeleteLast();
        list.DeleteInBetween(5);
        list.show();
        list.MiddleNode();

        list.reverseLinkedList();
        list.show();
        if (list.hasCycle()) {
            System.out.println("loop is detected");
        } else {
            System.out.println("loop is not present");
        }
    }
}
