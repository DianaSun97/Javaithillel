import java.util.Scanner;

public class MatrixCheck {

    public static boolean isSquareMatrix(int[][] matrix) {
        // Перевірка, чи є всі рядки однакової довжини
        for (int[] row : matrix) {
            if (row.length != matrix.length) {
                return false;
            }
        }
        return true;
    }


    public static double averageOfMatrix(int[][] matrix) {
        double sum = 0;
        int count = 0;

        for (int[] row : matrix) {
            for (int element : row) {
                sum += element;
                count++;
            }
        }

        return sum / count;
    }

}
