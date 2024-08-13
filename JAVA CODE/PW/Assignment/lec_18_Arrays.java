package PW.Assignment;
import java.util.Scanner;

public class lec_18_Arrays {

    static void printArray(int[] arr ){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


//    Q4. Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two
//    numbers such that they add up to a specific target number.
//    Return the indices of the two numbers added by one. Return -1 if pair does not exist.

    static void classTest(int[] arr, int target){

        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while(left < right){
            if(arr[left] + arr[right] == target ) {
                System.out.print(++left + " , " + ++right);
                return;
            } else if(arr[left] + arr[right] > target){
                right--;
            } else{
                left++;
            }
        }
        System.out.print(" Not Found ");

    }

    static int[] sortSquare(int[] arr){
        int n = arr.length;
        int left = 0, right = n - 1, k = n - 1;
        int[] ans = new int[n];
        while(left <= right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k--] = arr[left] * arr[left];
                left++;
            } else {
                ans[k--] = arr[right] * arr[right];
                right--;
            }
        }
         return ans;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " Size of Array");
        for(int i = 0 ; i < n; i++) {
            arr[i] = sc.nextInt();

        }


//        System.out.println("Enter the Target");
//        int target = sc.nextInt();
        System.out.println("Original Array");
        printArray(arr);
        int[] ans = sortSquare(arr);
//        System.out.print("The target element index is : ");
//        classTest(arr,target);
        System.out.println("Arrays Ater Short And After Squaring");
        printArray(ans);

    }
}
