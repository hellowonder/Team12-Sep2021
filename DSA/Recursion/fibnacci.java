public class fibnacci {

  public static void finbonacci(int a, int b, int n) {
    if (n == 0) {
      return;
    }
    int c = a + b;
    System.out.println(c);
    finbonacci(b, c, n - 1);
  }

  public static void main(String[] args) {
    System.out.println("printing fibonacci sequencq till nth term*");
    int a = 0, b = 1;
    System.out.println(a);
    System.out.println(b);
    int n = 7;
    finbonacci(a, b, n);
  }
}
