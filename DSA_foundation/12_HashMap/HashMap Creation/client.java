import java.io.*;
import java.util.*;

public class client {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        HashMap<Character, ArrayList<Integer>> map = new HashMap<>();
        String str = "asdasasaaasskacbasmcbasmcasbcjhcbsahcjhcsvhcsHVcsvhjcks";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.putIfAbsent(ch, new ArrayList<>());
            map.get(ch).add(i);
        }

        for(Character ch : map.keySet()){
            System.out.println(ch + " -> " + map.get(ch));
        }
    }
}