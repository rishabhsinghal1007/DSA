import java.io.*;
import java.util.*;
public class nearestEle{
        public static int nearestElement(int[] arr, int data, int si, int ei){
            if(data > arr[ei])
                return arr[ei];
            else if(data < arr[si])
                return arr[si];

            while(si <= ei){
                int mid = (si + ei) / 2;
                if(arr[mid] == data)
                    return mid;
                else if (arr[mid] < data)
                    si = mid + 1;
                else
                    ei = mid - 1; 
            }

            return (arr[si] - data <= data -arr[ei] ? arr[si] : arr[ei] );
        }

        public static void main(String[] args) throws Exception {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
            }
            int data = scn.nextInt();
            int a = nearestElement(arr, data, 0, n - 1);
            System.out.println(a);
        }
}