
public class BinarySearch {
    static int bsearch(int arr[], int key) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (key == arr[mid]) {
                return mid;
            } else if (key > arr[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80 };
        int key = 80;
        int res = bsearch(arr, key);
        if (res == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Found!!!");
        }
    }
}