import java.util.Scanner;
import java.util.ArrayList;

public class palindrome{

    public static Scanner scn = new Scanner(System.in);

    public static boolean isPalindrome(String str){
        int i = 0 , j = str.length()-1 ;
        while(i<j){
            if(str.charAt(i++) != str.charAt(j--)) 
                return false;
            // i++;
            // j--;
        }
        return true;
    }

    public static void getAllSubstrings(String str){
        for(int i = 0 ; i < str.length() ; i++ )
            for(int len = 1 ; i + len <= str.length() ; len++){
                String s = str.substring(i,i+len);
                System.out.println(s);
            }
    }

    public static void getAllPalindromeSubstrings(String str){
        for(int i = 0 ; i < str.length() ; i++){
            for(int len = 1 ; i+len <= str.length(); len++){
                String s = str.substring(i,i+len);
                if(isPalindrome(s))
                    System.out.println(s);
            } 
        }
    }

    public static void main(String[] args){
        String str = scn.nextLine();
        // System.out.println(isPalindrome(str));
        // getAllSubstrings(str);
        getAllPalindromeSubstrings(str);
    }
}