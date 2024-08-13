package PW.Assignment;

import java.util.Scanner;
public class lec_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        1. Write a program which takes the values of length and breadth from user and check if it is
//        a square or not.

//        System.out.println("Enter Length");
//        int length = sc.nextInt();
//
//        System.out.println("Enter Breath");
//        int breath = sc.nextInt();
//        if(length == breath){
//            System.out.println("It is A Square");
//
//        }else{
//            System.out.println("It is Not Square");
//        }

//      2.  Write a program to print absolute value of a number entered by the user.

//        System.out.println("Enter the Number : ");
//        int num = sc.nextInt();
//        if(num<0) {
//            num = num * -1;
//        }  System.out.println("The absoulte value is : " + num);


//        3. Write a program to take input from user for Cost Price (C.P.) and Selling Price(S.P.) and calculate Profit
//        or Loss.

//        System.out.println("Enter the Cost Price");
//        int cp = sc.nextInt();
//        System.out.println("Enter the Selling Price");
//        int sp = sc.nextInt();
//        int amt;
//        if (cp > sp) {
//
//            amt = cp - sp;
//            System.out.println("The Loss Is = " + amt);
//        } else if (cp < sp) {
//            amt = sp - cp;
//            System.out.println("The Profit is : " + amt);
//        } else {
//            System.out.println("No Profit No Loss");
//        }


//        4 . Write a program to print positive number entered by the user, if user enters a negative number, it is
//        skipped.

//        System.out.println("Enter a Numbr");
//        int x = sc.nextInt();
//        if(x>0){
//            System.out.println("You Enter A Positive Number");
//        } else {
//
//            System.out.println("You Enter a Negative Number So it is Skipped");
//        }

//        Q5 - Create a calculator using switch statement to perform addition, subtraction, multiplication and division.

        System.out.println(("Enter Marks"));
        int marks = sc.nextInt();
        if (marks>90){
            System.out.println("Your Grade is : A+");
        } else if(marks>80){
            System.out.println("Your Grade is = A");
        } else if(marks>70){
            System.out.println("Your Grade is = B+");
        }else if(marks>60){
            System.out.println("Your Grade is = B");
        }else if(marks>50){
            System.out.println("Your Grade is = c");
        }else if(marks>40){
            System.out.println("Your Grade is = D");
        }else if(marks>30){
            System.out.println("Your Grade is = E");
        }else if(marks>0){
            System.out.println("Your Grade is = F");
        }

    }

    }

