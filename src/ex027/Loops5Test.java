package ex027;

import static org.junit.Assert.*;

import org.junit.Test;

public class Loops5Test {

	@Test
	public void test() {
		assertEquals(5, Loops5.getTimesDivisible(32,2));
		assertEquals(4, Loops5.getTimesDivisible(31,2));
		assertEquals(5, Loops5.getTimesDivisible(33,2));
		assertEquals(10, Loops5.getTimesDivisible(1024,2));
		assertEquals(4, Loops5.getTimesDivisible(81,3));
	}

}
