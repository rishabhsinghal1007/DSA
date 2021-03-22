import java.util.*;
  
  public class benjaminBulbs{
     public static Scanner scn = new Scanner(System.in);
     public static void benjaminBulbs(int n){
      for(int i=1 ; i*i<=n ; i++)
     {
        System.out.println(i*i);
     }
   }  
      public static void main(String[] args) {
      System.out.println("Give the input");
      int n = scn.nextInt();
      System.out.println("Output is");
      benjaminBulbs(n);
   }
}