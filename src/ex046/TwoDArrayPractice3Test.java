package ex046;

import static org.junit.Assert.*;

import org.junit.Test;

public class TwoDArrayPractice3Test {

	@Test
	public void test() {
		int[][] a = {
			    {1,10},
			    {-10,1}
			};
			assertEquals(10,TwoDArrayPractice3.max2Delement(a));
			int[][] b = {
			    {1,2,3,4,1,1},
			    {5,6,7,8,9,15},
			};
			assertEquals(15,TwoDArrayPractice3.max2Delement(b));
	}

}
