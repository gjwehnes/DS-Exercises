import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TwoDArrayPractice1Test {

	// generated with github copilot
	
    @Test
    public void testDoubleArray() {
        // Original test case
        double[][] a1 = {
            {1.4, 2.0, 3.3, 2, 1},
            {4, 1.5, 6.1, 1, 1},
            {1.2, 3.1, 4, 1.6, 1}
        };
        double[][] result1 = {
            {2.8, 4, 6.6, 4, 2},
            {8, 3, 12.2, 2, 2},
            {2.4, 6.2, 8, 3.2, 2}
        };
        TwoDArrayPractice1.doubleArray(a1);
        for (int r = 0; r < a1.length; r++) {
            for (int c = 0; c < a1[0].length; c++) {
                assertEquals(result1[r][c], a1[r][c], 0.001);
            }
        }

        // Test empty array
        double[][] a2 = {};
        double[][] result2 = {};
        TwoDArrayPractice1.doubleArray(a2);
        assertEquals(result2.length, a2.length);

        // Test negative values
        double[][] a3 = {
            {-1.0, -2.5, -3.3},
            {-4.2, -5.1, -6.6}
        };
        double[][] result3 = {
            {-2.0, -5.0, -6.6},
            {-8.4, -10.2, -13.2}
        };
        TwoDArrayPractice1.doubleArray(a3);
        for (int r = 0; r < a3.length; r++) {
            for (int c = 0; c < a3[0].length; c++) {
                assertEquals(result3[r][c], a3[r][c], 0.001);
            }
        }

        // Test zero values
        double[][] a4 = {
            {0, 0, 0},
            {0, 0, 0}
        };
        double[][] result4 = {
            {0, 0, 0},
            {0, 0, 0}
        };
        TwoDArrayPractice1.doubleArray(a4);
        for (int r = 0; r < a4.length; r++) {
            for (int c = 0; c < a4[0].length; c++) {
                assertEquals(result4[r][c], a4[r][c], 0.001);
            }
        }

        // Test large values
        double[][] a5 = {
            {1000.1, 2000.2, 3000.3},
            {4000.4, 5000.5, 6000.6}
        };
        double[][] result5 = {
            {2000.2, 4000.4, 6000.6},
            {8000.8, 10001.0, 12001.2}
        };
        TwoDArrayPractice1.doubleArray(a5);
        for (int r = 0; r < a5.length; r++) {
            for (int c = 0; c < a5[0].length; c++) {
                assertEquals(result5[r][c], a5[r][c], 0.001);
            }
        }

        // Test 1x1 array
        double[][] a6 = {
            {5.0}
        };
        double[][] result6 = {
            {10.0}
        };
        TwoDArrayPractice1.doubleArray(a6);
        assertEquals(result6[0][0], a6[0][0], 0.001);

        // Test 1xN array
        double[][] a7 = {
            {1.0, 2.0, 3.0}
        };
        double[][] result7 = {
            {2.0, 4.0, 6.0}
        };
        TwoDArrayPractice1.doubleArray(a7);
        for (int c = 0; c < a7[0].length; c++) {
            assertEquals(result7[0][c], a7[0][c], 0.001);
        }

        // Test Nx1 array
        double[][] a8 = {
            {1.0},
            {2.0},
            {3.0}
        };
        double[][] result8 = {
            {2.0},
            {4.0},
            {6.0}
        };
        TwoDArrayPractice1.doubleArray(a8);
        for (int r = 0; r < a8.length; r++) {
            assertEquals(result8[r][0], a8[r][0], 0.001);
        }

        // Test MxN array
        double[][] a9 = {
            {1.0, 2.0},
            {3.0, 4.0},
            {5.0, 6.0},
            {7.0, 8.0}
        };
        double[][] result9 = {
            {2.0, 4.0},
            {6.0, 8.0},
            {10.0, 12.0},
            {14.0, 16.0}
        };
        TwoDArrayPractice1.doubleArray(a9);
        for (int r = 0; r < a9.length; r++) {
            for (int c = 0; c < a9[0].length; c++) {
                assertEquals(result9[r][c], a9[r][c], 0.001);
            }
        }
        
        // Test null array
        double[][] a10 = null;        
        // should simply execute without throwing a null pointer exception nor run time exception
        TwoDArrayPractice1.doubleArray(a10);

    }
}