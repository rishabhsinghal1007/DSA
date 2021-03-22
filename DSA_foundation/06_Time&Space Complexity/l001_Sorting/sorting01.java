// Question
// 1. You are given an array(arr) containing only 0's and 1's.
// 2. You have to sort the given array in increasing order and in linear time.

// Input Format
// An Integer N 
// arr1
// arr2..
// n integers

// Sample Input
// 5
// 0 1 0 1 0

// Sample Output
// Swapping index 0 and index 0
// Swapping index 2 and index 1
// Swapping index 4 and index 2
// 0 0 0 1 1

import java.io.*;
import java.util.*;

public class sorting01 {

    public static void sort01(int[] arr) {
        int n = arr.length;
        int pt = 0, itr = 0;
        while (itr < n) {
            if (arr[itr] == 0) {
                swap(arr, itr++, pt++);
            } else
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
        sort01(arr);
        print(arr);
    }

}