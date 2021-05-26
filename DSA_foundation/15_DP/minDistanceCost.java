import java.util.Arrays;

public class minDistanceCost {
    public static int minCostToConvert_DP(String s1, String s2, int N, int M, int[] cost, int[][] dp) {

        for (int n = 0; n <= N; n++) {
            for (int m = 0; m <= M; m++) {
                if (n == 0 || m == 0) {
                    dp[n][m] = (n == 0 ? m * cost[0] : n * cost[2]);
                    continue;
                }

                int insert = dp[n][m - 1];
                int replace = dp[n - 1][m - 1];
                int delete = dp[n - 1][m];

                if (s1.charAt(n - 1) == s2.charAt(m - 1))
                    dp[n][m] = replace;
                else
                    dp[n][m] = Math.min(Math.min(insert + cost[0], replace + cost[1]), delete + cost[2]);
            }
        }

        return dp[N][M];
    }

    // Cost of insert , replace and delete is {2,1,2};
    public static int minCostToConvert(String word1, String word2) {
        int n = word1.length(), m = word2.length();
        int[] cost = { 2, 3, 2 };
        int[][] dp = new int[n + 1][m + 1];
        for (int[] d : dp)
            Arrays.fill(d, -1);

        int ans = minCostToConvert_DP(word1, word2, n, m, cost, dp);
        return ans;
    }

    public static void main(String[] args) {
        String s1 = "Saturday";
        String s2 = "Sunday"; 

        System.out.println(minCostToConvert(s1, s2));
    }
}
