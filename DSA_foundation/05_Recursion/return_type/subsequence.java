import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class subsequence {
    public static Scanner scn = new Scanner(System.in);

    public static ArrayList<String> gss(String str, int idx) {
        if (idx == str.length()) {
            ArrayList<String> base = new ArrayList < > ();
            base.add("");
            return base;
        }

        ArrayList<String> recAns = gss(str, idx + 1);

        ArrayList<String> myAns = new ArrayList<>(recAns);

        char ch = str.charAt(idx);
        for (String s: recAns) {
            myAns.add(ch + s);
        }
        return myAns;
    }

    public static void main(String[] args) throws Exception {
        String str = scn.next();
        System.out.println(gss(str, 0));
    }
}