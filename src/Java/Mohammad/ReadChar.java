package Java.Mohammad;

import java.util.Scanner;
public class ReadChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Charecter");
        char ch = sc.next().charAt(0);
        System.out.println("Character is " + ch);
    }
}
