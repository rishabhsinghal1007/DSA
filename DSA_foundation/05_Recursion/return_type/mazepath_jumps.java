import java.io.*;
import java.util.*;
public class mazepath_jumps{

    public static ArrayList < String > getMazePaths_Jumps(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList < String > base = new ArrayList < > ();
            base.add("");
            return base;
        }
        ArrayList < String > myAns = new ArrayList < > ();
        for (int jump = 1; jump + sc <= dc; jump++) {
            ArrayList < String > Horizontal = getMazePaths_Jumps(sr, sc + jump, dr, dc);
            for (String s: Horizontal) {
                myAns.add("h" + jump + s);
            }
        }
        for (int jump = 1; jump + sr <= dr; jump++) {
            ArrayList<String> Vertical = getMazePaths_Jumps(sr + jump, sc, dr, dc);
            for (String s: Vertical) {
                myAns.add("v" + jump + s);
            }
        }
        for (int jump = 1; jump + sc <= dc && jump + sr <= dr; jump++) {
            ArrayList<String> diagonal = getMazePaths_Jumps(sr + jump, sc + jump, dr, dc);
            for (String s: diagonal) {
                myAns.add("d" + jump + s);
            }
        }
        return myAns;
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList < String > ans = getMazePaths_Jumps(0, 0, n - 1, m - 1);
        System.out.println(ans);
    }
}