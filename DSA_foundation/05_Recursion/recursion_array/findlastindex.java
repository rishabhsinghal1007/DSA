import java.io.*;
import java.util.*;

public class findlastindex {

    public static Scanner scn = new Scanner(System.in);

    public static int lastIndex(int[] arr, int idx, int data, int n) {
        if (idx == -1) return -1;
        if (arr[idx] == data) return idx;
        return lastIndex(arr, idx - 1, data, n);
    }
    
    public static void main(String[] args) throws Exception {
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();
        int data = scn.nextInt();
        int p = lastIndex(arr, n-1, data, n);
        System.out.println(p);
    }

}