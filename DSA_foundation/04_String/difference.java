// abecd -> a1b3e-2c1d

import java.util.Scanner;

public class difference{
    public static Scanner scn = new Scanner(System.in);

    public static String differenceOfTwoString(String str){
        if(str.length() <= 1) return str;
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        for(int i = 1 ; i < str.length() ; i++){
            char ch0 = str.charAt(i-1);
            char ch1 = str.charAt(i);
            sb.append(ch1 - ch0);
            sb.append(ch1);
        }
        return sb.toString();
    }

    public static void main(String[] args){
        String str = scn.nextLine();
        System.out.print(differenceOfTwoString(str));
    }
}