package DSA.Mohammad;
import java.sql.SQLOutput;
import java.util.Scanner;

public class lec_21_2D_Arr_Problem {

    static void printMatrix(int[][] matrix){
        for(int i =0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] transposeOfMatrix(int[][] matrix , int r, int c){
        int[][] transpose = new int[c][r];

        for(int i = 0; i< c; i++) {
            for (int j = 0; j < r; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }
        return transpose;
    }

    static void transposeInPlace(int[][] matrix, int r, int c){    // this method is use only for Square matrix

        for(int i = 0; i < c; i++){
            for(int j = i; j < r; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    static void reverse(int[] arr){
        int i = 0, j = arr.length - 1;

        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static void rotate(int[][] matrix , int n){
        transposeInPlace(matrix, n, n);
        for(int i = 0; i < n; i++){
            reverse(matrix[i]);
        }
    }

    static int[][] pascal(int n){
        int [][] ans = new int[n][];

        for(int i = 0; i < n; i++){
            ans[i] = new int[i+1];
            ans[i][0] = ans[i][i] = 1;

            for(int j = 1; j < i; j++){
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }
        }
        return ans;
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows And Colums in Matrix: 1");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];
        System.out.println("Enter " + r*c + " Element");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter nu of Rows and Colums in Matrix : 2");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        int[][] b = new int[r2][c2];
        System.out.println("Enter 2nd Matrix Elments");
        for(int i = 0; i < r2; i++){
            for(int j = 0; j < c2; j++){
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input Matrix is ");
        printMatrix(matrix);

        int[][] transpose = transposeOfMatrix(matrix, r, c);
        System.out.println("Transpose Matrix is:");
        printMatrix(transpose);
        transposeInPlace(matrix, r ,c);
        printMatrix(matrix);
//
//        rotate(matrix, r);
//        System.out.println("Rotate matrix is :");
//        printMatrix(matrix);


//        System.out.println("Enter nu of elements");      // for pascal
//        int n = sc.nextInt();
//        int[][] ans = pascal(n);
//        printMatrix(ans);

    }
}
