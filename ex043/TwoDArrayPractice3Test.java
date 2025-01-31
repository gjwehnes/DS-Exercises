import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class TwoDArrayPractice3Test {

	// generated with github copilot
	
    @Test
    public void testMax2Delement() {
        // Original test case
        int[][] a1 = {
            {1, 10},
            {-10, 1}
        };
        assertEquals(10, TwoDArrayPractice3.max2Delement(a1));

        int[][] b1 = {
            {1, 2, 3, 4, 1, 1},
            {5, 6, 7, 8, 9, 15}
        };
        assertEquals(15, TwoDArrayPractice3.max2Delement(b1));

        // Test empty array
        int[][] a2 = {};
        assertTrue(Double.isNaN(TwoDArrayPractice3.max2Delement(a2)));

        // Test negative values
        int[][] a3 = {
            {-3, -1},
            {-5, -1},
            {-2, -1},
            {-1, -3}
        };
        assertEquals(-1, TwoDArrayPractice3.max2Delement(a3));

        // Test zero values
        int[][] a4 = {
            {0, 0},
            {0, 0},
            {0, 0},
            {0, 0}
        };
        assertEquals(0, TwoDArrayPractice3.max2Delement(a4));

        // Test varying dimensions
        int[][] a5 = {
            {1, 2, 3},
            {4, 5, 6, 7},
            {8, 9}
        };
        assertEquals(9, TwoDArrayPractice3.max2Delement(a5));

        // Test null array
        int[][] a6 = null;
        assertTrue(Double.isNaN(TwoDArrayPractice3.max2Delement(a6)));
    }
}