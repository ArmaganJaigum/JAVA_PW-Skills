package Recursion;

import java.util.Scanner;

public class lec_31_GCD {
    static int iGcd(int x, int y){   // by using itrative method
        while (x % y != 0){
            int rem = x % y;
            x = y;
            y = rem;
        }
        return y;
    }

    static int gcd(int x, int y){
        if(y == 0) return x;
        return gcd(y, x % y);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
//        System.out.println(iGcd(x,y));
//        System.out.println(gcd(x,y));

    }
}
