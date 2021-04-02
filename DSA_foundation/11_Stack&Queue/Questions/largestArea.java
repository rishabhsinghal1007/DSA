import java.io.*;
import java.util.*;

public class largestArea{

    public static int[] NSOR(int[] arr){
        LinkedList<Integer> ll = new LinkedList<>();
        int n = arr.length;
        int[] ans = new int[n];
        Arrays.fill(ans,n);

        for(int i = 0 ; i < n ; i++){
            while(ll.size() != 0 && arr[ll.getFirst()] > arr[i]){
                ans[ll.removeFirst()] = i;
            }
            ll.addFirst(i);
        }
        return ans;
    }

    public static int[] NSOL(int[] arr){
        LinkedList<Integer> ll = new LinkedList<>();
        int n = arr.length;
        int[] ans = new int[n];
        Arrays.fill(ans,-1);

        for(int i = n-1 ; i >= 0 ; i--){
            while(ll.size() != 0 && arr[ll.getFirst()] > arr[i]){
                ans[ll.removeFirst()] = i;
            }
            ll.addFirst(i);
        }
        return ans;
    }

    public static int largestRectangleArea(int[] arr){
        int n = arr.length;
        int[] nsor = NSOR(arr);
        int[] nsol = NSOL(arr);

        int area = 0;

        for(int i = 0 ; i < n ;i++){
            int h = arr[i];
            int w = nsor[i] - nsol[i] - 1;
            area = Math.max(area ,h * w);
        }
        return area;
    }
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("The Area is : " + largestRectangleArea(a));
    }
}