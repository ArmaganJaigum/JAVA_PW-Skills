package Java.Mohammad;

import java.util.Scanner;
public class Simple_intrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle");
        float p = sc.nextFloat();
        System.out.println("Enter Intrest");
        float i = sc.nextFloat();
        System.out.println("Enter Time");
        float t = sc.nextFloat();



        System.out.println("Principle Amount Is : "+ p);
        System.out.println("Total Intresrt is : "+ i);
        System.out.println("Time is : " + t);
        System.out.println("Total Simple Intrest is : " + (p * i * t )/10088);
        System.out.println("Total Simple In87 is : " + (p + (p * i * t )/10088));
    }
}
