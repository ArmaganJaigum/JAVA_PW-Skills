package PW.Assignment;

public class lec_14_Arrays {
    public static void main(String[] args) {

        // 1. Given ann Array of Integer {2,6,-5,-1,0,4,-9} print only positive value present in the array

//        int arr[] = {2 , 6 , -5 , -1 , 8 , 4 , -9};
//        for(int val:arr){
//            if(val >= 0){
//                System.out.println(val);
//            }
//        }

        // 2 . Conver the list of Strings{"ab","bc","cd","de","ef","fg","gh"}pprint all string stored in odd indices of array

//        String[] arr = {"ab","bc","cd","de","ef","fg","gh"};
//        for(int i = 0; i <arr.length; i++){
//            if (i % 2 != 0){
//                System.out.println(arr[i]);
//            }
//        }

        // 3 . Transverse over the element of array (1,2,3,4,5,6,7) each loop and print all even elements

//        int[] arr = {1, 2, 3, 4, 5, 6, 7};
//        for (int val : arr) {
//            if (val % 2 == 0) {
//                System.out.println(val);
//            }
//        }

        // THIS IS WRONG  4 . Calcculate minimum element of array {2, -3, 5, 8, 1, 0, -4} using stnd lib method cal minimum element

//        int [] arr = {2, -3, 5, 8, 1, 0, -4};
//        for(int i = 1; i < arr.length-1; i++){
//            if(arr[i - 1] < arr[i] && arr[i] > arr[i+1]){
//                System.out.print(arr[i]);
//                break;
//            }
//        }

        // 5 . find first peak element of arr{1,1,3,4,2,3,5,7,0}

        int [] arr = {1,1,3,4,2,3,5,7,0};
        for(int i = 1; i <arr.length-1; i++){
            if(arr[i-1] < arr[i] && arr[i] > arr[i+1]){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}