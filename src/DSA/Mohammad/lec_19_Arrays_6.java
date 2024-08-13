package DSA.Mohammad;
import java.util.Scanner;

public class lec_19_Arrays_6 {

    static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] makePrefixSumArray(int[] arr){
        int n = arr.length;

        for(int i = 1; i < n; i++){
            arr[i] = arr[i - 1] + arr[i];
        }
        return arr;
    }

    static int[] makeSuffixSumArray(int[] arr){
        for(int i = arr.length - 2; i >= 0;  i--){
            arr[i] = arr[i + 1] + arr[i];
        }
        return arr;
    }

    static int findArraySum(int[] arr){
        int totalSum = 0;
        for(int i = 0; i < arr.length; i++){
            totalSum += arr[i];
        }
        return totalSum;
    }

    static boolean equalSumPartition(int[] arr){
        int totalSum = findArraySum(arr);

        int prefSum = 0;
        for(int i = 0; i < arr.length; i++){
            prefSum += arr[i];

            int suffixSum = 0;
            suffixSum = totalSum - prefSum;
            if(prefSum == suffixSum){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n]; // 1 problem
//        int[] arr = new int[n+1];  // quaries bala

       System.out.println("Enter " + n + " Size of Array");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

//        System.out.println("Input Array: ");
//        printArray(arr);
//        int[] pref = makePrefixSumArray(arr);
//
//        System.out.println("Output Array: ");
//        printArray(pref);

        System.out.println("Input Array: ");
        printArray(arr);
        int[] suffArr = makeSuffixSumArray(arr);

        System.out.println("Output Array: ");
        printArray(suffArr);
//
//        int[] prefSum = makePrefixSumArray(arr);
//
//        System.out.println("Enter Number Of Quaries");
//        int q = sc.nextInt();
//
//        while(q-- > 0) {
//            System.out.println("Enter Range");
//            int l = sc.nextInt();
//            int r = sc.nextInt();
//
//            int ans = prefSum[r] - prefSum[l - 1];
//            System.out.println("SUM: " + ans);
//        }

//        System.out.println("Equal Partition Possible : " + equalSumPartition(arr));
    }
}
