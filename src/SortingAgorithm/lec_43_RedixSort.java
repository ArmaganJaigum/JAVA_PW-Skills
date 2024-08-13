package SortingAgorithm;

import java.util.ArrayList;
import java.util.Collections;

public class lec_43_RedixSort {

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

    static void countSort(int[] arr,int place){
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];
        for(int i = 0; i < arr.length; i++) {  // Make frequency Array
            count[(arr[i]/place)%10]++;
        }
        // Make prefix sum Array of count Array:
        for(int i = 1; i < count.length; i++){
            count[i] += count[i-1];
        }
        // Find the index of each element in the original array and put it inoutput Array
        for(int i = n-1; i > 0; i--){
            int idx = count[(arr[i]/place)%10] - 1;
            output[idx] = arr[i];
            count[(arr[i]/place)%10]--;
        }
        //Copy all elements of output to arr
        for(int i = 0; i < n; i++){
            arr[i] = output[i];
        }
    }

    static void bucketSort(float[] arr) {
        int n = arr.length;
        // Buckets
        ArrayList<Float>[] buckets = new ArrayList[n];
        // Create empty buckets
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<Float>();
        }
        // Add elements into our buckets
        for(int i = 0; i < n; i++){
            int bucketIndex = (int) arr[i] * n;
            buckets[bucketIndex].add(arr[i]);
        }
        // Sort each buckets Individualy
        for(int i = 0; i < buckets.length; i++){
            Collections.sort(buckets[i]);
        }
        // Merge all buckets to get final sorted array
        int index = 0;
        for(int i = 0;i < buckets.length; i++){
            ArrayList<Float> currBucket = buckets[i];
            for (int j =0 ; j < currBucket.size(); j++){
                arr[index++] = currBucket.get(j);
            }
        }
    }
    static void radixSort(int[] arr){
        int max = findMax(arr);  // We get Maximum Value
        // Apply Counting sort to sort element based on place value
        for (int place = 1; max/place >0; place *= 10){
            countSort(arr,place);
        }
    }
    public static void main(String[] args) {
//        int[] arr = {43, 456, 789,9, 34};
//        radixSort(arr);
//        dispArray(arr);

        float[] arr = {0.2f, .45f, 0.63f, 0.93f, 0.45f, 0.23f};
        bucketSort(arr);
        for (float val: arr) {
            System.out.print(val + " ");
        }
    }
}
