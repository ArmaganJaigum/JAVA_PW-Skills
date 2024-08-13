package Java.Mohammad;
import java.util.Scanner;

public class loops_08lec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int n = sc.nextInt();


//        COUNT DIGITS


//        int numOfDigits = 0;
//        int inputNumber = n;
//        while(n > 0){
//            n = n / 10;
//            numOfDigits++;
//        }
//        System.out.println("Number Of Digits in " + inputNumber + " is = " + numOfDigits );

//      *  Sum of the givenn Digits


//        int SumOfDigits = 0;
//        int originalNum = n;
//        while(n > 0){
//            SumOfDigits += n % 10;
//            n = n / 10;
//        }
//        System.out.println("Sum Of Digits of num " + originalNum + " is = " + SumOfDigits);

//        *Rever the digits of a Number

//        int ans = 0;
//        while(n>0){
//            ans = ans * 10 + n % 10;
//            n /= 10;
//        }
//        System.out.println("Reverse Ans Is = " + ans);

//        * Sum of the givenn series number

//        int ans = 0;
//
//        for(int i = 1; i <= n; i++){
//            if(i % 2 == 0){
//                ans -= i;
//            }else {
//                ans += i;
//            }
//        }
//        System.out.println("The Ans is = " + ans);

//        * Find the First N Factorial

//        int fact = 1;
//        for(int i = 1; i <= n; i++){
//            fact = fact * i;
//            System.out.println("Factorial of " + i + " is = " + fact);
//        }


//        * RaisePower

        System.out.println("Enter First Number");
        int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b =  sc.nextInt();

        int ans = 1;
        for(int i = 1; i <= b; i++) {
            ans *= a;
        }
        System.out.println("The Raise Poqwer Of that Number Is = " + ans);


    }
}

