//  1                                               1
//  1       2                               2       1
//  1       2       3               3       2       1
//  1       2       3       4       3       2       1

import java.util.*;

public class pattern16{
    
    public static void pattern16(int row)
    {
        int nst = 1 ;
        int nsp = 2*row-3;
        for(int r = 1 ; r <= row ; r++ )
        {
            int count = 1;
            for(int cst = 1 ; cst <= nst ; cst++)
            {
                System.out.print(count + "\t");
                count++;
            }
            for(int csp = 1 ; csp <= nsp ; csp++)
            {
                System.out.print("\t");
            }
            if(r == row)
            {
                nst--;
                count--;
            }
          
            for(int cst = 1 ; cst <= nst ; cst++)
            {
                count--;
                System.out.print(count +"\t");
            }
            nst++;
            nsp-=2;
            
            System.out.println();
        }
    }

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    pattern16(n);
 }
}