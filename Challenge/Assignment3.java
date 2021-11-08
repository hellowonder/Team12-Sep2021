import java.util.*;

import java.util.*;

public class Assignment3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = input.nextLine();
        String arr[] = str.split("[ ]");

        int len = arr.length;
        int length;

        if (len == 1) {
            System.out.println(str.length());
        } else {
            System.out.println(arr[len - 1].length());
        }

    }
}
