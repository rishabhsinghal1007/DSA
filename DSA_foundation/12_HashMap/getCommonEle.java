import java.io.*;
import java.util.*;

public class getCommonEle{

    public static void intersectionOfTwoArraysWithoutDuplicates(int[] arr1 , int[] arr2){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele : arr1){
            map.put(ele, map.getOrDefault(ele, 0) + 1 );
        }

        for(int ele : arr2){
            if(map.containsKey(ele)){
                System.out.println(ele);
                map.remove(ele);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
              
        System.out.println("Enter the size of 1st array : ");
        int n1 = scn.nextInt();
        System.out.println("Enter the elements : ");
        int[] a1 = new int[n1];
        for(int i = 0 ; i < n1 ; i++)
            a1[i] = scn.nextInt();

        System.out.println("Enter the size of 2nd array : ");
        int n2 = scn.nextInt();    
        System.out.println("Enter the elements : ");
        int[] a2 = new int[n2];
        for(int i = 0 ; i < n2 ; i++)
            a2[i] = scn.nextInt();
        
        System.out.println("Output : ");
        intersectionOfTwoArraysWithoutDuplicates(a1,a2);
     }
}