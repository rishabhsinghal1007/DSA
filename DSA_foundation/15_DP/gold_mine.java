import java.io.*;
import java.util.*;

public class gold_mine {

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

    public static int goldMine_memo(int[][] arr, int r, int c, int[][] dp, int[][] dir) {
        if (c == arr[0].length - 1) {
            return dp[r][c] = arr[r][c];       
        }

        if (dp[r][c] != -1)
            return dp[r][c];

        int maxGold = 0;
        for (int d = 0; d < dir.length; d++) {
            int x = r + dir[d][0];
            int y = c + dir[d][1];

            if (x >= 0 && y >= 0 && x < arr.length && y < arr[0].length)
                maxGold = Math.max(maxGold, goldMine_memo(arr, x, y, dp, dir) + arr[r][c]);
        }

        return dp[r][c] = maxGold;
    }

    public static int goldMine_memo(int[][] arr) {
        int n = arr.length, m = arr[0].length;
        int[][] dir = { { 0, 1 }, { 1, 1 }, { -1, 1 } };

        int[][] dp = new int[n][m];
        for (int[] d: dp) {
            Arrays.fill(d, -1);
        }

        int maxGold = 0;
        for (int i = 0; i < n; i++) {
            maxGold = Math.max(maxGold, goldMine_memo(arr, i, 0, dp, dir));
        }

        print2D(dp);
        return maxGold;
    }

    // DP==============================================================


    public static int goldMine_DP(int[][] arr) {
        int n = arr.length, m = arr[0].length;
        int[][] dir = { { 0, 1 }, { 1, 1 }, { -1, 1 } };
        int[][] dp = new int[n][m];

        for (int c = arr[0].length - 1; c >= 0; c--) {
            for (int r = arr.length - 1; r >= 0; r--) {
                if (c == arr[0].length - 1) {
                    dp[r][c] = arr[r][c];
                    continue;
                }

                int maxGold = 0;
                for (int d = 0; d < dir.length; d++) {
                    int x = r + dir[d][0];
                    int y = c + dir[d][1];

                    if (x >= 0 && y >= 0 && x < arr.length && y < arr[0].length)
                        maxGold = Math.max(maxGold, dp[x][y] + arr[r][c]);
                }

                dp[r][c] = maxGold;
            }
        }

        int maxGold = 0;
        for (int i = 0; i < n; i++) {
            maxGold = Math.max(maxGold, dp[i][0]);
        }

        print2D(dp);
        return maxGold;
    }

    public static void goldMine() {
        int[][] arr = { { 10, 33, 13, 15 }, { 22, 21, 04, 1 }, { 5, 0, 2, 3 }, { 0, 6, 14, 2 } };
        // System.out.println(goldMine_memo(arr));
        System.out.println(goldMine_DP(arr));
    }

    public static void main(String[] args) {
        goldMine();
    }
}