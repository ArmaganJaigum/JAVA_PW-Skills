package DSA.Mohammad;
import java.util.Scanner;

public class lec_16_Arrays_3_Prac {
    static int pairSum(int[] arr, int target){
        int n = arr.length;
        int ans = 0;

        for(int i = 0; i < n ; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i] + arr[j] == target){
                    ans++;
                }
            }
        }
        return ans;
    }

    static int tripletsSum(int [] arr,int target){
        int n = arr.length;
        int ans = 0;

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++ ){
                for(int k = j+1; k < n; k++){
                    if(arr[i] + arr[j] + arr[k] == target){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    static int findUnique(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] > 0){
                ans = arr[i];
            }
        }
        return ans;
    }

    static int findMax(int [] arr){
        int mx = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++ ){
            if(arr[i] > mx){
                mx = arr[i];
            }
        }
        return mx;
    }
    static int findSecondMax(int [] arr) {
        int mx = findMax(arr);
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] == mx){
                arr [i] = Integer.MIN_VALUE;
            }
        }
        int secondMax = findMax(arr);
        return secondMax;
    }

    static int smallestElement(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;

    }

    static int secondSmallestElement(int [] arr){
        int min = smallestElement(arr);
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == min){
                arr[i] = Integer.MAX_VALUE;
            }
        }
        int secondSmallest = smallestElement(arr);
        return secondSmallest;
    }

    static int firstRepitatingNumber (int [] arr){
        int n = arr.length;

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }

    static int lastRepetedElement(int [] arr){
        int valRepeat = 0;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i] == arr[j]){
                    valRepeat = arr[i];
                }
            }
        }
        return valRepeat;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " Elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//        System.out.println("Enter Target Sum ");
//        int target = sc.nextInt();

//        System.out.println(pairSum(arr, target));
//        System.out.println(tripletsSum(arr, target));
//        System.out.println("Unique Element " + findUnique(arr));
//        System.out.println("Second Maximum Elements is : " + findSecondMax(arr));
        System.out.println("First Repeted Elements are : " + firstRepitatingNumber(arr));
//        System.out.println("Second Smallest element of the Array is : " + secondSmallestElement(arr));
//        System.out.println("Last Reapeted Value " + lastRepetedElement(arr));


    }

}
