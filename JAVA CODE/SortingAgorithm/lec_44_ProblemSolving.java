package SortingAgorithm;

public class lec_44_ProblemSolving {

    static void display(int[] num){
        for(int val : num){
            System.out.print(val + " ");
        }
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortArray(int[] num){      // 1st problem
        int x = -1, y = -1;

        if (num.length <= 1)return;
        for(int i = 1; i < num.length; i++){    //Process all adjacent element
            if(num[i-1] > num[i]){
                if(x == -1){ // first conflix
                    x = i-1;
                    y = i;
                } else{  // 2nd conflix
                    y = i;
                }
            }
        }
        int temp = num[x];
        num [x] = num[y];
        num[y] = temp;
    }

    static void sortPositiveNegative(int[] num){
        int n = num.length;
        int l = 0, r = n-1;
        while(l < r){
            while(num[l] < 0) l++;
            while(num[r] >= 0) r--;
            if(l < r){
                int temp = num[l];
                num[l] = num[r];
                num[r] = temp;
                l++;
                r--;
            }
        }
    }

    static void sort012(int [] arr){
        int low =0, mid = 0, high = arr.length -1;

        // Explore the unknown region
        while(mid < high){
            if(arr[mid] == 0){
                swap(arr,mid,low);
                low++;
                mid++;
            } else if(arr[mid] == 1){
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }
    }


    public static void main(String[] args) {
//        int[] num = {10, 5, 6, 7, 9, 3};
//        sortArray(num);
//        int[] num = {10, -2, 6, -32, 7, -3, 6, 4};
//        sortPositiveNegative(num);
//        display(num);

        int [] arr = {2, 1, 0, 2, 0, 1, 2, 1, 0};
        sort012(arr);
        display(arr);


    }
}
