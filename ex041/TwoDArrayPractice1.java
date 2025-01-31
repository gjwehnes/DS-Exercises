
/*
* Complete the method doubleArr method so that it doubles the values of every element in the 2D array passed in.
* Nothing should be returned - the array should be modified by the method.
*/
public class TwoDArrayPractice1 {

	
	public static void doubleArray(double[][] a) {
	    
	    for (int i = 0; i < a.length; ++i) {
	     
	        for (int j = 0; j < a[i].length; ++j) {
	            
		                a[i][j] = a[i][j] * 2;
		            }
		        }
		    }
	}
