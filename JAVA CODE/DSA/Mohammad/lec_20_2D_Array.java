package DSA.Mohammad;
import java.util.Scanner;

public class lec_20_2D_Array {
    static void printMatrix(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    static void add(int[][] a, int r1, int c1, int[][] b , int r2, int c2){
        if(r1 != r2 || c1 != c2){
            System.out.println("Wrong Input - Addition not Possible");
            return;
        }
        int[][] sum = new int[r1][c1];

        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Som of matrix 1 and 2 is");
        printMatrix(sum);
    }

    static void multiply(int[][] a, int r1, int c1, int[][] b, int r2, int c2){
        if(c1 != r2){
            System.out.println("Invalid Input : Multiplication not Exists");
            return;
        }

        int[][] mul = new int[r1][c1];
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                for(int k = 0; k < c1; k++){
                    mul[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("Multiplication of 2 Matrices");
        printMatrix(mul);
    }

    public static void main(String[] args){
//        int[][] arr2 = {
//                {1, 5, 6},
//                {7, 9, 8},
//                {8, 6, 9}
//        };
       Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter Number of Rows");
//        int r = sc.nextInt();
//        System.out.println("Enter Number of Colums");
//        int c = sc.nextInt();
//
//        int[][] arr = new int[r][c];  // total = r*c
//
//        System.out.println("Enter " + r*c + " Element ");
//        for (int i = 0; i < r; i++){
//            for(int j = 0; j < c; j++){
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println("THe Output is");
//        printArray(arr);
        System.out.println("Enter Number of Rows And  Colums in Matrin: 1 ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        int[][] a = new int[r1][c1];
        System.out.println("Enter Matrix 1 Values");
        for (int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter Number of Rows and Columns of Matrix:2");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        int[][] b = new int[r2][c2];
        System.out.println("Enter Matrix 2 Values");
        for (int i = 0; i < r2; i++){
            for(int j = 0; j < c2; j++){
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("1st Matrix");
        printMatrix(a);
        System.out.println("2nd Matrix");
        printMatrix(b);

//        add(a, r1, c1, b,r2, c2);
        multiply(a, r1, c1, b, r2, c2);
    }
}
