package Java.Mohammad;
import java.util.Scanner;
public class loops_09lec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //        1 . RECTENGULAR PATTERN

//        System.out.println("Enter Number of Columns");
//        int c = sc.nextInt();
//        System.out.println("Enter Number of Rows");
//        int r = sc.nextInt();

//            for(int i = 1; i <= r ; i++){
//            for(int j = 1; j <= c ; j++){
//                System.out.print("*");
//            }
//                System.out.println();
//        }

//        1.a Rectangular Pattern of Number

//        for(int i = 1; i<= r; i++){
//            for(int j = 1; j <= c; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }


//        1.C Numerical RECTENGULAR pattern

//        for(int i = 1; i <= r; i++){
//            for(int j = 1; j <= c; j++){
//                if((i + j) % 2 == 0){
//                    System.out.print(1);
//                }else{
//                    System.out.print(2);
//                }
//            }
//            System.out.println();
//        }


//        2 . HoLo RECTENGULAR

//        for(int i = 1; i <= r ; i++){
//            for(int j = 1; j <= c; j++){
//                if(i == 1 || i == r || j == 1 || j == c) {
//                    System.out.print("*");
//                }else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }


//        2.a HOLO RECTENGULAR COLOUM

//        for(int i = 1; i <= r; i++){
//            for(int j = 1; j <= c; j++){
//                if(i == 1 || i == r || j == 1 || j == c){
//                    System.out.print(j);
//                }else{
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.println();
//        }


//        2.b TRAINGULAR HOLO PYRAMID




//        3 . TRAINGULAR PATTERN

//        int r = sc.nextInt();
//
//        for(int i = 1; i <= r; i++){
//            for(int j = 1; j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        3.a NUMERICAL TRAINGULAR PATTERN

//            int r = sc.nextInt();
//            for(int i = 1; i<= r; i++){
//                for(int j = 1; j<= i; j++){
//                    System.out.print(j);
//                }
//                System.out.println();
//        }


//        4.Reverser Trangular
//
//        int r = sc.nextInt();
//        for(int i = 1; i <= r; i++){
//            for(int j = 1; j <= (r + 1 - i) ; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//       5.PYRAMID PATTERN

//        int r = sc.nextInt();
//        for(int i = 1; i <= r; i++){ //travelling over rows
//
//            //print r-i Spacer
//            for(int j = 1; j <= r -i ; j++)
//                System.out.print(" ");
//
//                //print 2*i-1
//            for(int k = 1; k <= (2 * i - 1); k++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }

//        5.a NUMERICAL PYRAMID

//        int r = sc.nextInt();
//        for(int i = 1; i <= r; i++){
//
//            for (int j = 1; j <= r-i; j++){
//                System.out.print(" ");
//            }
//            for(int k = 1; k <= i; k++){
//                System.out.print(k);
//            }
//            for(int l = i-1; l >= 1 ; l--){
//                System.out.print(l);
//            }
//            System.out.println();
//        }

//        6. NUMERICAL RECTENGULAR

//        int r = sc.nextInt();
//
//        for(int i = 1; i <= r; i++){
//            for(int j = i ; j <= r; j++ ){
//                System.out.print(j);
//            }
//            for(int k = 1; k <= i-1; k++){
//                System.out.print(k);
//            }
//            System.out.println();
//        }

    }
}