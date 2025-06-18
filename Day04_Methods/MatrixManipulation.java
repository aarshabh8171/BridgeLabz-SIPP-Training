import java.util.Random;
import java.util.Scanner;

public class MatrixManipulation {

    // Method to create a random matrix with given rows and columns
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // random numbers 0-9
            }
        }
        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rowsA = a.length;
        int colsA = a[0].length;
        int rowsB = b.length;
        int colsB = b[0].length;

        if(colsA != rowsB) {
            throw new IllegalArgumentException("Matrix multiplication not possible: columns of A != rows of B");
        }

        int[][] result = new int[rowsA][colsB];

        for(int i=0; i<rowsA; i++) {
            for(int j=0; j<colsB; j++) {
                result[i][j] = 0;
                for(int k=0; k<colsA; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows for matrix A: ");
        int rowsA = scanner.nextInt();

        System.out.print("Enter number of columns for matrix A: ");
        int colsA = scanner.nextInt();

        System.out.print("Enter number of rows for matrix B: ");
        int rowsB = scanner.nextInt();

        System.out.print("Enter number of columns for matrix B: ");
        int colsB = scanner.nextInt();

        if(colsA != rowsB) {
            System.out.println("Matrix multiplication not possible: columns of A != rows of B");
            scanner.close();
            return;
        }

        int[][] matrixA = createRandomMatrix(rowsA, colsA);
        int[][] matrixB = createRandomMatrix(rowsB, colsB);

        System.out.println("\nMatrix A:");
        displayMatrix(matrixA);

        System.out.println("\nMatrix B:");
        displayMatrix(matrixB);

        int[][] sum = addMatrices(matrixA, matrixB);
        System.out.println("\nSum of matrices:");
        displayMatrix(sum);

        int[][] diff = subtractMatrices(matrixA, matrixB);
        System.out.println("\nDifference of matrices:");
        displayMatrix(diff);

        int[][] product = multiplyMatrices(matrixA, matrixB);
        System.out.println("\nProduct of matrices:");
        displayMatrix(product);

        scanner.close();
    }
}
