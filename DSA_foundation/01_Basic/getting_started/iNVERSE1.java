import java.util.*;
public class iNVERSE1{
    public static Scanner scn = new Scanner(System.in);
    public static int countDigits(int n)
    {
        int count = 0;
        int num = n;
        while(num!=0)
        {
        num/=10;
        count++;
        }
        return count;
    }
    
    public static int inverse(int n){
        int res = 0;
        for(int i=1;n!=0;i++){
            int digit = n % 10;
            n /=10;
            res += i * Math.pow(10,digit-1);
        }
        return res;
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        System.out.println(inverse(n));
    }
}