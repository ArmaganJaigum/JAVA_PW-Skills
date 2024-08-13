package PW.Assignment;
import java.util.Scanner;

public class lec_20_22_2D_Array {


    static void printMatrin(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    static void addTwoMatrix(int[][] a, int r1, int c1, int[][] b, int r2, int c2){
        if(r1 != r2 || c1 != c2){
            System.out.println("Wrong Input ");
            return;
        }
        int[][] sum = new int[r1][c1];
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
               sum[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Sum of two matrices is");
        printMatrin(sum);
    }

    static void multiplyOfMatrix(int[][] a, int r1, int c1, int[][] b, int r2, int c2){
        if(r1 != c2){
            System.out.println("Wrong input Multiplication not Possible");
            return;
        }

        int[][] multiply = new int[r1][c1];
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                for(int k = 0; k < c1; k++){
                    multiply[i][j] = a[i][j] * b[i][j];
                }
            }
        }
        System.out.println("Multiplication of Two Matrix is");
        printMatrin(multiply);

    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        System.out.println("Enter Number of Rows And Colums in Matrix 1: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];

        System.out.println("Enter First Matrix Elements");
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Number of Rows And Colums in Matrix 2: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] b = new int[r2][c1];

        System.out.println("Enter 2nd Matrix Elements");
        for(int i = 0; i < r2; i++){
            for(int j = 0; j < c2; j++){
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("First Matrix");
        printMatrin(a);
        System.out.println("2nd Matrix");
        printMatrin(b);



//        addTwoMatrix(a, r1, c1, b, r2, c2);
        multiplyOfMatrix(a, r1, c1, b, r2, c2);

         */

        System.out.println("Enter Number of Rows And Colums ofg Matrix ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];

        System.out.println("Enter Matrix Elements");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

    }
}
