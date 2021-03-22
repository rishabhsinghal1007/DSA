// Question
//  1. You will be given a non negative integers' array and an intger S
//  2. You can either make an integer positive or negative
//  3. Your aim is to make sum of all the elements a given target sum (S)
//  4. Return number of ways to make to assign symbols to make sum of elements equal to target S
//  5. Input and output is handled for you
//  6. It is a functional problem ,please do not modify main()

// Sample Input
// 8
// 6 3 7 5 5 8 4 8 
// 6

// Sample Output
// 12

import java.util.*;

public class targetsum {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = scn.nextInt();
        int S = scn.nextInt();
        System.out.println(findTargetSumWays(nums, S, 0));
    }

    public static int findTargetSumWays(int[] nums, int S, int idx) {
        if (idx == nums.length) {
            return S == 0 ? 1 : 0;
        }
        int count = 0;
        count += findTargetSumWays(nums, S - nums[idx], idx + 1);
        count += findTargetSumWays(nums, S - (-nums[idx]), idx + 1);
        return count;
    }
}