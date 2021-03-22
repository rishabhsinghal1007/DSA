import java.util.Scanner;
public class rectangle{
    public static Scanner scn = new Scanner(System.in);

    public static void printRectangle(int cst,int nst , int nor , int n , int m){

        if(nor == n+1) return;

        if(cst == nst+1){
            System.out.println();
            printRectangle(1,nst,nor+1,n,m);
            return;
        }
        System.out.print("*");
        printRectangle(cst+1,nst,nor,n,m);
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int m = scn.nextInt();
        printRectangle(1,m,1,n,m);
    }
}