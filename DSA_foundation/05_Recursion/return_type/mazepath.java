import java.io.*;
import java.util.*;

public class mazepath {
    public static Scanner scn = new Scanner(System.in);

    public static ArrayList < String > getMazePaths(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList < String > base = new ArrayList <> ();
            base.add("");
            return base;
        }
        ArrayList < String > myAns = new ArrayList <> ();
        if (sc + 1 <= dc) {
            ArrayList < String > Horizontal = getMazePaths(sr, sc + 1, dr, dc);
            for (String s: Horizontal) {
                myAns.add("h" + s);
            }
        }
        if (sr + 1 <= dr) {
            ArrayList < String > Vertical = getMazePaths(sr + 1, sc, dr, dc);
            for (String s: Vertical) {
                myAns.add("v" + s);
            }
        }
        return myAns;
    }


    public static void main(String[] args) throws Exception {
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList < String > ans = getMazePaths(0, 0, n - 1, m - 1);
        System.out.print(ans);
    }

}