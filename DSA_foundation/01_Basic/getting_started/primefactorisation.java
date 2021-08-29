import java.util.*;

public class primefactorisation {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scn.nextInt();
        if (n == 1)
            System.out.println("1");
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.println(i);
                n = n / i;
            }
        }
    }
}