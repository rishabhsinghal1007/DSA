import java.io.*;
import java.util.*;

public class friends_pairing {

    public static void print(int[] arr) {
        for (int ele: arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static int friendsPairing_memo(int n, int[] dp) {
        if (n <= 1) {
            return dp[n] = 1;
        }

        if (dp[n] != 0) {
            return dp[n];
        }

        int single = friendsPairing_memo(n - 1, dp);
        int pairUp = friendsPairing_memo(n - 2, dp) * (n - 1);

        return dp[n] = single + pairUp;
    }

    public static int friendsPairing_DP(int N, int[] dp) {
        for (int n = 0; n <= N; n++) {
            if (n <= 1) {
                dp[n] = 1;
                continue;
            }

            int single = dp[n - 1]; 
            int pairUp = dp[n - 2] * (n - 1); 

            dp[n] = single + pairUp;
        }
        return dp[N];
    }

    public static void friendsPairing() {
        int n = 5;
        int[] dp = new int[n + 1];

        // System.out.println(friendsPairing_memo(n, dp));
        System.out.println(friendsPairing_DP(n, dp));

        print(dp);
    }

    public static void main(String[] args) throws Exception {
        friendsPairing();
    }
}