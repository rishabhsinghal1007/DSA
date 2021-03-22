import java.io.*;
import java.util.*;

public class kpc {
    public static Scanner scn = new Scanner(System.in);

    static String[] codes = { ".;", "abc", "def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static int printKPC(String str, int idx, String ans) {
        if (idx == str.length()) {
            System.out.println(ans);
            return 1;
        }
        char ch = str.charAt(idx);
        String code = codes[ch - '0'];
        int count = 0;

        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            count += printKPC(str,idx+1,ans+c);
        }
        return count;
    }
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int ans = printKPC(str,0,"");
    }   

}