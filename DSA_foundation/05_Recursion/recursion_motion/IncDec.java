import java.io.*;
import java.util.*;

public class Main {
    public static Scanner scn = new Scanner(System.in);

    public static void pdi(int n) {
        if(n == 0) 
            return ;
        
        System.out.println(n);
        pdi(n-1);
        System.out.println(n);

    }
    
    public static void main(String[] args) throws Exception {
        int n = scn.nextInt();
        pdi(n);
    }

}