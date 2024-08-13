package BinarySearch;

import javax.naming.spi.StateFactory;

public class lec_45_BinarySearch {

    static boolean binarySearch(int[] arr, int target) {
        int n = arr.length;
        int str = 0, end = n - 1; // 0 Bond Indexing
        while (str <= end) {
            int mid = (str + end) / 2;
            if (target == arr[mid]) {
                return true;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                str = mid + 1;
            }
        }
        return false;
    }

    static boolean recBinarySearch(int[] arr, int str, int end, int target) {   // By using recursion
        if (str > end) return false;  //Base Case
        int mid = (str + end) / 2;
        if (target == arr[mid]) return true;
        else if (target < arr[mid]) {
            return recBinarySearch(arr, str, mid - 1, target);   // subProblem
        } else {
            return recBinarySearch(arr, mid + 1, end, target);    // subProblem
        }
    }

    static int firstOccurance(int[] arr, int x) {     // in A sorted array we search first occourace(pahli baar kis index par aaraha hai) of the target array
        int n = arr.length;
        int str = 0, end = n - 1;
        int fo = -1;
        while (str <= end) {
            int mid = str + (end-str)/2;
            if (arr[mid] == x) {
                fo = mid;
                end = mid - 1;
            } else if (x < arr[mid]) {
                end = mid - 1;
            } else {
                str = mid + 1;
            }
        }
        return fo;
    }

    static int sQrt(int x){
        int str = 0, end = x;
        int ans = -1;

        while(str <= end){
            int mid = str + (end - str)/2;
            int val = mid*mid;
            if(val == x){
                return mid;
            } else if(val < x){
                ans = mid;
                str = mid+1;
            } else {
                end = mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7};
//        int target = 0;
//        while(target != 21) {
//            System.out.printf("%d exists in arr: %b \n", target, recBinarySearch(arr,0,arr.length-1, target));  // 2nd Method problem
//            System.out.printf("%d exists in arr: %b \n", target, binarySearch(arr, target));   // 1st problem
//            System.out.println();
//            target++;
//        int[] arr = {1, 5, 5, 6, 2, 4};
//        int x = 0;
//        System.out.println(firstOccurance(arr,x));
//        int x = 2;
//        System.out.println(sQrt(x));

    }
}
