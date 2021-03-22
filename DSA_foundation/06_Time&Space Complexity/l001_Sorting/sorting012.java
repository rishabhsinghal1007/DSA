//  Question
//  1. You are given an array(arr) containing only 0's, 1's, and 2's.
//  2. You have to sort the given array in increasing order and in linear time.

//  Input Format
//  An Integer N 
//  arr1
//  arr2..
//  n integers

// Sample Input
// 10
// 1 0 2 2 1 0 2 1 0 2

// Sample Output
// Swapping index 1 and index 0
// Swapping index 2 and index 9
// Swapping index 2 and index 8
// Swapping index 2 and index 1
// Swapping index 3 and index 7
// Swapping index 5 and index 2
// Swapping index 6 and index 6
// 0
// 0
// 0
// 1
// 1
// 1
// 2
// 2
// 2
// 2


import java.io.*;
import java.util.*;

public class sorting012 {

    public static void sort012(int[] arr) {
        int n = arr.length;
        
        int pt1=0,itr=0,pt2=n-1;
        while(itr<=pt2){
            if(arr[itr] == 0)
                swap(arr,itr++,pt1++);
            else if(arr[itr] == 2)
                swap(arr,itr,pt2--);
            else
                itr++;
        }

    }

    // used for swapping ith and jth elements of array
    public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping index " + i + " and index " + j);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        sort012(arr);
        print(arr);
    }

}