import java.util.Scanner;
import java.util.Arrays;

public class rotate{
    public static Scanner scn = new Scanner(System.in);


    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // si = starting index, ei = ending index
    public static void reverse(int[] arr, int si, int ei) {
        while (si < ei) {
            swap(arr, si++, ei--);
        }
    }

    public static void Rotate(int[] arr, int k) {
        int n = arr.length;
        k = (k % n + n) % n;
        
        reverse(arr,0,n - 1);
        reverse(arr,0,k - 1);
        reverse(arr,k, n - 1);
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void input(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
    }
    
    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        input(arr);
        int k = scn.nextInt();
        Rotate(arr,k);
        display(arr);
    }
}

