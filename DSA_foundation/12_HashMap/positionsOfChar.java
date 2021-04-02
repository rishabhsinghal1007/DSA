import java.io.*;
import java.util.*;

public class positionsOfChar{

    public static void positionOfAllChar(String str){
        HashMap<Character, ArrayList<Integer>> map = new HashMap<>();

        // for(int i = 0 ; i < str.length() ; i++){
        //     char ch = str.charAt(i);

        //     if(!map.containsKey(ch)){
        //         map.put(ch , new ArrayList<>());
        //     }
        //     map.get(ch).add(i);
        // }

        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);

            map.putIfAbsent(ch, new ArrayList<>());
            map.get(ch).add(i);
        }

    // System.out.println(map);

    for(Character ch : map.keySet()){
        System.out.println(ch + " -> " + map.get(ch));
    }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your Input : ");
        String str = scn.nextLine();
        positionOfAllChar(str);
    }
}