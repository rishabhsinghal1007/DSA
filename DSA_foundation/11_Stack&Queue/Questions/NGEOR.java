//  NGEOR - Next Greater Element On Right. 

import java.io.*;
import java.util.*;
public class NGEOR{
    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();
        for(int val: a){
            sb.append(val + "\n");
        }
        System.out.print("Output :" + "\n" + sb);
    }

    public static int[] NGOR(int[] arr){
        int n = arr.length;
        LinkedList<Integer> st = new LinkedList<>();
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        
        for (int i = 0; i < n; i++) {
            while (st.size() != 0 && arr[st.getFirst()] < arr[i]) {
                ans[st.removeFirst()] = arr[i];
            }
            st.addFirst(i);
        }
        return ans;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(br.readLine());
        }
        System.out.println();
        int[] nge = NGOR(a);
        display(nge);
    }
}
