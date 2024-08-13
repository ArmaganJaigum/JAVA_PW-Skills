package SortingAgorithm;

public class lec_37_Bubble_Sort {

    static void bubbieSort(int[] a){
        int n = a.length;
        for (int i = 0; i < n; i++){

            boolean flag = false;   // 2nd Method for reduce space or time faltue use

            for (int j = 0; j< n-i-1; j++){  // last i index is already correct position thats why we use n-i-1
                if (a[j] > a[j+1]){
                    // swap
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = true;
                }
            }
            if (!flag) return;;  //// 2nd Method for reduce space or time faltue use
        }
    }
    public static void main(String[] args) {
        int[] a = {2,3,4,1,5,8};
        bubbieSort(a);
        for (int i: a){     // for each loop
            System.out.print(i + " ");
        }
    }
}
