// Leetcode - 347
// Given an integer array nums and an integer k, return the k most frequent elements. 
    // You may return the answer in any order.
// Example 1:
    // Input: nums = [1,1,1,2,2,3], k = 2
    // Output: [1,2]

import java.io.*;
import java.util.*;

public class topKFreq{

    public static int[] topKFrequentElements(int[] nums, int k){

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele : nums){
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }
        
        // {val,freq}
        PriorityQueue<int[]> pq =new PriorityQueue<>((a, b) -> {
            return a[1] - b[1];
        });

        for(Integer e : map.keySet()) {
            int val = e;
            int freq = map.get(val);

            int[] arr = new int[]{val, freq};
            pq.add(arr);

            if(pq.size() > k)
                pq.remove();
        }

        int[] ans = new int[k];
        int idx = 0;
        while(pq.size() != 0){
            ans[idx++] = pq.remove()[0];
        }
        return ans;

        // Another Method ..........

        // HashMap<Integer, Integer> map = new HashMap<>();
        // for (int ele : nums)
        //     map.put(ele, map.getOrDefault(ele, 0) + 1);

        // PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
        //     return map.get(a) - map.get(b);
        // });

        // for (Integer e : map.keySet()) {
        //     pq.add(e);
        //     if (pq.size() > k)
        //         pq.remove();
        // }

        // int[] ans = new int[k];

        // int idx = 0;
        // while (pq.size() != 0) {
        //     ans[idx++] = pq.remove();
        // }

        // return ans;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the size of Array -> ");
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        System.out.println("Enter the Elements -> ");
        for (int i = 0; i < n; i++) {
           arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.print("Enter k -> ");
        int k = Integer.parseInt(br.readLine());
        System.out.println("The top k frequent elements are  ");
        int[] ans = topKFrequentElements(arr,k);
        print(ans);
    }
}