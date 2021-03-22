import java.util.Scanner;
import java.util.Arrays;

public class wavetraversal{
    public static Scanner scn = new Scanner(System.in);

    public static void waveTraversalLeftRight(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;

        for(int i = 0 ; i < n ; i++){
            if(i % 2 == 0){
                for(int j = 0 ; j < m ; j++){
                    System.out.print(arr[i][j] + " ");
                }
            }else{
                for(int j = m-1 ; j >= 0 ; j--){
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }

    public static void input(int[][] arr){
        int n = arr.length;
        int m = arr[0].length ;
        for(int i = 0 ; i < n ; i++)
            for(int j = 0 ; j < m ; j++){
                arr[i][j] = scn.nextInt();
            }
    }

    public static void main(String[] args){
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        input(arr);
        waveTraversalLeftRight(arr);
    } 
}
