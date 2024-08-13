package Recursion;

import java.util.Scanner;

public class lec_28_Recursion {

    static int factorial(int n){
        // base case
        if(n == 0) return 1;

        // smaller problem- recursive work

        int ans = factorial(n-1);

        // bugger problem
        return n * ans;     // other wise be directly write factorial(n-1)
    }


static int fibonacci(int n){
        if(n == 0 || n == 1) {
            return n;
        }

//        int prev = fibonacci(n-1);
//        int prevPrev = fibonacci(n-2);
//        return prev + prevPrev;
       return fibonacci(n-1) + fibonacci(n-2);
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int n = sc.nextInt();
        System.out.println(factorial(n));

//            System.out.println(fibonacci(n));

    }

}