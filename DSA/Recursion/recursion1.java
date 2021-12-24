public class recursion1 {

  //printing 5 4 3 2 1
  public static void printNumb(int n) {
    if (n == 0) {
      return;
    }
    System.out.println(n);
    printNumb(n - 1);
  }

  //printing 1 2 3 4 5
  public static void printNumb1(int n) {
    if (n == 6) {
      return;
    }
    System.out.println(n);
    printNumb1(n + 1);
  }

  //sum of first n natural number
  public static void printSum(int i, int n, int sum) {
    if (i == n) {
      sum += i;
      System.out.println(sum);
      return;
    }
    sum += i;
    printSum(i + 1, n, sum);
    System.out.println(i);
  }

  //factorial
  public static int factorial(int n) {
    if (n == 1 || n == 0) {
      return 1;
    }
    int fact = factorial(n - 1);
    int factn = n * fact;
    return factn;
  }

  public static void main(String[] args) {
    System.out.println("printing in revere order 0 to 5 using recursion");
    printNumb(5);
    System.out.println("printing in normal way 0 to 5 using recursion");
    printNumb1(0);
    System.out.println(
      "printing sum of first n natural number using recursion"
    );
    printSum(1, 10, 0);

    System.out.println("printing factorial");
    System.out.println(factorial(5));
  }
}
