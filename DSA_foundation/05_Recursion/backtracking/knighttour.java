// QUESTION
// 1. You are given a number n, the size of a chess board.
// 2. You are given a row and a column, as a starting point for a knight piece.
// 3. You are required to generate the all moves of a knight starting in (row, col) such that knight visits 
//      all cells of the board exactly once.
// 4. Complete the body of printKnightsTour function - without changing signature - to calculate and 
//      print all configurations of the chess board representing the route
//      of knight through the chess board. Use sample input and output to get more idea.

// Note -> When moving from (r,c) to the possible 8 options give first precedence to (r - 2, c + 1) and 
//                move in clockwise manner to
//                explore other options.

//   Input Format
//   A number n
//   A number row
//   A number col

//  Sample Input
//  5
//  2
//  0

//  Sample Output
//  25 2 13 8 23 
//  12 7 24 3 14 
//  1 18 15 22 9 
//  6 11 20 17 4 
//  19 16 5 10 21 
//  and so on.....


import java.io.*;
import java.util.*;

public class knighttour{
    public static int printKnightTour(int sr, int sc, int move, int tnc, int[][] vis, int[][] dir){
        if(move == tnc){
            vis[sr][sc] = move;
            displayBoard(vis);
            vis[sr][sc] = 0;
            return 1;
        }
        vis[sr][sc] =move;
        int n = vis.length;
        int m = vis[0].length;

        int count = 0;
        for(int d=0 ; d < dir.length ; d++){
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];
        
            if(r >= 0 && c >= 0 && r < n && c < m && vis[r][c]==0){
                count += printKnightTour(r,c,move+1,tnc,vis,dir);
            }
        }
        vis[sr][sc] = 0;
        return count;
    }

    public static void displayBoard(int[][] chess) {
        for(int i = 0 ; i < chess.length ; i++){
            for(int j = 0 ; j < chess[0].length ; j++){
                System.out.print(chess[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sr = scn.nextInt(); 
        int sc = scn.nextInt();
        int[][] dir = { { -2, 1 }, { -1, 2 }, { 1, 2 }, { 2, 1 }, { 2, -1 }, { 1, -2 }, { -1, -2 }, { -2, -1 } };
        int[][] vis = new int[n][n];
        printKnightTour(sr,sc,1,n*n,vis,dir);
    }
}
