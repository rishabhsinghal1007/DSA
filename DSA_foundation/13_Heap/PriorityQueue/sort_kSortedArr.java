import java.io.*;
import java.util.*;

public class sort_kSortedArr{

    public static void kSortedArray(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int idx = 0;
        for(int ele : arr){
            pq.add(ele);
            if(pq.size() > k)
                arr[idx++] = pq.remove();
        }

        while(pq.size() != 0){
            arr[idx++] = pq.remove();
        }

        for(int ele : arr){
            System.out.println(ele);
        }
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Elements");
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter the Value of k");
        int k = scn.nextInt();
        System.out.println("Output :");
        kSortedArray(arr,k);
    }
}