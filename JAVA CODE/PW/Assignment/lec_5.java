package PW.Assignment;
import java.util.Scanner;

public class lec_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        QUESTION_1

//        System.out.println("What is Your First Name");
//        String first_name = sc.next();
//        System.out.println("What Is Your Last Name");
//        String last_name = sc.next();
//        System.out.println("Insert Your Roll Number");
//        int roll_number = sc.nextInt();
//        System.out.println("Which Field You Have intrest");
//        String field_intrest = sc.next();
//        System.out.println("My Name is : "+ first_name + last_name);
//        System.out.println("My Roll Number is " + roll_number);
//        System.out.println("Field Of Intrest " + field_intrest);

//        QUESTION_2

//        System.out.println("Insert First String");
//        String first = sc.next();
//        System.out.println("Insert second String");
//        String second = sc.next();
//        System.out.println(first + second);

//        QUESTION_3

//        System.out.println("Rebort enterd first subject Marks");
//        int sub1 = sc.nextInt();
//        System.out.println("Rebort enterd second subject Marks");
//        int sub2 = sc.nextInt();
//        System.out.println("Rebort enterd third subject Marks");
//        int sub3 = sc.nextInt();
//        float total = sub1 + sub2 + sub3;
//        float percentage = total*100/300;
//        System.out.println("Total Marks Of Robert is " + total);
//        System.out.println("Total Percentage is " + percentage);

//        QUESTION_4

//        int t = sc.nextInt();
//        for (int i = 1; i <= t; i++) {
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            System.out.println(a + b);
//     }

//        QUESTION_5

        while (sc.hasNextLine()) {
            String a = sc.next();
            String b = sc.next();
            System.out.println(a + b);


        }
    }
}