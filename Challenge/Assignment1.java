import java.util.*;

public class Assignment1 {

    public static String convert(String str, int numberOfRows) {
        if ((numberOfRows == 1) || (str.length() <= numberOfRows))
            return str;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int numberOfRows = input.nextInt();
        String str2 = convert(str, numberOfRows);
        System.out.println(str2);
    }
}