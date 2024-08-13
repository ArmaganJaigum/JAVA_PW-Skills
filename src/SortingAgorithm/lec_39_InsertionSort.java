package SortingAgorithm;

public class lec_39_InsertionSort {

    static void insertion(int[] a){
        int n= a.length;
        for (int i = 1; i < n; i++){
            int j = i;
            while(j > 0 && a[j] < a[j-1]){
                // swap
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {4,6,2,3,0};
        insertion(a);
        for(int val : a){
            System.out.print(val + " ");
        }
    }
}
