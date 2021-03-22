import java.util.*;
import java.io.*;
public class binary{
    public static int binarySearch(int[] arr, int data, int si, int ei){
          while(si<ei)
          {
            int mid = (si+ei)/2;
            if(arr[mid] == data)
                return mid;
            else if(arr[mid] > data)
                ei = mid-1;
            else
                si = mid+1;
          }
          return -1;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = scn.nextInt();
        }
        int data = scn.nextInt();
        binarySearch(arr,data,0,n-1);
    } 
}