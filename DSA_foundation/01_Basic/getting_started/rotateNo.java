import java.util.*;
public class rotateNo{
    public static int countDigits(int n) {
        int count = 0;
        int num = n;
        while(num!=0)
        {
        num/=10;
        count++;
        }
        return count;
    }
    public static int rotateNumber(int n,int r){
        int len = countDigits(n);
        r = r % len ; 
        if (r<0) r = (r+len)%len;  
        int mul = 1, div = 1;
        for(int i=1;i<=len;i++)
        {
           if(i<=r)    
            div*=10;   
           else mul*=10;
        }
        int rem = n % div;
        int quo = n / div;
        return rem*mul + quo ;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        System.out.println(rotateNumber(n,k));
    }
}