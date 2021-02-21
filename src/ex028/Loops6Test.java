package ex028;

import static org.junit.Assert.*;

import org.junit.Test;

public class Loops6Test {

	@Test
	public void test() {
		assertEquals(15, Loops6.investmentCalculator(1000, 5, 2000));
		assertEquals(70, Loops6.investmentCalculator(1, 1, 2));
		assertEquals(13, Loops6.investmentCalculator(11.11, 5.5, 22.22));
		assertEquals(0, Loops6.investmentCalculator(1000, 5, 1000));
		assertEquals(0, Loops6.investmentCalculator(1000, 5, 500));
		assertEquals(-1, Loops6.investmentCalculator(1000, 0, 2000));
		assertEquals(-1, Loops6.investmentCalculator(0, 5, 2000));
	}

}
