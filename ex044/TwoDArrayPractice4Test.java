import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class TwoDArrayPractice4Test {

	// generated with github copilot
	
    @Test
    public void testSumEvenIndex() {
        // Original test case
        int[][] a = {
            {1, 2},
            {3, 4}
        };
        assertEquals(6, TwoDArrayPractice4.sumEvenIndex(a));

        int[][] b = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10}
        };
        assertEquals(39, TwoDArrayPractice4.sumEvenIndex(b));

        int[][] c = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {10, 11, 12}
        };
        assertEquals(62, TwoDArrayPractice4.sumEvenIndex(c));

        int[][] d = {
            {1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1}
        };
        assertEquals(21, TwoDArrayPractice4.sumEvenIndex(d));

        // Test empty array
        int[][] e = {};
 //       assertTrue(Double.isNaN(TwoDArrayPractice4.sumEvenIndex(e)));

        // Test negative values
        int[][] f = {
            {-1, -2, -3},
            {-4, -5, -6},
            {-7, -8, -9},
            {-10, -11, -12}
        };
        assertEquals(-62, TwoDArrayPractice4.sumEvenIndex(f));

        // Test zero values
        int[][] g = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
        };
        assertEquals(0, TwoDArrayPractice4.sumEvenIndex(g));

        // Test varying dimensions
        int[][] h = {
            {1, 2, 3},
            {4, 5, 6, 7},
            {8, 9}
        };
        assertEquals(33, TwoDArrayPractice4.sumEvenIndex(h));

//        // Test null array
//        int[][] i = null;
//        assertTrue(Double.isNaN(TwoDArrayPractice4.sumEvenIndex(i)));
    }
}