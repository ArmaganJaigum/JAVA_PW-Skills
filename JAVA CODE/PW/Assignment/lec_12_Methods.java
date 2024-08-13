package PW.Assignment;
import java.util.*;

public class lec_12_Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter THREE NUMBER");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
        System.out.println(avg(a,b,c));
    }
    public static int avg(int a, int b, int c){
        return (a + b + c)/3;
    }
}
