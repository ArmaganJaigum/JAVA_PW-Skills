package PW.Assignment;
import java.util.Scanner;
public class lec_8_9_10_loops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


//        Q1 - Write a program to print Fibonacci series of n terms where n is input by user

//        int n = sc.nextInt();
//
//        int a = 1;
//        int b = 1;
//        for (int i = 1; i <= n; i++) {
//            System.out.print(a + " ");
//            int sum = a + b;
//            a = b;
//            b = sum;
//        }

//        Q2 - Write a program to enter the numbers till the user wants, the number can be positive,
//        negative or zero. Calculate the sum of numbers until a negative number is encountered. I
//        f the input is a negative number, current sum is discarded and print -1.
//
//        int sum = 0;
//        while(sc.hasNextInt()){
//            int num = sc.nextInt();
//            if(num >= 0){
//                sum += num;
//            }
//            else{
//                sum = -1;
//                break;
//            }
//        }
//        System.out.println(sum);

//        Q3 - Write a program to calculate the factorial of a numbe

//        int n = sc.nextInt();
//
//        int fact = 1;
//        for(int i = 1; i <= n; i++){
//            fact *= i;
//            System.out.println("The Factorial of " + i + " is = " + fact);
//        }


//        Q7- Write a program to print pattern given below :
//                 *
//                 *
//               *****
//                 *
//                 *

        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == n/2){
                    System.out.print("*");

                }else{
                    if (j == n/2) {
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }

    }
}
