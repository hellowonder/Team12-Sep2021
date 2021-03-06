
//project name: GuessGame
//Name: Shubham Mandlik  Roll No: 210940320114
//Name: Varunakar Shukla  Roll No: 210940520113
import java.util.Scanner;

class Node {
    int data;
    Node next = null;

    Node(int d) {
        data = d;
        next = null;
    }
}

class LinkedList4 {
    Node head;

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

    // printing the linked list
    public void show() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
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

        LinkedList4 list = new LinkedList4();

        System.out.println("Welcome!");
        System.out.println("Hint: Secret Number is in a range of  0 to 100");

        int secretNumber = secretNumber();
        int GuessNumber = 0, count = 10;
        // boolean check = false;

        System.out.println("");
        System.out.println("You have to find the secret number within 10 attempts");

        int i, j = 10;
        for (i = 1; i <= j; i++) {
            boolean check = false;
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
                    list.insertAtLast(GuessNumber);
                    System.out.println("Hints: Number is so small");
                    System.out.println();
                } else if (GuessNumber > secretNumber) {
                    list.insertAtLast(GuessNumber);
                    System.out.println("Hints: Number is so large");
                    System.out.println();
                } else if (GuessNumber == secretNumber) {
                    list.insertAtLast(GuessNumber);
                    System.out.println(" ");
                    System.out.println("_".repeat(48));
                    System.out.println("Congrats, Your guess is correct");
                    System.out.println("Total Earn Points for this game is: " + (count * 10));
                    // System.out.println();
                    break;
                }
                System.out.println("Total number of remaining attempt!: " + (--count));

            } else {
                System.out.println("Total number of remaining attempt!: " + (--count));
            }
        }
        System.out.println("_".repeat(48));
        if (count == 0) {
            System.out.println("You Loss!");
        }
        System.out.println("Total number you entered!");
        list.show();
    }
}