package ex050;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class TwoDArrayPractice7Test {

	@Test
	public void test() {
		int[][] a = {
			    {1,2,3,4},
			    {1,1,1,1},
			    {2,3,1,-2}
			};
			int[] b = {10,4,4};
			assertArrayEquals(b,TwoDArrayPractice7.rowSums(a));

			int[][] c = {
			    {0,0,1},
			    {1,2,1},
			    {2,1,2}
			};
			int[] d = {1,4,5};
			assertArrayEquals(d,TwoDArrayPractice7.rowSums(c));
	}

}
