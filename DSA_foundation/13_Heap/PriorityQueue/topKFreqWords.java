// LeetCode 692

// Given a non-empty list of words, return the k most frequent elements.
// Your answer should be sorted by frequency from highest to lowest. 
// If two words have the same frequency, then the word with the lower alphabetical order comes first.

// Example 1:
// Input: ["i", "love", "leetcode", "i", "love", "coding"], k = 2
// Output: ["i", "love"]
// Explanation: "i" and "love" are the two most frequent words.
//     Note that "i" comes before "love" due to a lower alphabetical order.

import java.io.*;
import java.util.*;

public class topKFreqWords{

    public static List<String> topKFrequentWords(String[] words, int k){
        HashMap<String, Integer> map = new HashMap<>();
        for(String word : words)
            map.put(word, map.getOrDefault(word, 0) + 1);

        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> {
            if(map.get(a) == map.get(b))
                return b.compareTo(a);
            return map.get(a) - map.get(b);
        });

        for(String word : map.keySet()){
            pq.add(word);
            if(pq.size() > k)
                pq.remove();
        }

        List<String> ans = new ArrayList<>();
        int idx = pq.size();

        for(int i = 0 ; i < idx ; i++)
            ans.add("");
        while(pq.size() != 0)
            ans.set(--idx , pq.remove());

        return ans;
    } 

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int n = scn.nextInt();
        String[] arr = new String[n];
        System.out.println("Enter the Strings");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.next();
         }
        System.out.print("Enter k -> ");
        int k = scn.nextInt();
        System.out.println("The top k frequent elements are  ");
        List<String> ans = topKFrequentWords(arr,k);
        System.out.print("[");
        for(String val: ans){
            System.out.print(val + " , ");
        }
        System.out.print("]");
    }
}