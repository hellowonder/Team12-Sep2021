import java.util.*;

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

class LinkedList1 {

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
}

class UserDefinedException extends Exception {
    public UserDefinedException() {

    }

    public UserDefinedException(String s) {
        // Call constructor of parent Exception
        super(s);
    }
}

public class MiniProject {

    // Genrate Secret Number from 0 to 100
    public static int secretNumber() {
        int secretNumber;
        secretNumber = (int) (Math.random() * 100 + 1);
        return secretNumber;
    }

    // Taking input from user;
    public static int GuessNumber() {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        return number;
    }

    public static void main(String[] args) {
        Node head = new Node();
        System.out.println("Welcome to the virtual gaming world.");
        System.out.println("Hint: Secret Number is in a range of  0 to 100");

        int secretNumber = secretNumber();
        int GuessNumber = 0, count = 10;
        boolean check = false;

        System.out.println("");
        System.out.println("You have to find the secret number within 10 attempts");

        int i, j = 10;
        for (i = 1; i <= j; i++) {
            System.out.println("Enter Guess Number: ");

            // Exception Handling
            try {
                GuessNumber = GuessNumber();
                if ((GuessNumber < 0) || (GuessNumber > 100)) {
                    throw new UserDefinedException("Value should be in range of 0 to 100");
                }
            } catch (UserDefinedException ex) {
                System.out.println(ex.getMessage());
                check = true;
            } catch (Exception ex) {
                System.out.println("Invalid Input. ");
                check = true;
            }

            // Range Suggestion
            if (check == false) {
                if (GuessNumber < secretNumber) {
                    LinkedList1.insertElemnt(GuessNumber, head);
                    System.out.println("Number is so small");
                    System.out.println();
                } else if (GuessNumber > secretNumber) {
                    LinkedList1.insertElemnt(GuessNumber, head);
                    System.out.println("Number is so large");
                    System.out.println();
                } else if (GuessNumber == secretNumber) {
                    LinkedList1.insertElemnt(GuessNumber, head);
                    System.out.println("Congrats, Your guess is correct");
                    System.out.println("Total Earn Points for this game is: " + (count * 10));
                    System.out.println();
                    break;
                }
                System.out.println("Total number of remaining attempt!: " + (--count));
            } else {
                System.out.println("Total number of remaining attempt!: " + (--count));
            }
        }
        System.out.println("These are the following Guess you Enter:");
        LinkedList1.printList(head);
    }
}