package BinarySearch;

public class lec_47_BinarySear_Prob_2 {

    static boolean searchMatrix(int[][] a, int target) {
        // Number of Rows = n, Colums = m
        int n = a.length, m = a[0].length;
        int str = 0, end = m*n - 1;
        while(str <= end){
            int mid = str + (end-str)/2;
            int midEle = a[mid/m][mid%m];
            if(midEle == target) return true;
            if(target < midEle){
                end = mid-1;
            } else {
                str = mid+1;
            }
        }
        return false;
    }

    static boolean searchMatrix_2(int[][] a, int target) {
        int n = a.length, m = a[0].length;
        int i = 0, j = m-1;
        while(i < n && j >= 0){
            if(a[i][j] == target) return true;
            if(a[i][j] > target) j--;
            else i++;
        }
        return false;
    }

    static int peakIndexInMountainArray(int[] arr){
        int str = 0, end = arr.length - 1;
        int ans = -1;
        while (str <= end) {
            int mid = str + (end - str) / 2;
            if (arr[mid] < arr[mid + 1]) {
                ans = mid + 1;
                str = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    static int findPeakElement(int[] arr) {
        int n = arr.length;
        int str = 0, end = n-1;
        while(str <= end){
            int mid = str + (end-str)/2;
            if((mid == 0 || arr[mid] > arr[mid-1]) && (mid == n-1 || arr[mid] > arr[mid+1])){
                return mid;
            }
            if(arr[mid] < arr[mid+1]){
                str = mid+1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }


        public static void main(String[] args) {
//        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
//        System.out.println(searchMatrix(matrix,20));

//        int[][] mat = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
//        System.out.println(searchMatrix_2(mat, 21));

            int[] arr = {0,2,1,0,3,4,1,0};
            System.out.println(peakIndexInMountainArray(arr));
            System.out.println();
            System.out.println(findPeakElement(arr));
    }
}
