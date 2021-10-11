package ex048;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TwoDArrayPractice5Test {

	@Test
	public void test() {
		int[][] a = {
			    {-5,-2,-3,7},
			    {1,-5,-2,2},
			    {1,-2,3,-4}
			};
			assertEquals(-2,TwoDArrayPractice5.sumColumn(a,2));
			int[][] b = {
			    {1,2,3,4,4,7,1,6,3,7,10},
			    {7,2,3,4,5,2,-3,-6,4,7,11}
			};
			assertEquals(0,TwoDArrayPractice5.sumColumn(b,7));
			int[][] c = {
			    {-1,-2},
			    {-3,-4}
			};
			assertEquals(-4,TwoDArrayPractice5.sumColumn(c,0));
	}

}
