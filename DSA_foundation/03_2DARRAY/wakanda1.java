import java.util.Scanner;
import java.util.Arrays;

public class wakanda1{

    public static Scanner scn = new Scanner(System.in);

    public static void waveTraversalUpAndDown(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        for (int j = 0; j < m; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i][j] + "\n");
                }
            } else {
                for (int i = n - 1; i >= 0; i--) {
                    System.out.print(arr[i][j] + "\n");
                }
            }
        }
    }

    public static void input(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
    }


    public static void main(String[] args) {
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        input(arr);
        waveTraversalUpAndDown(arr);
    }
}