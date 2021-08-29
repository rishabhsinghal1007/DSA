import java.util.*;

public class prime {
    public static Scanner scn = new Scanner(System.in);

    public static boolean isPrime_(int num) {
        boolean prime = true;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

    public static void isPrime() {
        int n = scn.nextInt();
        boolean ans = isPrime_(n);
        if (ans)
            System.out.println("prime");
        else
            System.out.println("not prime");
    }

    public static void main(String[] args) {
        int t = scn.nextInt();
        for (int i = 0; i < t; i++) {
            isPrime();
        }
    }
}