import java.io.*;
import java.util.*;

public class max_array {
    public static Scanner scn = new Scanner(System.in);

    public static int maxOfArray(int[] arr, int idx) {
        if (idx == arr.length)
            return (int) - 1e9;

        return Math.max(arr[idx], maxOfArray(arr,idx+1));
    }

    public static void main(String[] args) throws Exception {
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();
        int max = maxOfArray(arr, 0);
        System.out.print(max);
    }

}