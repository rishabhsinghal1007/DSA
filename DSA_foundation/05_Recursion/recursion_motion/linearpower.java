import java.util.Scanner;

public class linearpower{

    public static Scanner scn = new Scanner(System.in);
    public static int powerlogarithmic(int x, int n) {
        if (n == 0)
            return 1;
        int smallAns = powerlogarithmic(x, n / 2);
        smallAns *= smallAns;
        return n % 2 == 0 ? smallAns : smallAns * x;
    }

    public static void main(String[] args) throws Exception {
        int x = scn.nextInt();
        int n = scn.nextInt();
        System.out.println(powerlogarithmic(x, n));

    }
}