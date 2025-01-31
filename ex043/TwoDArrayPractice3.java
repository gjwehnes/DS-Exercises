
/*
 * Complete the max2Delement method.  The method should take in a 2D array as a parameter and return the highest value in the array.
 */
public class TwoDArrayPractice3 {

    public static double max2Delement(int[][] a) {
    	
    	if (a == null || a.length == 0 || a[0].length == 0) {
    		return Double.NaN;
    	}
    	
        int highest = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                highest = Math.max(highest, a[i][j]);
            }
        }
        return highest;
    }

}
