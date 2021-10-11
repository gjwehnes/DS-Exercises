package ex034;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ArrayLoopingPractice3Test {


	@Test
	public void tests() {
		// Failure message: 
		// This test has no failure messages
		int[] a = {6,3,8,3,1,1,6,4,-2};
		assertEquals(8,ArrayLoopingPractice3.maxValue(a));

		int[] b = {67,83,33,57,356};
		assertEquals(356,ArrayLoopingPractice3.maxValue(b));

		int[] c = {-18,-72,-5,-11,-42};
		assertEquals(-5,ArrayLoopingPractice3.maxValue(c));

	}

}
