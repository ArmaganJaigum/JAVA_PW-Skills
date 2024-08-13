package Recursion;

import java.util.Scanner;

public class lec_29_Recursion_sod {


    static int sumOfDigit(int n){

        //base case
        if(n >= 0 && n <= 9)return 1;
        //recursive work
//        int smallAns = sumOfDigit(n/10);
//        return smallAns + n%10;

        return sumOfDigit(n/10) +  n%10;

    }

//    static int power(int p, int q){   // Method 1
//        // base case
//        if(q == 0)return 1;
//        //Recursive work
//        return power(p,q-1) * p;
//    }

    static int power(int p, int q){     // Method 2
        if(q == 0)return 1;

        int smallPow = power(p, q/2);
        if(q % 2 == 0){
            return smallPow * smallPow;
        }
        return p * smallPow * smallPow;
    }

    static int countOfDigits(int p){
        if(p/10 == 0) return 1;
        return countOfDigits(p/10) + 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter N");
//        int n = sc.nextInt();
        int p = sc.nextInt();
//        int q = sc.nextInt();

//        System.out.println("Sum of the given digit is: " + sumOfDigit(n));
//        System.out.println("Power " + power(p,q) );
        System.out.println(countOfDigits(p));
    }
}
