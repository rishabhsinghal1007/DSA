// https://www.geeksforgeeks.org/edit-distance-and-lcs-longest-common-subsequence/?ref=rp
// Where we are allowed only two operations insert and delete, find edit distance in this variation.

public class editDistance_Variation {
    public static int LCSS(String s1, String s2) {
        int N = s1.length(), M = s2.length();
        int[][] dp = new int[N + 1][M + 1];
        for (int n = 0; n <= N; n++) {
            for (int m = 0; m <= M; m++) {

                if (n == 0 || m == 0) {
                    dp[n][m] = 0;
                    continue;
                }

                if (s1.charAt(n - 1) == s2.charAt(m - 1))
                    dp[n][m] = dp[n - 1][m - 1] + 1;
                else
                    dp[n][m] = Math.max(dp[n - 1][m], dp[n][m - 1]);
            }
        }

        return dp[N][M];
    }

    public static int editDistanceVariation(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        int LCSS = LCSS(s1, s2);
        int ans = (n - LCSS) + (m - LCSS);
        return ans;
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "acd";
        System.out.println(editDistanceVariation(s1, s2));
    }
}
