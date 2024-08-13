package SortingAgorithm;

public class lec_43_CountSort {
    static void dispArray(int[] arr){
        for (int val: arr) {
            System.out.print(val + " ");
        }
    }

    static int findMax(int[] arr) {
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > mx){
                mx = arr[i];
            }
        }
        return mx;
    }
    static void basicCountSort(int[] arr){
        int max = findMax(arr);   // Find the largest elements of the array
        int[] count = new int[max+1];
        for (int i = 0; i < arr.length; i++){
            count[arr[i]]++;
        }
        int k = 0;
        for (int i = 0; i < count.length; i++){
            for (int j = 0; j < count[i]; j++){
                arr[k++] = i;
            }
        }
    }

    static void countSort(int[] arr){
        int n = arr.length;
        int[] output = new int[n];
        int max = findMax(arr);  // Find the largest element of the Array
        int[] count = new int[max+1];
        for(int i = 0; i < arr.length; i++) {  // Make frequency Array
            count[arr[i]]++;
        }
            // Make prefix sum Array of count Array:
        for(int i = 1; i < count.length; i++){
            count[i] += count[i-1];
        }
        // Find the index of each element in the original array and put it inoutput Array
        for(int i = n-1; i > 0; i--){
            int idx = count[arr[i]] - 1;
            output[idx] = arr[i];
            count[arr[i]]--;
        }
        //Copy all elements of output to arr
        for(int i = 0; i < n; i++){
            arr[i] = output[i];
        }
    }


    public static void main(String[] args) {
        int[] arr = {2,5,1,7,3,9,3,3,};
       // basicCountSort(arr);
        countSort(arr);
        dispArray(arr);
    }
}
