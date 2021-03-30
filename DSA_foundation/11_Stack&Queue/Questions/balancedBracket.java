import java.util.Stack;
import java.util.Scanner;

public class balancedBracket{

    public static boolean isBalancedBrackets(String str){
        Stack<Character> st = new Stack<>();

        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);

            if(ch == '(' || ch == '{' || ch == '[')
                st.push(ch);
            else if(ch == ')' || ch == '}' || ch == ']'){
                if(st.size() == 0)
                    return false;
                else if(ch == ')' && st.peek() != '(')
                    return false;
                else if(ch == '}' && st.peek() != '{')
                    return false;
                else if(ch == ']' && st.peek() != '[')
                    return false;
                else
                    st.pop();
            }
        }
        return st.size() ==  0;
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(isBalancedBrackets(str));
    }
}