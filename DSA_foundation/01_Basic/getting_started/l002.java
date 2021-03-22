import java.util.*;

public class l002{
    public static Scanner scn = new Scanner (System.in);
    public static void gradingSystem(int n){
        if (n > 90)
            System.out.println("excellent");
        else if(n > 80 && n <= 90)
            System.out.println("good");
        else if(n > 70 && n <= 80)
            System.out.println("fair");
        else if(n > 60 && n <= 70)
            System.out.println("meet expectation");
        else
            System.out.println("below par");
    }
    
    public static void main(String[] args){
        System.out.println("Give the input");
        int  n = scn.nextInt();
        System.out.println("Output is");
        gradingSystem(n);
    }
}

