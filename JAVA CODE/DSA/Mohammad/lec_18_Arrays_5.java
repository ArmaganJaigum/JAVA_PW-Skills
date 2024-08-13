package DSA.Mohammad;
import java.util.Scanner;

public class lec_18_Arrays_5 {

    static void printArray(int[] arr){
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

    //METHOD_1

//    static void sortZerowsAndOnes(int[] arr){
//        int n = arr.length;
//        int zerows = 0;
//        //count nu of zerows
//        for(int i = 0; i < n; i++){
//            if(arr[i] == 0){
//                zerows++;
//            }
//        }
//
//        //0 to zerows-1 : 0, zerows to n-1 : 1
//        for(int i = 0; i < n; i++){
//            if(i < zerows){
//                arr[i] = 0;
//            } else {
//                arr[i] = 1;
//            }
//        }
//    }


    //METHOD_2
    static void sortZerowsAndOnes(int[] arr){
        int n = arr.length;
        int left = 0, right = n-1;
        while(left < right){
            if(arr[left] == 1 && arr[right] == 0){
                swap(arr , left , right);
                left++;
                right--;
            }
            if(arr[left] == 0){
                left++;
            }
            if(arr[right] == 1){
                right--;
            }
        }

    }


    static void sortArraysByParity(int[] arr){   // Parity means Even or Odd
        int n = arr.length;
        int left = 0, right = n-1;

        while(left < right){
            if(arr[left] % 2 == 1 && arr[right] % 2 == 0){
                swap(arr, left, right);
                left++;
                right--;
            }
            if(arr[left] % 2 == 0){
                left++;
            }
            if(arr[right] % 2 == 1){
                right--;
            }
        }
    }

    static int[] sortSquared(int[] arr){
        int n = arr.length;
        int left = 0, right = n-1, k = n-1;
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

        System.out.println("Enter " + n + " Elements");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array : ");
        printArray(arr);
//        sortZerowsAndOnes(arr);
//        sortArraysByParity(arr);
        int[] ans = sortSquared(arr);
        System.out.println("Sorted Array: ");
//        printArray(arr);
        printArray(ans);


    }
}
