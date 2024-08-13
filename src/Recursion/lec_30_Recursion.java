package Recursion;

import java.util.Scanner;

public class lec_30_Recursion {

    static void printMultiples(int n, int k){
        if(k == 0) return;

        printMultiples(n,k-1);

        System.out.print( n * k + " , ");
    }

    static int seriesSum(int n){
        if(n == 0){
            return n;
        }
        return seriesSum(n-1) + n;
    }

    static int seriesAlternativeSum(int n){    // 1 - 2 + 3 - 4 + 5  like this type
        if(n == 0) return 0;

        if(n % 2 == 0){
            return seriesAlternativeSum(n-1) - n;
        } else {
            return seriesAlternativeSum(n-1) + n;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int k = sc.nextInt();
//        printMultiples(n, k);
//        System.out.println(seriesSum(n));
        System.out.println(seriesAlternativeSum(n));
    }
}
