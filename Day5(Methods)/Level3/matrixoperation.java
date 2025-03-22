
import java.util.Arrays;
import java.util.Scanner;

public class matrixoperation {

    static Scanner input = new Scanner(System.in);

    static int[][] crt_matrix(int row, int col) {
        int[][] mat = new int[row][col];
        for (int i = 0; i < row; i++) {
            System.out.printf("enter elements of row%d", i + 1);
            for (int j = 0; j < col; j++) {
                mat[i][j] = input.nextInt();
            }
        }
        return mat;
    }

    static int[][] add_matrix(int[][] mat1, int[][] mat2) {
        int row1, col1, row2, col2;
        row1 = mat1.length;
        col1 = mat1[0].length;
        row2 = mat2.length;
        col2 = mat2[0].length;
        int[][] add = new int[row1][col2];
        if (row1 == row2 && row2 == col2) {
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    add[i][j] = mat1[i][j] + mat2[i][j];
                }
            }
        }
        return add;
    }

    static int[][] sub_matrix(int[][] mat1, int[][] mat2) {
        int row1, col1, row2, col2;
        row1 = mat1.length;
        col1 = mat1[0].length;
        row2 = mat2.length;
        col2 = mat2[0].length;
        int[][] sub = new int[row1][col2];
        if (row1 == row2 && row2 == col2) {
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    sub[i][j] = mat1[i][j] - mat2[i][j];
                }
            }
        } else {
            System.out.println("invalid");
        }
        return sub;
    }

    static int[][] mult_matrix(int[][] mat1, int[][] mat2) {
        int row, col, sum = 0;
        row = mat2.length;
        col = mat1[0].length;
        int[][] mul = new int[mat1.length][mat2[0].length];
        if (col == row) {
            for (int i = 0; i < mat1.length; i++) {

                for (int j = 0; j < mat2[0].length; j++) {
                    sum = 0;
                    for (int k = 0; k < col; k++) {

                        sum += mat1[i][k] * mat2[k][j];
                    }
                    mul[i][j] = sum;
                }
            }
        } else {
            System.out.println("INVALID");
        }
        return mul;
    }

    public static void main(String[] args) {
        int row1, col1, row2, col2;
        System.out.println("enter number of rows in mat1: ");
        row1 = input.nextInt();
        System.out.println("enter number of cols in mat1");
        col1 = input.nextInt();
        int[][] mat_1 = crt_matrix(row1, col1);
        System.out.println("enter number of rows in mat2: ");
        row2 = input.nextInt();
        System.out.println("enter number of cols in mat2");
        col2 = input.nextInt();
        int[][] mat_2 = crt_matrix(row2, col2);
        for (int[] i : mult_matrix(mat_1, mat_2)) {
            System.out.println(Arrays.toString(i));
        }

    }
}