import java.io.*;
import java.util.*;
public class equiset {

    public static void printEquiset(int[] arr, int idx, int sum1, int sum2, String set1, String set2) {
        if(idx == arr.length) {
            if(sum1 == sum2){
                System.out.println(sum1 + " = " + sum2);
            }
        }
        // int count = 0;
        printEquiset(arr, idx+1, sum1 + arr[idx], sum2, set1 + arr[idx], set2);
        printEquiset(arr, idx+1, sum1, sum2 + arr[idx], set1, set2 + arr[idx]);
    }
    
    public static void main(String[] args) {
        int[] arr = { 10 , 30 , 20 , 50 , 90 };
        printEquiset(arr,0,0,0,"","");
    }
}