package ex024;

import static org.junit.Assert.*;

import org.junit.Test;

public class Loops2Test {

	@Test
	public void test() {
		assertEquals("(1)(2)(3)(4)", Loops2.getRange(1,5,1));
		assertEquals("(3)(4)(5)(6)(7)", Loops2.getRange(3,8,1));
		assertEquals("(1)(3)(5)(7)(9)", Loops2.getRange(1,10,2));
		assertEquals("(2)(4)(6)(8)", Loops2.getRange(2,10,2));
	}

}
