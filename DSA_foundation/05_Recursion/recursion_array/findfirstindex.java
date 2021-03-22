import java.io.*;
import java.util.*;

public class findfirstindex {
    public static Scanner scn = new Scanner(System.in);

    public static int firstIndex(int[] arr, int idx, int data, int n) {
        if (idx == n) return -1;
        if (arr[idx] == data) return idx;
        return firstIndex(arr, idx + 1, data,n);
    }
    public static void main(String[] args) throws Exception {
        int n = scn.nextInt(); // Array of size
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();
        int data = scn.nextInt();
        int p = firstIndex(arr, 0, data,n);
        System.out.println(p);
    }
}