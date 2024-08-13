package DSA.Mohammad;
import java.util.Scanner;
public class lec_22_2D_Arr_Problem {

    static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printSpiralOrder(int[][] matrix, int r, int c){
        int topRow = 0, bottomRow = r - 1, leftCol = 0, rightCol = c - 1;
        int totalElements = 0;

        while(totalElements < r * c) {

            // topRow -> leftCol to rightCol

            for (int j = leftCol; j <= rightCol && totalElements < r * c; j++) {
                System.out.println(matrix[topRow][j] + " ");
                totalElements++;
            }
            topRow++;

            // rightCol -> topRow to BottomRow

            for (int i = topRow; i <= bottomRow && totalElements < r * c; i++) {
                System.out.println(matrix[i][rightCol] + " ");
                totalElements++;
            }
            rightCol--;

            // bottoRow -> rightCol to LeftCol

            for(int j = rightCol; j >= leftCol && totalElements < r*c; j--){
                System.out.println(matrix[bottomRow][j] + " ");
                totalElements++;
            }
            bottomRow--;

            // eftCol -> bottomRow to topRow

            for(int i = bottomRow; i >= topRow && totalElements < r*c; i--){
                System.out.println(matrix[i][leftCol] + " ");
                totalElements++;
            }
            leftCol++;
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nu of Rows & Colums");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];

        System.out.println("Enter " + r + " Rows & " + c + " Colums Matrix");
        for(int i = 0; i < r; i ++){
            for(int j = 0; j < c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input Matrix is: ");
        printMatrix(matrix);

        System.out.println("Spiral Order Array is");
        printSpiralOrder(matrix, r, c);
    }

}
