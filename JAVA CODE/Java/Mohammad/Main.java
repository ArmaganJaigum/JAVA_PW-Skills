package Java.Mohammad;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter length of the Array");
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){ //check for pair with all eleents 1 by 1
                if(arr[j] - arr[i]== x){
                    System.out.print("Yes");
                    return;
                }
            }
        }
        System.out.print("No");
    }
}