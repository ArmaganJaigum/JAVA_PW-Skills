package Recursion;


public class lec_32_Recursion_Arrays {

    static void printArray(int [] arr, int idx){
        if(idx == arr.length) return;

        System.out.print(arr[idx] + " ");
        printArray(arr,idx+1);
    }

    static int maxInArray(int[] arr, int idx){
        if(idx == arr.length-1) return arr[idx];

        int smallValue = maxInArray(arr,idx+1);
        return Math.max(smallValue, arr[idx]);
    }

    static int sumInArray(int[] arr, int idx){
        // base case
        if(idx == arr.length) return 0;
        // recursive Work
        int smallAns = sumInArray(arr, idx + 1);
        // self Work
        return smallAns + arr[idx];
    }
    
    public static void main(String[] args) {
        int [] arr = {5, 4, 2, 4, 10 };
//        printArray(arr, 0);
//        System.out.println( maxInArray(arr,0));
        System.out.println(sumInArray(arr,0));

    }
}
