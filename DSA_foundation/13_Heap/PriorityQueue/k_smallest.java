import java.io.*;
import java.util.*;

public class k_smallest{

    public static void kSmallest(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> {
            return b - a;
        });

        for(int ele : arr){
            pq.add(ele);
            if(pq.size() > k){
                pq.remove();
            }
        }

        while(pq.size() != 0){
            System.out.println(pq.remove());
        }
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = scn.nextInt();
        }

        int k = scn.nextInt();
        kSmallest(arr,k);
    }
}