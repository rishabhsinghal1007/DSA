import java.io.*;
import java.util.*;

public class targetsumpair1 {

    public static void targetSumPair(int[] arr, int target, int si, int ei) {
        Arrays.sort(arr);
        while (si < ei) {
            int sum = arr[si] + arr[ei];
            if (sum > target)
                ei--;
            else if (sum < target)
                si++;
            else {
                System.out.println(arr[si] + ", " + arr[ei]);
                si++;
                ei--;
            }
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        targetSumPair(arr, target, 0, n - 1);
    }

}