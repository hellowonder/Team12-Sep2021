import java.util.Scanner;

class Recursion {
    public static int multiplication(int n) {
        int i = 1;
        if (i == 10) {
            return 1;
        } else {

            return n * (i + 1);

        }
    }
}

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int data = Recursion.multiplication(n);
        System.out.println(data);
    }
}
