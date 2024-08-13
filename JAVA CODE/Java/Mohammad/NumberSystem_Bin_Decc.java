package Java.Mohammad;
import java.util.Scanner;

public class NumberSystem_Bin_Decc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        1.BINARY TO DECIMAL


//        int binary_num = sc.nextInt();
//
//        int ans = 0;  // converted Decimal number
//        int power = 1;  //2 ^ 0 = 1 power nof 2
//
//        while(binary_num> 0 ){
//            int unit_digit = binary_num % 10;
//            ans += (unit_digit * power);
//            binary_num /= 10;
//            power *= 2;
//        }
//        System.out.println(ans);


//        2.DECIMALtoBINART

        int decimal_num = sc.nextInt();

        int ans = 0;    //binary number
        int power = 1;  // power of 10

        while(decimal_num > 0 ){
            int parity = decimal_num % 2;
            ans += (parity * power);
            power *= 10;
            decimal_num /= 2;
        }
        System.out.println(ans);
    }
}
