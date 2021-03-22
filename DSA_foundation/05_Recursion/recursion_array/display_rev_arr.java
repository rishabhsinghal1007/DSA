import java.io.*;
import java.util.*;

public class display_rev_arr {
    public static Scanner scn = new Scanner(System.in);

    public static void displayArr_rev(int[] arr, int idx, int n) {
        if (idx == n)
            return;
            
        displayArr_rev(arr, idx + 1, n);
        System.out.println(arr[idx]);

    }
    public static void main(String[] args) throws Exception {
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();
        displayArr_rev(arr, 0, n);
    }
}