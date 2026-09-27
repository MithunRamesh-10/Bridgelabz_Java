package javaMethods.level3;

/**
 * Problem 13 (GCR — Java Methods Level 3 Assignment)
 * Perform matrix operations including addition, subtraction,
 * multiplication, transpose, determinant, and inverse.
 *
 * Author : Mithun
 * Date : 23-09-2026
 */
public class MatrixOperations {

    // Method to create a random matrix
    public static int[][] createRandomMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] =
                        (int) (Math.random() * 10);
            }
        }

        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrices(
            int[][] first,
            int[][] second) {

        int rows = first.length;
        int columns = first[0].length;

        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] =
                        first[i][j] + second[i][j];
            }
        }

        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(
            int[][] first,
            int[][] second) {

        int rows = first.length;
        int columns = first[0].length;

        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] =
                        first[i][j] - second[i][j];
            }
        }

        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(
            int[][] first,
            int[][] second) {

        int rows = first.length;
        int columns = second[0].length;
        int common = second.length;

        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                for (int k = 0; k < common; k++) {
                    result[i][j] +=
                            first[i][k] * second[k][j];
                }
            }
        }

        return result;
    }

    // Method to find transpose
    public static int[][] transpose(int[][] matrix) {

        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] result = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }

    // Method to find determinant of 2x2 matrix
    public static int determinant2x2(int[][] matrix) {

        return matrix[0][0] * matrix[1][1]
                - matrix[0][1] * matrix[1][0];
    }

    // Method to find determinant of 3x3 matrix
    public static int determinant3x3(int[][] matrix) {

        int determinant =
                matrix[0][0] *
                        (matrix[1][1] * matrix[2][2]
                                - matrix[1][2] * matrix[2][1])

                        - matrix[0][1] *
                        (matrix[1][0] * matrix[2][2]
                                - matrix[1][2] * matrix[2][0])

                        + matrix[0][2] *
                        (matrix[1][0] * matrix[2][1]
                                - matrix[1][1] * matrix[2][0]);

        return determinant;
    }

    // Method to find inverse of 2x2 matrix
    public static double[][] inverse2x2(int[][] matrix) {

        int determinant = determinant2x2(matrix);

        if (determinant == 0) {
            return new double[0][0];
        }

        double[][] inverse = new double[2][2];

        inverse[0][0] =
                (double) matrix[1][1] / determinant;

        inverse[0][1] =
                (double) -matrix[0][1] / determinant;

        inverse[1][0] =
                (double) -matrix[1][0] / determinant;

        inverse[1][1] =
                (double) matrix[0][0] / determinant;

        return inverse;
    }

    // Method to find inverse of 3x3 matrix
    public static double[][] inverse3x3(int[][] matrix) {

        int determinant = determinant3x3(matrix);

        if (determinant == 0) {
            return new double[0][0];
        }

        double[][] inverse = new double[3][3];

        // Calculate cofactors
        double c00 =
                matrix[1][1] * matrix[2][2]
                        - matrix[1][2] * matrix[2][1];

        double c01 =
                -(matrix[1][0] * matrix[2][2]
                        - matrix[1][2] * matrix[2][0]);

        double c02 =
                matrix[1][0] * matrix[2][1]
                        - matrix[1][1] * matrix[2][0];

        double c10 =
                -(matrix[0][1] * matrix[2][2]
                        - matrix[0][2] * matrix[2][1]);

        double c11 =
                matrix[0][0] * matrix[2][2]
                        - matrix[0][2] * matrix[2][0];

        double c12 =
                -(matrix[0][0] * matrix[2][1]
                        - matrix[0][1] * matrix[2][0]);

        double c20 =
                matrix[0][1] * matrix[1][2]
                        - matrix[0][2] * matrix[1][1];

        double c21 =
                -(matrix[0][0] * matrix[1][2]
                        - matrix[0][2] * matrix[1][0]);

        double c22 =
                matrix[0][0] * matrix[1][1]
                        - matrix[0][1] * matrix[1][0];

        // Transpose cofactor matrix and divide by determinant
        inverse[0][0] = c00 / determinant;
        inverse[0][1] = c10 / determinant;
        inverse[0][2] = c20 / determinant;

        inverse[1][0] = c01 / determinant;
        inverse[1][1] = c11 / determinant;
        inverse[1][2] = c21 / determinant;

        inverse[2][0] = c02 / determinant;
        inverse[2][1] = c12 / determinant;
        inverse[2][2] = c22 / determinant;

        return inverse;
    }

    // Method to display integer matrix
    public static void displayMatrix(int[][] matrix) {

        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf("%4d", value);
            }

            System.out.println();
        }
    }

    // Method to display double matrix
    public static void displayMatrix(double[][] matrix) {

        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%8.2f", value);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Create two random 3x3 matrices
        int[][] matrixA = createRandomMatrix(3, 3);
        int[][] matrixB = createRandomMatrix(3, 3);

        System.out.println("Matrix A:");
        displayMatrix(matrixA);

        System.out.println("\nMatrix B:");
        displayMatrix(matrixB);

        // Addition
        System.out.println("\nA + B:");
        displayMatrix(addMatrices(matrixA, matrixB));

        // Subtraction
        System.out.println("\nA - B:");
        displayMatrix(subtractMatrices(matrixA, matrixB));

        // Multiplication
        System.out.println("\nA * B:");
        displayMatrix(multiplyMatrices(matrixA, matrixB));

        // Transpose
        System.out.println("\nTranspose of A:");
        displayMatrix(transpose(matrixA));

        // Create 2x2 matrix for 2x2 operations
        int[][] matrix2x2 = createRandomMatrix(2, 2);

        System.out.println("\n2x2 Matrix:");
        displayMatrix(matrix2x2);

        // Find 2x2 determinant
        int determinant2x2 = determinant2x2(matrix2x2);

        System.out.println("\n2x2 Determinant: "
                + determinant2x2);

        // Find 2x2 inverse
        System.out.println("\n2x2 Inverse:");

        double[][] inverse2x2 =
                inverse2x2(matrix2x2);

        if (inverse2x2.length == 0) {
            System.out.println(
                    "Inverse does not exist because determinant is zero.");
        } else {
            displayMatrix(inverse2x2);
        }

        // Find 3x3 determinant
        int determinant3x3 =
                determinant3x3(matrixA);

        System.out.println("\n3x3 Determinant: "
                + determinant3x3);

        // Find 3x3 inverse
        System.out.println("\n3x3 Inverse:");

        double[][] inverse3x3 =
                inverse3x3(matrixA);

        if (inverse3x3.length == 0) {
            System.out.println(
                    "Inverse does not exist because determinant is zero.");
        } else {
            displayMatrix(inverse3x3);
        }
    }
}
