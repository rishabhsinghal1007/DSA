import java.util.Scanner;
import java.util.Arrays;

public class sum{
    public static Scanner scn = new Scanner(System.in);

    public static void addTwoArrays(int[] a , int[] b){
        int n = a.length , m = b.length ;
        int[] ans = (Math.max(n,m)+1);

        int i = n-1 , j = m-1 , k = ans.length-1 ;
        int carry = 0;
        while(k>=0){
            int sum = carry;
            if(i>=0)
                sum += a[i--];
            if(j>=0)
                sum += b[j--];

            sum[k--] = ans % 10 ;
            carry = ans/10 ;
        }
        for(int l = 0 ; l < ans.length ; l++){
            if(l == 0 && ans[l] == 0)
                continue;
            System.out.println(ans[l]);
        }
    }
    public static void input(int[] arr)
    {
        for (int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = scn.nextInt();
        }
    }
    public static void main(String[] args)
    {
        int n = scn.nextInt() ;
        System.out.println("Enter the size of array1 ");
        int[] a = new int[n];
        System.out.println( "Enter the array ");
        input(a);

        int m = scn.nextInt() ;
        System.out.println("Enter the size of array1 ");
        int[] b = new int[m];
        System.out.println( "Enter the array ");
        input(b);

        System.out.println("The sum of two array is ");
        addTwoArrays(a,b);
    }
}