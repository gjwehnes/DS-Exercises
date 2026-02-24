import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TwoDArrayPractice3Test {

	// generated with github copilot
	
    @Test
    public void testMax2Delement() {
        // Original test case
        double[][] a1 = {
            {1, 10},
            {-10, 1}
        };
        assertEquals(10, TwoDArrayPractice3.max2Delement(a1));

        double[][] b1 = {
            {1, 2, 3, 4, 1, 1},
            {5, 6, 7, 8, 9, 15}
        };
        assertEquals(15, TwoDArrayPractice3.max2Delement(b1));

        // Test empty array
        double[][] a2 = {};
        assertTrue(Double.isNaN(TwoDArrayPractice3.max2Delement(a2)));

        // Test negative values
        double[][] a3 = {
            {-3, -1},
            {-5, -1},
            {-2, -1},
            {-1, -3}
        };
        assertEquals(-1, TwoDArrayPractice3.max2Delement(a3));

        // Test zero values
        double[][] a4 = {
            {0, 0},
            {0, 0},
            {0, 0},
            {0, 0}
        };
        assertEquals(0, TwoDArrayPractice3.max2Delement(a4));

        // Test varying dimensions
        double[][] a5 = {
            {1, 2, 3},
            {4, 5, 6, 7},
            {8, 9}
        };
        assertEquals(9, TwoDArrayPractice3.max2Delement(a5));

        // Test null array
        double[][] a6 = null;
        assertEquals(Double.MIN_VALUE, TwoDArrayPractice3.max2Delement(a6));
    }
}