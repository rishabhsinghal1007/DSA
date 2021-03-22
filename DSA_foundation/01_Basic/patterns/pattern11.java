// 1
// 2       3
// 4       5       6
// 7       8       9       10
// 11      12      13      14      15

import java.util.*;

public class pattern11 {
    public static void pattern11(int row)
    {
        int nst = 1;
        int count = 1;
        for(int r=1 ; r<=row ; r++)
        {
            for(int cst=1 ; cst<=nst ; cst++)
            {
                System.out.print(count++ + "\t");
            }
            nst++;   
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern11(n);
    }
}