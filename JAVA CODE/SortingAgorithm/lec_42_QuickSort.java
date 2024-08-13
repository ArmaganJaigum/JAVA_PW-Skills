
package SortingAgorithm;

public class lec_42_QuickSort {

    static void dispArray(int[] arr){
        for ( int val : arr) {
            System.out.print(val + " ");
        }
    }

    static void swap(int[] arr, int x,int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static int partition(int[] arr,int strt, int end){
        int pivot = arr[strt];
        int counLessPivot = 0;
        for(int i = strt+1; i <= end; i++){
            if(arr[i] <= pivot) counLessPivot++;
        }
        int pivotIndex = strt+ counLessPivot;
        swap(arr, strt,pivotIndex);
        int i = strt, j = end;
        while (i < pivotIndex && j > pivotIndex) {
            while (arr[i] <= pivotIndex) i++;
            while (arr[j] > pivotIndex) j--;
            if ( i < pivotIndex && j > pivotIndex)
                swap(arr, i,j);
            i++;
            j--;
        }
        return pivotIndex;
    }

    static void quickSort(int[] arr, int strt, int end){
        if (strt >= end) return;
        int pi = partition(arr, strt,end);
        quickSort(arr, strt,pi-1);
        quickSort(arr,pi+1,end);
    }


    public static void main(String[] args) {
        int[] arr = {5,2,9,3,9,3,1};
        System.out.println("Array Before SortingAgorithm.Sorting");
        dispArray(arr);
        System.out.println();
        quickSort(arr,0,arr.length-1);
        System.out.println("Array After SortingAgorithm.Sorting");
        dispArray(arr);


    }
}
