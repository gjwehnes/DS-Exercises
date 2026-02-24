import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TwoDArrayPractice6Test {

	// generated with github copilot
	
    @Test
    public void testIsBorder() {
        // Test with a 3x3 array
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        assertTrue(TwoDArrayPractice6.isBorder(a, 0, 0)); // Top-left corner
        assertTrue(TwoDArrayPractice6.isBorder(a, 0, 2)); // Top-right corner
        assertTrue(TwoDArrayPractice6.isBorder(a, 2, 0)); // Bottom-left corner
        assertTrue(TwoDArrayPractice6.isBorder(a, 2, 2)); // Bottom-right corner
        assertTrue(TwoDArrayPractice6.isBorder(a, 1, 0)); // Middle-left edge
        assertTrue(TwoDArrayPractice6.isBorder(a, 1, 2)); // Middle-right edge
        assertFalse(TwoDArrayPractice6.isBorder(a, 1, 1)); // Center

        // Test with a 1x1 array
        int[][] b = {
            {1}
        };
        assertTrue(TwoDArrayPractice6.isBorder(b, 0, 0)); // Single element is on the border

        // Test with a 2x2 array
        int[][] c = {
            {1, 2},
            {3, 4}
        };
        assertTrue(TwoDArrayPractice6.isBorder(c, 0, 0)); // Top-left corner
        assertTrue(TwoDArrayPractice6.isBorder(c, 0, 1)); // Top-right corner
        assertTrue(TwoDArrayPractice6.isBorder(c, 1, 0)); // Bottom-left corner
        assertTrue(TwoDArrayPractice6.isBorder(c, 1, 1)); // Bottom-right corner

        // Test with an empty array
        int[][] d = {};
        assertFalse(TwoDArrayPractice6.isBorder(d, 0, 0)); // No elements to check

        // Test with a 4x5 array
        int[][] e = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20}
        };
        assertTrue(TwoDArrayPractice6.isBorder(e, 0, 0)); // Top-left corner
        assertTrue(TwoDArrayPractice6.isBorder(e, 0, 4)); // Top-right corner
        assertTrue(TwoDArrayPractice6.isBorder(e, 3, 0)); // Bottom-left corner
        assertTrue(TwoDArrayPractice6.isBorder(e, 3, 4)); // Bottom-right corner
        assertTrue(TwoDArrayPractice6.isBorder(e, 2, 0)); // Left edge
        assertTrue(TwoDArrayPractice6.isBorder(e, 2, 4)); // Right edge
        assertTrue(TwoDArrayPractice6.isBorder(e, 0, 2)); // Top edge
        assertTrue(TwoDArrayPractice6.isBorder(e, 3, 2)); // Bottom edge
        assertFalse(TwoDArrayPractice6.isBorder(e, 1, 1)); // Center
        assertFalse(TwoDArrayPractice6.isBorder(e, 2, 2)); // Center
        
        // Test with a null array
        int[][] f = null;
        assertFalse(TwoDArrayPractice6.isBorder(f, 0, 0)); // Null array has no border elements
    }
}