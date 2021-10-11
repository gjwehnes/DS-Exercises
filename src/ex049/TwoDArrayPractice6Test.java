package ex049;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TwoDArrayPractice6Test {

	@Test
	public void test() {
		int[][] a = {
			    {1,1,1,1},
			    {1,1,1,1},
			    {1,1,1,1},
			    {1,1,1,1},
			    {1,1,1,1}
			};
			assertEquals(true,TwoDArrayPractice6.isBorder(a,0,3));
			assertEquals(false,TwoDArrayPractice6.isBorder(a,3,2));
			assertEquals(true,TwoDArrayPractice6.isBorder(a,4,3));
			assertEquals(true,TwoDArrayPractice6.isBorder(a,1,3));
			assertEquals(true,TwoDArrayPractice6.isBorder(a,3,0));
			assertEquals(false,TwoDArrayPractice6.isBorder(a,3,2));
	}

}
