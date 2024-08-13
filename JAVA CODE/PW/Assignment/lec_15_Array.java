package PW.Assignment;
import java.util.*;

public class lec_15_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//     Question no_1

//        System.out.println("Enter the Length of the Array");
//        int n = sc.nextInt();
//        int [] arr = new int[n];
//        System.out.println("Enter the Elements of Array");
//        for(int i = 0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        int[] ans = new int[n];
//        int idx = 0;
//        for(int i = 0;i<n;i++){
//            if(arr[i]>0){
//                ans[idx] = arr[i];
//                idx++;
//            }
//        }
//        for(int i=0;i<n;i++){
//            if(arr[i]<0){
//                ans[idx] = arr[i];
//                idx++;
//            }
//        }
//        for(int i = 0; i<n; i++){
//            System.out.print(ans[i] + " ");
//        }

//        Question_3

//        System.out.println("Enter thr Length of An Array");
//        int n = sc.nextInt();
//        int [] arr = new int[n];
//        for(int i = 0; i< n; i++){
//            arr[i] = sc.nextInt();
//        }
//        int k = sc.nextInt();
//        Arrays.sort(arr);
//        System.out.print(arr[k-1]);

//        Question_4

        System.out.println("Enter thr Length of An Array");
        int n = sc.nextInt();
        int s = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i< n; i++) {
            arr[i] = sc.nextInt();
        }
        int i = 0;
        int j = 00;
        int sum = 0;
        while(j < n) {
            sum += arr[j];
            if (sum > s) {
                while (sum > s && i < j) {
                    sum -= arr[i];
                    i++;
                }
            }
            if (sum == s) {
                System.out.print(i + " ");
                System.out.print(j);
                break;
            }
            j++;
        }
    }
}
