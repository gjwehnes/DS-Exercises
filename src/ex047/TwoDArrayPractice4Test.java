package ex047;

import static org.junit.Assert.*;

import org.junit.Test;

public class TwoDArrayPractice4Test {

	@Test
	public void test() {
		int[][] c = {
			    {1,2},
			    {3,4}
			};
			assertEquals(6,TwoDArrayPractice4.sumEvenIndex(c));

			int[][] d = {
			    {1,1},
			    {1,1}
			};
			assertEquals(3,TwoDArrayPractice4.sumEvenIndex(d));
	}

}
