// 0	
// 1	1	
// 2	3	5	
// 8	13	21	34	
// 55	89	144	233	377	

import java.util.*;

public class Main {

    public static void pattern12(int row)
    {
        int nst = 1;
        int a = 0;
        int b = 1;
        for(int r=1 ; r<=row ; r++)
        {
            for(int cst=1 ; cst<=nst ; cst++)
            {
                System.out.print(a + "\t");
                int sum = a + b;
                a = b;
                b = sum;
            }
            nst++;   
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern12(n);
    }
}