/*A program that uses classes for Matrix addition,subtraction and multiplication */

import java.util.*;
class Matrix {
    private int[][] matrix;
    private int rows;
    private int cols;

    Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.matrix = new int[rows][cols];
    }

    public void inputElements(Scanner sc, String matrixName) {
        System.out.println("Enter the elements in: " + matrixName);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "] : ");
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    public void display(String matrixName) {
        System.out.println("The " + matrixName + " elements are: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static Matrix addMatrix(Matrix m1, Matrix m2) {
        if (m1.rows != m2.rows || m1.cols != m2.cols) {
            System.out.println("Cannot perform the computation ");
            return null;
        }
        Matrix result = new Matrix(m1.rows, m1.cols);
        for (int i = 0; i < m1.rows; i++) {
            for (int j = 0; j < m2.cols; j++) {
                result.matrix[i][j] = m1.matrix[i][j] + m2.matrix[i][j];
            }

        }
        return result;
    }

    public static Matrix subMatrix(Matrix m1, Matrix m2) {
        if (m1.rows != m2.rows || m1.cols != m2.cols) {
            System.out.println("Cannot perform the computation ");
            return null;
        }
        Matrix result = new Matrix(m1.rows, m1.cols);
        for (int i = 0; i < m1.rows; i++) {
            for (int j = 0; j < m2.cols; j++) {
                result.matrix[i][j] = m1.matrix[i][j] - m2.matrix[i][j];
            }

        }
        return result;
    }

    public static Matrix mulMatrix(Matrix m1,Matrix m2){
        if(m1.cols != m2.rows){
            System.out.println("Cannot perform the computation ");
            return null;
        }
        Matrix result = new Matrix(m1.rows, m2.cols);
        for (int i = 0; i < m1.rows; i++) {
            for (int j = 0; j < m2.cols; j++) {
                for (int k = 0; k < m1.cols; k++) {
                    result.matrix[i][j] += m1.matrix[i][k] * m2.matrix[k][j];
                }
            }
        }
        return result;
    }

}

public class MatrixCalulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of Matrix A");
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();
        Matrix m1 = new Matrix(rows, cols);
        m1.inputElements(sc, "Matrix A");
        System.out.println("Enter the elements of Matrix B");
        System.out.print("Enter the number of rows: ");
        int rows1 = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols1 = sc.nextInt();
        Matrix m2 = new Matrix(rows1, cols1);
        m2.inputElements(sc, "Matrix B");
        m1.display("Matrix A");
        m2.display("Matrix B");
        if (rows == rows1 && cols == cols1) {
            Matrix sumMatrix = Matrix.addMatrix(m1, m2);
            if (sumMatrix != null) {
                sumMatrix.display("Addition Result");
            }
        } else {
            System.out.println("Matrix addition skipped (dimension mismatch).");
        }
        if (rows == rows1 && cols == cols1) {
            Matrix sumMatrix = Matrix.subMatrix(m1, m2);
            if (sumMatrix != null) {
                sumMatrix.display("Subtraction Result");
            }
        } else {
            System.out.println("Matrix subtraction skipped (dimension mismatch).");
        }
        if (cols == rows1) {
            Matrix productMatrix = Matrix.mulMatrix(m1, m2);
            if (productMatrix != null) {
                productMatrix.display("Multiplication Result");
            }
        } else {
            System.out.println("Matrix multiplication skipped (dimension mismatch).");
        }
        sc.close();
    }
}