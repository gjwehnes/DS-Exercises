package ex019;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConditionalStatements2Test {

	@Test
	public void test() {
		assertEquals("positive", ConditionalStatements2.getSignum(33));
		assertEquals("negative", ConditionalStatements2.getSignum(-25));
		assertEquals("zero", ConditionalStatements2.getSignum(0));
	}

}
