import java.io.*;
import java.util.*;

public class allindices1 {
    public static Scanner scn = new Scanner(System.in);
    public static int[] allIndices(int[] arr, int data, int idx, int fsf) {
        if (idx == arr.length)
            return new int[fsf];
        if (arr[idx] == data) {
            int[] iarr = allIndices(arr, data, idx + 1, fsf + 1);
            iarr[fsf] = idx;
            return iarr;
        } else {
            int[] iarr = allIndices(arr, data, idx + 1, fsf);
            return iarr;
        }
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();
        int data = scn.nextInt();
        int[] iarr = allIndices(arr, data, 0, 0);

        if (iarr.length == 0) {
            System.out.println();
            return;
        }
        for (int i = 0; i < iarr.length; i++) {
            System.out.println(iarr[i]);
        }
    }
}