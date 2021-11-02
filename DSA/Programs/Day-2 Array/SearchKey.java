
// Take input from user and search it in array if it is present print the index of that element print -1;
import java.util.Scanner;

class SearchKey {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        // Size of the array
        System.out.println("Enter the size of the array: ");
        int n = input.nextInt();
        // Array Declaration
        int arr[] = new int[n];
        // Taking input from user
        System.out.println("Enter element in array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        // Finding Element in the array
        System.out.println("Enter a Key TO Search: ");
        int k = input.nextInt();

        boolean b = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                System.out.println("Key is present at index " + i);
                b = true;
                break;
            }
        }
        if (b == false) {
            System.out.println("Key is not present in the array: " + (-1));
        }

    }
}