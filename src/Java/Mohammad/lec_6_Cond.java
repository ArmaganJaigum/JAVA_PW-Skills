package Java.Mohammad;
import java.util.Scanner;
public class lec_6_Cond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();

//        IF ELSE STATEMENT

//        if (num % 2 == 0) {
//            System.out.println("even");
//        } else {
//            System.out.println("odd");
//        }

//        IF ELSE IF STATEMENT (Age Group)

//        int age = sc.nextInt();
//
//        if(age < 12){
//            System.out.println("Child");
//        } else if(age > 12 && age < 18){
//            System.out.println("Tinnager");
//        } else {
//            System.out.println("Adult");
//        }

//        IN ONE LINE CALCULATION

//        int num = sc.nextInt();
//        String ans;
//        ans = (num % 2 == 0) ? "even" : "odd";
//        System.out.println(ans);

//        int num = sc.nextInt();
//        if(num % 2 ==0 || num % 3 ==0) {
//            System.out.println("Ans" + num);
//        }

//        SWITCH CASE

        int day = sc.nextInt();

        switch (day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Noy in list");
        }

    }
}
