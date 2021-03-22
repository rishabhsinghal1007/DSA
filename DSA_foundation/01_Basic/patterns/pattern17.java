// 	    	*	
// 		    *	*	
//  *	*	*	*	*	
// 	    	*	*	
// 		    *	

import java.util.*;

public class pattern17{
    
    public static void pattern17(int row)
    {
        int nst = 1 ;
        int nsp = row/2;
        for(int r = 1 ; r <= row ; r++ )
        {
            for(int csp = 1 ; csp <= nsp ; csp++ )
            {
                if(r == row/2 + 1)
                {
                    System.out.print("*\t");
                }
                else
                 {
                     System.out.print("\t");
                 }
            }
            for(int cst = 1 ; cst <= nst ; cst++ )
            {
                System.out.print("*\t");
            }
            if(r<=row/2)
            {
                 nst++;
            }
            else 
            {
                nst--;
            }
             System.out.println();
        }
    }
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    pattern17(n);
 }
}