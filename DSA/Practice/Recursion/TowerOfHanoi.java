class Recursion {
    static void toh(int n, char s, char inter, char d) {
        if (n == 1) {
            System.out.println("Disk " + n + " from " + s + " to " + d);
        } else {
            toh(n - 1, s, d, inter);
            System.out.println("Disk " + n + " from " + s + " to " + d);
            toh(n - 1, inter, s, d);
        }
    }
}

public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 3;
        Recursion.toh(n, 'A', 'B', 'C');
    }
}

/**
 * (3 , a b c) (2, a c b) = 2 from a to b (1 , a b c) = 1 from a to c
 * 
 * 
 */