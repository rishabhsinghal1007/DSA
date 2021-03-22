import java.io.*;
import java.util.*;

public class displayarr {
    public static Scanner scn = new Scanner(System.in);

    public static void displayArr(int[] arr, int idx, int n) {
        if (idx == n)
            return;
        System.out.println(arr[idx]);
        displayArr(arr, idx + 1, n);

    }
    public static void main(String[] args) throws Exception {
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();
        displayArr(arr, 0, n);
    }
}