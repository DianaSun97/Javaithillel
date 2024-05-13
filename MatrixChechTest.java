import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MatrixChechTest {
@Test
    public void test (){
    int [][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
    boolean res1 = MatrixCheck.isSquareMatrix(matrix1);
    assertEquals(true, res1);
}
@Test
    public void test2(){
    int [][] matrix2 = {{1,2,3},{4,5,6},{7,8,9}};
    boolean res2 = MatrixCheck.isSquareMatrix(matrix2);
    assertEquals(true, res2);
    }

    @Test
    public void testAverageOfMatrix() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        double avg = MatrixCheck.averageOfMatrix(matrix);
        assertEquals(5.0, avg, 0.001);
    }
}