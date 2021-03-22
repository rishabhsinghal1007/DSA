
import java.util.Scanner;
import java.util.Arrays;

public class Maxi{

    public static Scanner scn = new Scanner(System.in);
    public static int maximum(int[] arr){
        int maxEle = -(int) 1e9 ;
        for(int ele : arr){
            if(ele > maxEle)
                maxEle = ele;
        }
        return maxEle ;
    }

    public static void main(String[] args){
        System.out.println("Enter the size of array");
        int n = scn.nextInt();
        System.out.println("Enter the elements in array");
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++)
        arr[i] = scn.nextInt();
        System.out.println("The max element in array is " + maximum(arr));
        // System.out.println(maximum(arr));
    }
}