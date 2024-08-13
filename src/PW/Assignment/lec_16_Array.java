package PW.Assignment;
import java.util.Scanner;
public class lec_16_Array {

    static void absoluteDifference (int [] arr,int target){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] - arr[i] == target ){
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("no");
    }

    static int numOccurance(int [] arr , int target){

        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the Array");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter the " + n + " Elements");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Compairing Element");
        int target = sc.nextInt();

        absoluteDifference(arr,target);
//        System.out.println(numOccurance(arr , target));

    }
}
