package ex045;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TwoDArrayPractice2Test {

	@Test
	public void test() {
		int[][] a = {
				{3,1},
				{5,1},
				{2,1},
				{1,3}
		};
		assertEquals(4,TwoDArrayPractice2.sumRow(a,0));
		assertEquals(6,TwoDArrayPractice2.sumRow(a,1));
		assertEquals(3,TwoDArrayPractice2.sumRow(a,2));
		assertEquals(4,TwoDArrayPractice2.sumRow(a,3));
	}

}
