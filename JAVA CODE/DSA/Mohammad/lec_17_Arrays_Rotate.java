package DSA.Mohammad;
import java.util.*;
public class lec_17_Arrays_Rotate {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] rotate(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;

        for(int i = n-k; i < n ; i++){
            ans[j++] = arr[i];
        }

        for(int i = 0; i < n-k ; i++) {
            ans[j++] = arr[i];
        }
        return ans;
    }


    static int[] makeFrequencyArray(int[] arr){
        int[] freq = new int[100005];  //Choice 10^5 se thora jiyada
        for(int i = 0; i < arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n = sc.nextInt();
        int[] arr= new int[n];

        System.out.println("Enter " + n + " Elements ");
        for(int i = 0 ; i < n; i++){
            arr[i] = sc.nextInt();
        }

//        System.out.println("Enter how many times you Want to rotate k : ");
//        int k = sc.nextInt();
//
//        System.out.println("Original Array");
//        printArray(arr);
//        int[] ans = rotate(arr,k);
//        System.out.println("Arrays After Rotation");
//        printArray(ans);


        // Frequency Array

        int[] freq = makeFrequencyArray(arr);

        System.out.print("Enter Number Of Quaries : ");
        int q = sc.nextInt();

        while(q > 0){
            System.out.println("Enter Number to be Search");
            int x = sc.nextInt();
            if(freq[x] > 0){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            q--;
        }
    }
}
