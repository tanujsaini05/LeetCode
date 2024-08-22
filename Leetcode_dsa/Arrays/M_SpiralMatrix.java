package Arrays;
//import java.util.Scanner;
//import java.util.Arrays;
//import java.util.ArrayList;

public class M_SpiralMatrix{

    public static void printSpiral(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int top = 0, left = 0;
        int bottom = rows - 1, right = cols - 1;

        while (top <= bottom && left <= right) {
            // Traverse from left to right
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            // Traverse downwards
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            // Traverse from right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }

            // Traverse upwards
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            // {13, 14, 15, 16}
        };

        System.out.println("Spiral Order of the matrix is: ");
        printSpiral(matrix);
    }
}