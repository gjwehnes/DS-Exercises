import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class TwoDArrayPractice7Test {
	
	// generated with github copilot

	@Test
    public void testRowSums() {
        // Test with the provided example
        int[][] aIn = {
            {1, 1, 2},
            {3, 1, 2},
            {3, 5, 3},
            {0, 1, 2}
        };
        int[] aOut = {4, 6, 11, 3};
        assertArrayEquals(aOut, TwoDArrayPractice7.rowSums(aIn));

        // Test with an empty array
        int[][] bIn = {};
        int[] bOut = {};
        assertArrayEquals(bOut, TwoDArrayPractice7.rowSums(bIn));

        // Test with a null array
        int[][] cIn = null;
        int[] cOut = {};
        assertArrayEquals(cOut, TwoDArrayPractice7.rowSums(cIn));

        // Test with a 1x1 array
        int[][] dIn = {
            {5}
        };
        int[] dOut = {5};
        assertArrayEquals(dOut, TwoDArrayPractice7.rowSums(dIn));

        // Test with a 2x2 array
        int[][] eIn = {
            {1, 2},
            {3, 4}
        };
        int[] eOut = {3, 7};
        assertArrayEquals(eOut, TwoDArrayPractice7.rowSums(eIn));

        // Test with a 3x3 array with negative numbers
        int[][] fIn = {
            {-1, -2, -3},
            {-4, -5, -6},
            {-7, -8, -9}
        };
        int[] fOut = {-6, -15, -24};
        assertArrayEquals(fOut, TwoDArrayPractice7.rowSums(fIn));

        // Test with a 4x5 array
        int[][] gIn = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20}
        };
        int[] gOut = {15, 40, 65, 90};
        assertArrayEquals(gOut, TwoDArrayPractice7.rowSums(gIn));

        // Test with varying row lengths
        int[][] hIn = {
            {1, 2, 3},
            {4, 5},
            {6}
        };
        int[] hOut = {6, 9, 6};
        assertArrayEquals(hOut, TwoDArrayPractice7.rowSums(hIn));
    }
}