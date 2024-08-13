package Java.Mohammad;

import java.util.Scanner;
public class Add_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your First Number");
        int num1 = sc.nextInt();
        System.out.println("Enter Your Second Number");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);
    }
}
