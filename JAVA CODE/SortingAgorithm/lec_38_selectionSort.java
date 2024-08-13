package SortingAgorithm;

public class lec_38_selectionSort {

    static void selectionSort(int[] arr){
        int n = arr.length;

        for(int i = 0 ; i < n-1; i++){

            int min_Index = i;
            for (int j = i + 1; j < n; j++){
                if (arr[j] < arr[min_Index]){
                    min_Index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_Index];
            arr[min_Index] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,1,3,6,4,7};
        selectionSort(arr);
        for (int i : arr){
            System.out.print(i + " , ");
        }
    }
}
