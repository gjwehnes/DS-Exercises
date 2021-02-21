package ex018;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConditionalStatements1Test {

	@Test
	public void test() {
		assertEquals("odd", ConditionalStatements1.isNumberEven(13));
		assertEquals("even", ConditionalStatements1.isNumberEven(16));
		assertEquals("even", ConditionalStatements1.isNumberEven(42));
		assertEquals("odd", ConditionalStatements1.isNumberEven(99));
		assertEquals("odd", ConditionalStatements1.isNumberEven(-3));
		assertEquals("even", ConditionalStatements1.isNumberEven(-6));
		assertEquals("even", ConditionalStatements1.isNumberEven(0));
	}

}
