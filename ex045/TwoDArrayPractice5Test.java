import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TwoDArrayPractice5Test {

	// generated with github copilot
	
    @Test
    public void testSumColumn() {
        // Original test cases
        int[][] a = {
            {-5, -2, -3, 7},
            {1, -5, -2, 2},
            {1, -2, 3, -4}
        };
        assertEquals(-2, TwoDArrayPractice5.sumColumn(a, 2));

        int[][] b = {
            {1, 2, 3, 4, 4, 7, 1, 6, 3, 7, 10},
            {7, 2, 3, 4, 5, 2, -3, -6, 4, 7, 11}
        };
        assertEquals(0, TwoDArrayPractice5.sumColumn(b, 7));

        int[][] c = {
            {-1, -2},
            {-3, -4}
        };
        assertEquals(-4, TwoDArrayPractice5.sumColumn(c, 0));

        // Test empty array
        int[][] d = {};
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
        	TwoDArrayPractice5.sumColumn(d, 0);
        });

        // Test negative values
        int[][] e = {
            {-1, -2, -3},
            {-4, -5, -6},
            {-7, -8, -9},
            {-10, -11, -12}
        };
        assertEquals(-26, TwoDArrayPractice5.sumColumn(e, 1));

        // Test zero values
        int[][] f = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
        };
        assertEquals(0, TwoDArrayPractice5.sumColumn(f, 2));

        // Test varying dimensions
        int[][] g = {
            {1, 2, 3},
            {4, 5, 6, 7},
            {8, 9}
        };
        assertEquals(16, TwoDArrayPractice5.sumColumn(g, 1));

        assertThrows(IndexOutOfBoundsException.class, () -> {
            TwoDArrayPractice5.sumColumn(g, 2);
        });        
        

        // Test column index out of bounds
        int[][] i = {
            {1, 2, 3, 4},
            {5, 6, 7, 8}
        };
        assertThrows(IndexOutOfBoundsException.class, () -> {
            TwoDArrayPractice5.sumColumn(i, 5);
        });        
        
        // Test null array
        int[][] h = null;
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
        	TwoDArrayPractice5.sumColumn(h, 0);
        });
 
    }
}