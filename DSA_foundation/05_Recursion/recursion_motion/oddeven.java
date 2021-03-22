import java.util.Scanner;
public class oddeven{

    public static Scanner scn = new Scanner(System.in) ;

    public static void evenodd(int n){
        if(n == 0)
            return;
        if(n % 2 != 0){
            System.out.println(n);
        }
            evenodd(n-1);
        if(n % 2 == 0){
            System.out.println(n);
        }
    }

    public static void main(String[] args){
        int n = scn.nextInt();
        evenodd(n);
    }
}