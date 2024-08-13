package Recursion;


import java.util.ArrayList;

public class lec_33_Reursion {

    static boolean search(int[] arr, int n, int target, int idx) {
        if (idx >= n) return false;
        if (arr[idx] == target) return true;
        return search(arr, n, target, idx + 1);
    }

    static void findAllIndices(int[] arr, int n, int target, int idx) {   // they chaque how many target value is present
        // base case
        if (idx >= n) return;
        // self work
        if (arr[idx] == target) System.out.println(idx);
        // recursive Work
        findAllIndices(arr, n, target, idx + 1);
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 3, 6, 8, 6};
        int target = 6;
//        if(search(arr,arr.length,target, 0)){
//            System.out.println("found");
//        } else {
//            System.out.println("Not found");
//        }
        findAllIndices(arr, arr.length, target, 0);

    }
}