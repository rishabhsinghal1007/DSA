import java.util.*;

public class l001{
    public static Scanner scn = new Scanner(System.in);
    public static void printHello(){
        //System.out.println("Hi There !");
       // System.out.println("This is Rishabh");
    }

    public static void workWithDataType(){
        //int a = 10;
        //int b = 10;

        //System.out.println("Value of A : " + a);
       // System.out.println("Value of B : " + b);


    }

    public static void printZ(){
        // System.out.println("*****");
        // System.out.println("   * ");
        // System.out.println("  *  ");
        // System.out.println(" *   ");
        // System.out.println("*****");
    }
 

    public static void printFibo(int n)
    {
        int a=0,b=1;
        for(int i=1;i<=n;i++)
        {
            System.out.println(a);
            int sum = a+b;
            a=b;
            b=sum;
        }
    }

    public static void main(String[] args){
      
      System.out.println("Give the input");
       int n = scn.nextInt();
       System.out.println("Output is");
       printFibo(n);
    }   
}