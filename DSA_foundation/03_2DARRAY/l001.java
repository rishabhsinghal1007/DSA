import java.util.Scanner;
import java.util.Arrays;

public class l001{

    public static Scanner scn = new Scanner(System.in);

    public static void input(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                arr[i][j] = scn.nextInt();
            }
        }
    }


    public static void display(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                System.out.print(arr[i][j] + " "); 
            }
            System.out.println();
        }  
    }

    public static int maximum(int[][] arr){
        int maxEle = -(int) 1e9;
        for(int[] ar : arr)
            for(int ele : ar){
                  if(ele > maxEle)
                     maxEle = ele ;
        }
            return maxEle;
    }

    public static boolean finddata(int[][] arr, int data) {
        for (int[] ar : arr)
            for (int e : ar)
                if (e == data)
                    return true;

        return false;
    }


    public static void main(String[] args) {
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        input(arr);
        // System.out.println(maximum(arr));
        display(arr);
        int e = scn.nextInt();
        System.out.println(finddata(arr,e));
    }
}