import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class TwoDArrayPractice2Test {

	// generated with github copilot
	
    @Test
    public void testSumRow() {
        // Original test case
        int[][] a1 = {
            {3, 1},
            {5, 1},
            {2, 1},
            {1, 3}
        };
        assertEquals(4, TwoDArrayPractice2.sumRow(a1, 0));
        assertEquals(6, TwoDArrayPractice2.sumRow(a1, 1));
        assertEquals(3, TwoDArrayPractice2.sumRow(a1, 2));
        assertEquals(4, TwoDArrayPractice2.sumRow(a1, 3));

        // Test empty array
        int[][] a2 = {};
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            TwoDArrayPractice2.sumRow(a2, 0);
        });

        // Test negative values
        int[][] a3 = {
            {-3, -1},
            {-5, -1},
            {-2, -1},
            {-1, -3}
        };
        assertEquals(-4, TwoDArrayPractice2.sumRow(a3, 0));
        assertEquals(-6, TwoDArrayPractice2.sumRow(a3, 1));
        assertEquals(-3, TwoDArrayPractice2.sumRow(a3, 2));
        assertEquals(-4, TwoDArrayPractice2.sumRow(a3, 3));

        // Test zero values
        int[][] a4 = {
            {0, 0},
            {0, 0},
            {0, 0},
            {0, 0}
        };
        assertEquals(0, TwoDArrayPractice2.sumRow(a4, 0));
        assertEquals(0, TwoDArrayPractice2.sumRow(a4, 1));
        assertEquals(0, TwoDArrayPractice2.sumRow(a4, 2));
        assertEquals(0, TwoDArrayPractice2.sumRow(a4, 3));

        // Test varying dimensions
        int[][] a5 = {
            {1, 2, 3},
            {4, 5, 6, 7},
            {8, 9}
        };
        assertEquals(6, TwoDArrayPractice2.sumRow(a5, 0));
        assertEquals(22, TwoDArrayPractice2.sumRow(a5, 1));
        assertEquals(17, TwoDArrayPractice2.sumRow(a5, 2));

        // Test null array
        int[][] a6 = null;
        // should simply execute without throwing a null pointer exception nor run time exception
        TwoDArrayPractice2.sumRow(a6, 0);
         
         
    }
}