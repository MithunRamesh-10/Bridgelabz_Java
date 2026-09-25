package javaMethods.Level3;

public class MatrixOperations {

    public static int[][] generateRandomMatrix(
            int rows,
            int columns) {

        int[][] matrix =
                new int[rows][columns];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                matrix[i][j] =
                        (int) (Math.random() * 10);
            }
        }

        return matrix;
    }

    public static int[][] addMatrices(
            int[][] matrixA,
            int[][] matrixB) {

        int rows = matrixA.length;
        int columns = matrixA[0].length;

        int[][] result =
                new int[rows][columns];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                result[i][j] =
                        matrixA[i][j] +
                                matrixB[i][j];
            }
        }

        return result;
    }

    public static int[][] subtractMatrices(
            int[][] matrixA,
            int[][] matrixB) {

        int rows = matrixA.length;
        int columns = matrixA[0].length;

        int[][] result =
                new int[rows][columns];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                result[i][j] =
                        matrixA[i][j] -
                                matrixB[i][j];
            }
        }

        return result;
    }

    public static int[][] multiplyMatrices(
            int[][] matrixA,
            int[][] matrixB) {

        int rowsA = matrixA.length;
        int columnsA = matrixA[0].length;
        int columnsB = matrixB[0].length;

        int[][] result =
                new int[rowsA][columnsB];

        for (int i = 0; i < rowsA; i++) {

            for (int j = 0; j < columnsB; j++) {

                for (int k = 0; k < columnsA; k++) {

                    result[i][j] +=
                            matrixA[i][k] *
                                    matrixB[k][j];
                }
            }
        }

        return result;
    }

    public static int[][] transposeMatrix(
            int[][] matrix) {

        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] transpose =
                new int[columns][rows];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                transpose[j][i] =
                        matrix[i][j];
            }
        }

        return transpose;
    }

    public static int determinant2x2(
            int[][] matrix) {

        return matrix[0][0] * matrix[1][1]
                - matrix[0][1] * matrix[1][0];
    }

    public static int determinant3x3(
            int[][] matrix) {

        int a = matrix[0][0];
        int b = matrix[0][1];
        int c = matrix[0][2];

        int d = matrix[1][0];
        int e = matrix[1][1];
        int f = matrix[1][2];

        int g = matrix[2][0];
        int h = matrix[2][1];
        int i = matrix[2][2];

        return a * (e * i - f * h)
                - b * (d * i - f * g)
                + c * (d * h - e * g);
    }

    public static double[][] inverse2x2(
            int[][] matrix) {

        int determinant =
                determinant2x2(matrix);

        if (determinant == 0) {
            return null;
        }

        double[][] inverse =
                new double[2][2];

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

    public static double[][] inverse3x3(
            int[][] matrix) {

        int determinant =
                determinant3x3(matrix);

        if (determinant == 0) {
            return null;
        }

        double[][] inverse =
                new double[3][3];

        inverse[0][0] =
                (matrix[1][1] * matrix[2][2]
                        - matrix[1][2] * matrix[2][1])
                        / (double) determinant;

        inverse[0][1] =
                -(matrix[0][1] * matrix[2][2]
                        - matrix[0][2] * matrix[2][1])
                        / (double) determinant;

        inverse[0][2] =
                (matrix[0][1] * matrix[1][2]
                        - matrix[0][2] * matrix[1][1])
                        / (double) determinant;

        inverse[1][0] =
                -(matrix[1][0] * matrix[2][2]
                        - matrix[1][2] * matrix[2][0])
                        / (double) determinant;

        inverse[1][1] =
                (matrix[0][0] * matrix[2][2]
                        - matrix[0][2] * matrix[2][0])
                        / (double) determinant;

        inverse[1][2] =
                -(matrix[0][0] * matrix[1][2]
                        - matrix[0][2] * matrix[1][0])
                        / (double) determinant;

        inverse[2][0] =
                (matrix[1][0] * matrix[2][1]
                        - matrix[1][1] * matrix[2][0])
                        / (double) determinant;

        inverse[2][1] =
                -(matrix[0][0] * matrix[2][1]
                        - matrix[0][1] * matrix[2][0])
                        / (double) determinant;

        inverse[2][2] =
                (matrix[0][0] * matrix[1][1]
                        - matrix[0][1] * matrix[1][0])
                        / (double) determinant;

        return inverse;
    }

    public static void displayMatrix(
            int[][] matrix) {

        for (int[] row : matrix) {

            for (int value : row) {
                System.out.print(value + "\t");
            }

            System.out.println();
        }
    }

    public static void displayDoubleMatrix(
            double[][] matrix) {

        if (matrix == null) {
            System.out.println(
                    "Inverse does not exist."
            );
            return;
        }

        for (double[] row : matrix) {

            for (double value : row) {

                System.out.printf(
                        "%.2f\t",
                        value
                );
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] matrixA = {
                {1, 2},
                {3, 4}
        };

        int[][] matrixB = {
                {5, 6},
                {7, 8}
        };

        System.out.println("Matrix A:");
        displayMatrix(matrixA);

        System.out.println("\nMatrix B:");
        displayMatrix(matrixB);

        System.out.println("\nAddition:");
        displayMatrix(
                addMatrices(matrixA, matrixB)
        );

        System.out.println("\nSubtraction:");
        displayMatrix(
                subtractMatrices(matrixA, matrixB)
        );

        System.out.println("\nMultiplication:");
        displayMatrix(
                multiplyMatrices(matrixA, matrixB)
        );

        System.out.println("\nTranspose of A:");
        displayMatrix(
                transposeMatrix(matrixA)
        );

        System.out.println(
                "\nDeterminant of A: " +
                        determinant2x2(matrixA)
        );

        System.out.println("\nInverse of A:");

        displayDoubleMatrix(
                inverse2x2(matrixA)
        );

        int[][] matrix3x3 = {
                {1, 2, 3},
                {0, 1, 4},
                {5, 6, 0}
        };

        System.out.println("\n3x3 Matrix:");

        displayMatrix(matrix3x3);

        System.out.println(
                "\nDeterminant of 3x3 Matrix: " +
                        determinant3x3(matrix3x3)
        );

        System.out.println("\nInverse of 3x3 Matrix:");

        displayDoubleMatrix(
                inverse3x3(matrix3x3)
        );
    }
}
