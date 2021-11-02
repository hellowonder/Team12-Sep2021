
//Find the missing element in the list number is in form 1 to n and one number is missing and you have to find o
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
	int arr[] = {1 , 2, 3, 5, 6};
	int n = arr.length + 1;
        int miss_no = 0;

        int totalSum = n * (n + 1) / 2;
        int sumOfArray = 0;

        for (int i = 0; i < arr.length; i++) {
            sumOfArray = sumOfArray+ arr[i];
        }
        System.out.println("Missing Element is: " + (totalSum - sumOfArray));
    }
}
