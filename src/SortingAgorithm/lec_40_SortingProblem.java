package SortingAgorithm;

public class lec_40_SortingProblem {

    static void moveZero(int[] arr){      // first problem MOve all zerows in last witout changing ther order of any element
        int n = arr.length;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i -1; j++){
                if (arr[j] == 0 && arr[j +1] != 0){
                    // Swap a[j] & a[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

           // 2nd problem

    static void sortFruits(String[] fruits){
        int n = fruits.length;
        for(int i = 0; i < n-1; i++) {
            int min_Index = i;
            for (int j = i + 1; j < n; j++) {
                if (fruits[j].compareTo(fruits[min_Index]) < 0) {
                    min_Index = j;
                }
            }
            String temp = fruits[i];
            fruits[i] = fruits[min_Index];
            fruits[min_Index] = temp;
        }
    }
    public static void main(String[] args) {
//        int [] arr = {0, 3, 0, 24, 7};
//        moveZero(arr);
//        for(int val: arr) {
//            System.out.print(val + " ");
//        }
        // 2nd Problem
        String[] fruits = {"kiwi", "apple", "papaya", "gauva"};
        sortFruits(fruits);
        for (String val: fruits){
            System.out.print(val + ", ");
        }
    }
}