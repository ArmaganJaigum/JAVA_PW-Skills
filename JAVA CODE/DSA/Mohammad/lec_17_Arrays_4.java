package DSA.Mohammad;

public class lec_17_Arrays_4  {

    static void swap(int a, int b){
        System.out.println("Original Valuse before Swap");
        System.out.println("a : " + a);
        System.out.println("b : " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Values after Swap");
        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }

    static void swapWithoutTemp(int a, int b) {
        System.out.println("Original values before swap");
        System.out.println("a : " + a);
        System.out.println("b : " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Values after swap");
        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }

    static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Method_1
//    static int[] reverseArray(int[] arr){
//        int n = arr.length;
//        int[] ans = new int[n];
//        int j = 0;
//
//        for(int i = n-1; i >= 0; i--){
//            ans[j++] = arr[i];
//        }
//        return ans;


    static void swapInArray(int[] arr,int i, int j){
        int Temp = arr[i];
        arr[i] = arr[j];
        arr[j] = Temp;
    }

     //  Method_2 in place

    static void reverseArray(int[] arr){
        int i = 0, j = arr.length-1;

        while(i < j){
            swapInArray(arr , i , j);
            i++;
            j--;
        }

    }
    public static void main(String[] args) {
        int a = 9;
        int b = 3;
        int[] arr = {1, 2, 3, 4, 5, 6};
//        int[] ans = reverseArray(arr);
//        printArray(ans); // Method_1
        reverseArray(arr); // Method_2
        printArray(arr); // Method_2
//        swap( a, b);
//        swapWithoutTemp( a,b);

    }
}
