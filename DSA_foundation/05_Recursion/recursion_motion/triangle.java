import java.util.Scanner;
public class triangle{
    public static Scanner scn = new Scanner(System.in);

    public static void printTriangle(int cst,int nst , int nor , int n , int m){

        if(nor == n+1) return;

        if(cst == nst+1){
            System.out.println();
            printTriangle(1,nst+1,nor+1,n,m);
            return;
        }
        System.out.print("*");
        printTriangle(cst+1,nst,nor,n,m);
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int m = scn.nextInt();
        printTriangle(1,1,1,n,m);
    }
}