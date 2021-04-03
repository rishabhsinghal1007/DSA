import java.io.*;
import java.util.*;

public class basic{

    public static void MinPQ(){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 10; i >= 0; i--){
            pq.add(i);
        }

        while(pq.size() != 0){
            int ele = pq.remove() ;
            System.out.print(ele + " ");
        }
    }

    public static void MaxPQ(){
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> {
            return b-a;
        });

        for(int i = 10; i >= 0; i--){
            pq.add(i);
        }

        while(pq.size() != 0){
            int ele = pq.remove() ;
            System.out.print(ele + " ");
        }
    }

    public static void main(String[] args){
        MinPQ();
        System.out.println();
        MaxPQ();
    }
}