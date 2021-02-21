package ex023;

import static org.junit.Assert.*;

import org.junit.Test;

public class Loops1Test {

	@Test
	public void test() {
		assertEquals(15, Loops1.getSum(5));
		assertEquals(55, Loops1.getSum(10));
		assertEquals(1, Loops1.getSum(1));
	}

}
