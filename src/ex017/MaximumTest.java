package ex017;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaximumTest {

	@Test
	public void test() {
		assertEquals(9, Maximum.maximumOfThree(3, 6, 9));
		assertEquals(18, Maximum.maximumOfThree(18, 6, 9));
		assertEquals(20, Maximum.maximumOfThree(18, 20, 9));
	}

}
