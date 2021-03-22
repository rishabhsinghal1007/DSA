import java.io.*;
import java.util.*;

public class Decreasing {
    
    public static Scanner scn = new Scanner(System.in);

    public static void printDecreasing(int n) {
        if(n == 0) return ;
        
        System.out.println(n);
        printDecreasing(n-1);
        
        
    }
    
    public static void main(String[] args) throws Exception {
        int n = scn.nextInt();
        printDecreasing(n);
    }

}