import java.util.Scanner;

public class inverse {
    public static Scanner scn = new Scanner(System.in);

    public static int[] Inverse(int[] arr) {
        int[] inv = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int v = arr[i];
            inv[v] = i;
            // inv[arr[i]] = i;
        }
        return inv;
    }

    public static void input(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\n");
        }
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        input(arr);
        int[] inv = Inverse(arr);
        display(inv);
    }
}