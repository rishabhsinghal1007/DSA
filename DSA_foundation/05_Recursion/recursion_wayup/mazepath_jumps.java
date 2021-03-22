import java.util.Scanner;
public class mazepath_jumps{

    public static void printMazePaths_Jumps(int sr, int sc, int dr, int dc, String ans) {
        if(sr == dr && sc == dc){
            System.out.println(ans);
            return;
        }
        
        for(int jump = 1 ; sc+jump <= dc ; jump++){
            printMazePaths_Jumps(sr,sc+jump,dr,dc,ans+"h"+jump);
        }
        for(int jump = 1 ; sr+jump <= dr ; jump++){
            printMazePaths_Jumps(sr+jump,sc,dr,dc,ans+"v"+jump);
        }
        for(int jump = 1 ; sc+jump <= dc && sr+jump <= dr ; jump++){
            printMazePaths_Jumps(sr+jump,sc+jump,dr,dc,ans+"d"+jump);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        printMazePaths_Jumps(0,0,n-1,m-1,"");
    }

}