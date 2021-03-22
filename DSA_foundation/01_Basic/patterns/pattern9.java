import java.util.*;

public class pattern9 {
    
    public static void pattern9(int row)
    {
        int nsp = row-1;
        for(int i=1 ; i<=row ; i++)
        {
            for(int j=1 ; j<=row ; j++)
            {
            if(i==j || (i+j)==row+1)
             System.out.print("*\t");
            else
             System.out.print("\t");
            }
             System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern9(n);
    }
}

