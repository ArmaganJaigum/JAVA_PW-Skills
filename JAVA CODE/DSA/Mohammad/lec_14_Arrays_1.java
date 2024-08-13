package DSA.Mohammad;

public class lec_14_Arrays_1 {
    public static void main(String[] args) {

//        String[] colour = {"Red", "Yello", "Black", "Blue", "White"};
//        for (int i = 0; i < 5; i++) {
//            System.out.println(colour[i]);
//        }

//        1.Single dimensional Array:

//        String[] colors = {"Red","Yellow","Blue"};
//        for(String Color : colors)
//            System.out.print(Color + " , ");

//     *   Different approach to create array in Java:

//        int[] myArray = {1 , 2 , 3 , 4 , 5 ,6 };
//        System.out.println(myArray[0]);
//        System.out.println(myArray[1]);
//        System.out.println(myArray[2]);
//        System.out.println(myArray[3]);
//        System.out.println(myArray[4]);
//        System.out.println(myArray[5]);
//        for(int i = 0; i<6; i++ ){
//            System.out.println(myArray[i]);
//        }

//        Topic : Operations in Arrays
//
//        int length = myArray.length;
//        System.out.println(length);

//        For each loop
//
//        for(int i : myArray){
//            System.out.println(i);
//        }

//        Problem 1: Calculate the sum of all the elements in the given array.

//        int[] myArray = {1 , 2 , 3 , 4 , 5 ,6 };
//        int sum = 0;
//        for(int i=0; i<myArray.length; i++) {
//            sum += myArray[i];
//        }
//            System.out.println(sum);

//        Problem 2 ; Calculate the Maximum Value of the Array

        int[] arr = {5, 3, 6, 2, 8, 4};
        int ans = 0;

        for(int i = 0; i < arr.length; i++){
            if (arr[i] > ans){
                ans = arr[i];
            }
        }
        System.out.println("The Maximum Value is : " + ans);
    }
}
