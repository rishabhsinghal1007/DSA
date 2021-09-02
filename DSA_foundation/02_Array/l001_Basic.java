import java.util.Scanner;

public class l001_Basic {
    public static Scanner scn = new Scanner(System.in);

    public static void display2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void test1() {
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
            display2(arr);
        }
    }

    public static void main(String[] args) {
        test1();
    }
}