 import java.io.*;
import java.util.*;

public class Increasing {
    
    public static Scanner scn = new Scanner(System.in);

    public static void printIncreasing(int n) {
        if(n == 0) return;
        
        printIncreasing(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) throws Exception {
        int n = scn.nextInt();
        printIncreasing(n);
    }
}