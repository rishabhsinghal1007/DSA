import java.util.*;

public class pattern14 {
    
    public static void pattern14(int x)
    {
        for(int i = 1 ; i <= 10 ; i++)
        {
            int val = x * i;
            System.out.println(x + " * " + i + " = " + val);
        }
       
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern14(n);

       
    }
}