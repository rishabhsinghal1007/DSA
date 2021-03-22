// 1	
// 1	1	
// 1	2	1	
// 1	3	3	1	
// 1	4	6	4	1	

import java.util.*;
public class pattern13{
    
   public static void pattern13(int row)
    {
        for(int n=0 ; n<row ; n++)
        {
            int val = 1;
            for(int r=0 ; r<=n ; r++)
            {
                System.out.print(val + "\t");
                val = ((n-r)*val)/(r+1);
            }
               
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern13(n);
    }
}