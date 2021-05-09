import java.io.*;
import java.util.*;

public class minCost_Path {

    public static Scanner scn = new Scanner(System.in);

    public static void input(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                arr[i][j] = scn.nextInt();
            }
        }
    }

    public static void print(int[] arr) {
        for (int ele: arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void print2D(int[][] arr) {
        for (int[] a: arr) {
            print(a);
        }
        System.out.println();
    }

    public static int minCostPath(int[][] arr, int r, int c, int[][] dp, int[][] dir) {
        int n = arr.length, m = arr[0].length;
        if (r == n - 1 && c == m - 1) {
            return dp[r][c] = arr[r][c];
        }

        if (dp[r][c] != (int) 1e9)
            return dp[r][c];
            
        int minCost = (int) 1e9;
        for (int d = 0; d < dir.length; d++) {
            int x = r + dir[d][0];
            int y = c + dir[d][1];

            if (x >= 0 && y >= 0 && x < n && y < m)
                minCost = Math.min(minCost, minCostPath(arr, x, y, dp, dir) + arr[r][c]);
        }

        return dp[r][c] = minCost;
    }

    public static int minCostPath_DP(int[][] arr, int R, int C, int[][] dp, int[][] dir) {
           
        for (int r = arr.length - 1; r >= 0; r--) {
            for (int c = arr[0].length - 1; c >= 0; c--) {
                int n = arr.length, m = arr[0].length;
                if (r == n - 1 && c == m - 1) {
                    dp[r][c] = arr[r][c];
                    continue;
                }
                int minCost = (int) 1e9;
                for (int d = 0; d < dir.length; d++) {
                    int x = r + dir[d][0];
                    int y = c + dir[d][1];

                    if (x >= 0 && y >= 0 && x < n && y < m)
                        minCost = Math.min(minCost, dp[x][y] + arr[r][c]);
                }

               dp[r][c] = minCost;
            }
        }

        return dp[R][C];
    }

    public static void minCost() {
        // int a = scn.nextInt();
        // int b = scn.nextInt();
        // int[][] arr = new int[a][b];
        // input(arr);
        int[][] arr = { { 10, 33, 13, 15 }, { 22, 21, 4, 1 }, { 5, 0, 2, 3 }, { 0, 6, 14, 2 } };

        int n = arr.length, m = arr[0].length;
        int[][] dir = { { 0, 1 }, { 1, 0 }};

        int[][] dp = new int[n][m];

        for (int[] d : dp)
            Arrays.fill(d, (int) 1e9);

        System.out.println(minCostPath_DP(arr, 0, 0, dp, dir));
        print2D(dp);
    }

    public static void main(String[] args) {
        minCost();
    }
}