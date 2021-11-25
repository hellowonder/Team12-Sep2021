import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 8, 6, 0, 3, 10 };
        int n = arr.length;
        System.out.println(Arrays.toString(arr));
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
