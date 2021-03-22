// *       *       *       *       *       *       *
//         *                               *
//                 *               *
//                         *
//                 *       *       *
//         *       *       *       *       *
// *       *       *       *       *       *       *

import java.util.*;

public class pattern18{
    
    public static void pattern18(int row)
    {
        int nst = row;
        int nsp = 0 ;
        for(int r = 1 ; r <= row ; r++ )
        {
            for(int csp = 1 ; csp <= nsp ; csp++)
            {
                System.out.print("\t");
            }
            for(int cst = 1 ; cst <= nst ; cst++)
            {
                if(r>1 && r<=row/2 && cst>1 && cst<nst)
                {
                    System.out.print("\t");
                }
                else{
                    System.out.print("*\t");
                }
                
            }
            if(r<=row/2)
            {
                nsp++;
                nst-=2;
            }
            else
            {
                nsp--;
                nst+=2;
            }

            System.out.println();
        }
    }
     
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    pattern18(n);
 }
}