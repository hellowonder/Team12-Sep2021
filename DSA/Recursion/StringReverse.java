public class StringReverse {

  public static void printRev(String str, int idx) {
    if (idx == -1) {
      return;
    }
    System.out.print(str.charAt(idx));
    printRev(str, idx - 1);
  }

  public static void main(String[] args) {
    String s = "abcd";
    printRev(s, (s.length() - 1));
  }
}
