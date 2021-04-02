import java.io.*;
import java.util.*;

public class duplicateBrackets1 {

   public static boolean duplicateBrackets1(String str) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ')') {
                st.push(str.charAt(i));
                continue;
            }

            boolean flag = false;
            while (st.size() != 0 && st.peek() != '(') {
                flag = true;
                st.pop();
            }

            if (!flag && st.size() != 0 && st.peek() == '(')
                return true;

            if (st.size() != 0)
                st.pop();
        }
        return false;
    }
    
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(duplicateBrackets1(str));
    }

}