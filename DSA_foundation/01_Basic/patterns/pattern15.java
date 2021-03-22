//          1	
//      2	3	2	
//  3	4	5	4	3	
//      2	3	2	
//          1	
import java.util.*;

public class pattern15 {
    
    public static void pattern15(int row)
    {
        int nst = 1;                                  
        int nsp = row/2 ;                                              
        for(int r=1 ; r<=row ; r++)
        {
            for(int csp=1 ; csp<=nsp ; csp++)
            {
            System.out.print("\t");
            }
            int count = r;
            if( r > (row / 2) + 1)
                count = row - r + 1;
            for(int cst=1 ; cst<=nst ; cst++)
            {
                System.out.print(count + "\t");
                
                if(cst <= nst/2) count++;
                else count--;
            }
            if(r<=row/2)
            {
                nst+=2;
                nsp--;
            }
            else
            {
                nst-=2;
                nsp++;
            }
            System.out.println();
        }
   }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern15(n);

    }
}