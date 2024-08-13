package DSA.Mohammad;

//Topic: Taking input in an array
import java.util.*;

public class lec_15_Array_2 {

//    Example 1: Find the last occurrence of an element x in a given array.

    public static int lastOccurance(int a[],int x){
        int index = -1;
        for(int i = 0; i< a.length; i++) {
            if (a[i] == x)
                index = i;
        }
        return index;
    }

//    Example 2: Count the number of occurrences of a particular element x.

    public static int countofElements(int a[],int x){
        int count = 0;
        for(int i=0; i< a.length;i++){
            if(a[i] == x)
                count++;
        }
        return count;
    }

//    Example 3: Count the number of elements strictly greater than value x.

    public static int countofElement(int a[], int x){
        int count = 0;
        for(int i = 0; i < a.length;i++){
            if(a[i] > x)
                count++;
        }
        return count;
    }

//    Example 4: Check if the given array is sorted or not.

    public static boolean check(int a[]){
        boolean ans = true;
        for(int i = 1; i<a.length;i++){
            if(a[i] < a[i-1])
                ans = false;
        }
        return ans;
    }
    public static void main(String[] args) {
        int a[] = {1, 4, 7, 9, 1};
//        System.out.println(lastOccurance(a,1));
//        System.out.println(countofElements(a,1));
//        System.out.println(countofElements(a,1));
        System.out.println(check(a));

        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter the Size of Array ");
//        int n = sc.nextInt();
//        int [] arr = new int[n];
//        System.out.println("Enter the " + n + " Size o Array");
//        for(int i =0; i<n; i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println( n + " Size Arrays Elements Are");
//        for(int i=0; i<n; i++){
//            System.out.print(arr[i] + " ");
//        }


//        Topic: Array Reference in Java

//        int a[] = {1, 4, 7, 9};
//        int n = a.length;
//        int b[] = new int[n];
//        b = a;
//        b[0] = 5;
//        System.out.println("Original Array");
//        for(int i = 0; i <n; i++)
//            System.out.print(a[i] + " ");
//            System.out.println("\nReferenced Array ");
//            for(int i = 0 ; i<n; i++ )
//                System.out.println(b[i] + " ");


//        Topic: Cloning an array
////
//        int a[] = { 1, 4, 7, 9 };
//        int n = a.length;
//        int b[] = a.clone();
//        b[0] = 5;
//        System.out.println("Original Array");
//        for(int i = 0; i < n; i++)
//        System.out.print(a[i] + " ");
//
//        System.out.println("\nCloned Array");
//        for(int i = 0; i<b.length; i++)
//            System.out.print(b[i] + " ");



    }
}