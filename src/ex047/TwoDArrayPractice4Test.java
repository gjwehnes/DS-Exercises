package ex047;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TwoDArrayPractice4Test {

	@Test
	public void test() {
		int[][] a = {
				{1,2},
				{3,4}
		};
		assertEquals(6,TwoDArrayPractice4.sumEvenIndex(a));

		int[][] b = {
				{1,2,3,4,5},
				{6,7,8,9,10}
		};
		assertEquals(39,TwoDArrayPractice4.sumEvenIndex(b));

		int[][] c = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
				{10,11,12}
		};
		assertEquals(62,TwoDArrayPractice4.sumEvenIndex(c));

		int[][] d = {
				{1,1,1,1,1},
				{1,1,1,1,1},
				{1,1,1,1,1},
				{1,1,1,1,1},
				{1,1,1,1,1}
		};
		assertEquals(21,TwoDArrayPractice4.sumEvenIndex(d));

	}

}
