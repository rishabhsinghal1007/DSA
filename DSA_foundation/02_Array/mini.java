import java.util.Scanner;
import java.util.Arrays;

public class mini{
    public static Scanner scn = new Scanner(System.in);
    public static int minimum(int[] arr){
        int minEle = (int) 1e9;
        for(int ele : arr)
        {
            if(ele < minEle)
                minEle = ele;
        }
        return minEle;
    } 


    public static void input(int[] arr){
        for(int i = 0 ; i < arr.length ; i++)
        arr[i] = scn.nextInt();
    }

    public static void main(String[] args){
        System.out.println("Enter the size of Array");
        int n = scn.nextInt();
        System.out.println("Enter the elements in Array");
        int[] arr = new int[n];
        input(arr);
        System.out.println("The min ele is");
        System.out.println(minimum(arr));
    }     
} 