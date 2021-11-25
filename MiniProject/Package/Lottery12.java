import java.util.Scanner;
import java.io.*;

public class Lottery12 {
    public static void main(String[] args) throws IOException {
        String playAgain;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = s.nextLine();
        do {
            System.out.println("Welcome to CDAC Lottery");
            int array1[] = new int[6];
            for (int j = 0; j < array1.length; j++) {
                array1[j] = (int) (Math.random() * 14534 % 9);
            }
            System.out.println("Enter 6 numbers within range of 0 to 9");
            int n = 6;
            int[] array = new int[6];

            for (int i = 0; i < n; i++) {
                array[i] = s.nextInt();
            }

            int count = 0;
            for (int k = 0; k < array1.length; k++) {
                if (array1[k] == array[k])
                    count++;
            }
            System.out.println("Lottery winning numbers are ");
            for (int x : array1) {
                System.out.print(x + " ");
            }
            System.out.println();

            if (count == 6)
                System.out.println(name + "Congratulations you have won !!!");
            else {
                System.out.println(name + " you lost");
                System.out.println("Unfortunately only " + count + " digits are matched");
            }
            System.out.println("Thank you for playing !!! ");
            System.out.println("Would you like to continue?(yes/no)");

            playAgain = s.next();
        } while (playAgain.equalsIgnoreCase("yes"));
    }
}