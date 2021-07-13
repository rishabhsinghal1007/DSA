// 1. You are given a 2d array where 0's represent water and 1's represent land. 
//      Assume every cell is linked to it's north, east, west and south cell.
// 2. You are required to find and count the number of islands.

import java.io.*;

public class L6_NoOfIslands {

    public static void dfs_island(int[][] mat, int[][] dir, int i, int j) {
        mat[i][j] = 0;

        for (int d = 0; d < 4; d++) {
            int r = i + dir[d][0];
            int c = j + dir[d][1];

            if (r >= 0 && c >= 0 && r < mat.length && c < mat[0].length && mat[r][c] == 1) {
                dfs_island(mat, dir, r, c);
            }
        }
    }

    public static int numberIsland(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int[][] dir = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1) {
                    dfs_island(mat, dir, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[m][n];

        for (int i = 0; i < arr.length; i++) {
            String parts = br.readLine();
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = Integer.parseInt(parts.split(" ")[j]);
            }
        }
        System.out.println(numberIsland(arr));
    }
}
