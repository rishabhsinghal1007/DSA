import java.util.*;

public class reverse {

   public static Scanner scn = new Scanner(System.in);

   public static void main(String[] args) {
      int n = scn.nextInt();

      while (n > 0) {
         int digit = n % 10;
         System.out.print(digit);
         n = n / 10;
      }
   }
}