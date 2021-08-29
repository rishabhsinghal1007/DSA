
// PRINT THE NUMBER LINEWISE
import java.util.*;

public class printnolinewise {

  public static Scanner scn = new Scanner(System.in);

  public static int countDigit(int n) {
    int count = 0;
    int num = n;
    while (num != 0) {
      num /= 10;
      count++;
    }
    return count;
  }

  public static void lineWiseDigit(int n) {
    int num = n;
    int len = countDigit(num);

    int div = 1;
    while (len-- > 1) {
      div *= 10;
    }

    while (div != 0) {
      System.out.println(n / div);
      n = n % div;
      div /= 10;
    }
  }

  public static void main(String[] args) {
    System.out.println("Give the input");
    int n = scn.nextInt();
    System.out.println("Output is");
    lineWiseDigit(n);
  }
}