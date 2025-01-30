
/*
 * Complete the maxLength method so that given the array words, it will return the word with the largest length.
*/
public class ArrayLoopingPractice4 {

	public static String maxLength(String[] a) {
		
		if (a == null) {
			return "";
		}
		if (a.length == 0) {
			return "";
		}
		
	    String large = a[0];
	    int i;
        int max = a[0].length();
        for (i = 0; i < a.length; i++) {
            if (a[i].length() > max) {
                max = a[i].length();  
                large = a[i];
            }
        }
		return large;
	}
}