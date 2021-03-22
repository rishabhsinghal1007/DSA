//   *	
// 	    *	
// 		    *	
// 		    	*	
// 			    	*	
import java.util.*;

public class pattern7 {
    
    public static void pattern7(int row)
    {
        int nsp = 0;
        for(int r=1; r<=row; r++)
        {
            for(int csp=1; csp<=nsp; csp++)
            {
                 System.out.print("\t");
            }
         System.out.println("*\t");
         nsp++;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern7(n);
    }
}