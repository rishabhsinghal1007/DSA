import java.io.*;
import java.util.*;

public class printFreq{

    public static void printFrequency(String str){
        HashMap<Character, Integer> map = new HashMap<>();

        // for(int i = 0 ; i < str.length() ; i++){
        //     char ch = str.charAt(i);
        //     if(map.containsKey(ch))
        //         map.put(ch,map.get(ch)+1);
        //     else
        //         map.put(ch,1);
        // }

        //  Another Method ........

        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0) + 1);
        }

        System.out.println(map);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your Input : ");
        String str = scn.nextLine();
        printFrequency(str);
    }
}