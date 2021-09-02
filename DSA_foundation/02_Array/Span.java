import java.util.Scanner;

public class Span {
    public static Scanner scn = new Scanner(System.in);

    public static int spanOfArray(int[] arr) {
        int maxEle = -(int) 1e8;
        int minEle = (int) 1e8;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxEle) {
                maxEle = arr[i];
            }
            if (arr[i] < minEle) {
                minEle = arr[i];
            }
        }
        int span = maxEle - minEle;
        // System.out.println("Span of array is : ");
        // System.out.println(span);
        return span;
    }

    public static void main(String[] args) {

        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int ans = spanOfArray(arr);
        System.out.println(ans);

    }
}