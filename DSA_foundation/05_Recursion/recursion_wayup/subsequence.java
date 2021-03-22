import java.io.*;
import java.util.*;

public class subsequence {
    public static Scanner scn = new Scanner(System.in);
    public static void printSS(String str, int idx, String ans) {
        if (idx == str.length()) {
            System.out.println(ans);
            return;
        }

        printSS(str, idx + 1, ans + str.charAt(idx));
        printSS(str, idx + 1, ans);
    }

    public static void main(String[] args) throws Exception {
        String str = scn.next();
        printSS(str, 0, "");
    }
}