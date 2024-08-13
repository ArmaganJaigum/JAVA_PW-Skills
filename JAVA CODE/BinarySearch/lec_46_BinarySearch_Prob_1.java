package BinarySearch;
public class lec_46_BinarySearch_Prob_1 {

    static int findMinimum(int[] arr){    //{3, 4, 5, 6, 1, 2}  here we find 1
        int n = arr.length;
        int st = 0, end = n-1, ans = -1;

        while (st <= end){
            int mid = st + (end - st)/2;
            if(arr[mid] <= arr[n-1]){
                ans = mid;
                end = mid - 1;
            }else {
                st = mid+1;
            }
        }
        return ans;
    }

    static int searchElement(int[] arr, int target){
        int n = arr.length;
        int str = 0, end = n-1;
        while (str <= end){
            int mid = str + (end - str)/2;
            if(arr[mid] == target){
                return mid;
            } else if (arr[mid] < arr[end]) {
                if(target > arr[mid] && target <= arr[end]){
                    str = mid+1;
                } else {
                    end = mid-1;
                }
            } else {
                if(target >= arr[str] && target < arr[mid]){
                    end = mid-1;
                } else{
                    str = mid+1;
                }
            }
        }
        return -1;
    }

    //Dublicates Elements
    static int searchEle(int[] arr, int target){
        int n = arr.length;
        int str = 0, end = n-1;
        while (str <= end){
            int mid = str + (end - str)/2;
            if(arr[mid] == target){
                return mid;
            } else if(arr[str] == arr[mid] && arr[str] == arr[end]){
                str++;
                end--;
            } else if(arr[mid] <= arr[end]){
                if(target > arr[mid] && target <= arr[end]){
                    str = mid+1;
                } else{
                    end = mid-1;
                }
            } else{
                if(target >= arr[str] && target < arr[mid]){
                    end = mid-1;
                } else{
                    str = mid+1;
                }
            }
        }
        return 1;
    }
    public static void main(String[] args) {
//        int[] arr = {3, 4, 5, 1, 2};
//        System.out.println(findMinimum(arr));
//        System.out.println(searchElement(arr,5));
        int[] a = {0,0,0,0,1,1,2,0,0,0};
        System.out.println(searchEle(a,2));
    }
}