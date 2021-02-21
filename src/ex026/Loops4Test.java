package ex026;

import static org.junit.Assert.*;

import org.junit.Test;

public class Loops4Test {

	@Test
	public void test() {
		assertEquals("olleh", Loops4.reverseString("hello"));
		assertEquals("stonk otni sgnirts gniyt evol I", Loops4.reverseString("I love tying strings into knots"));
		assertEquals("101010", Loops4.reverseString("010101"));
		assertEquals("kayak", Loops4.reverseString("kayak"));
		assertEquals("dennis sinned", Loops4.reverseString("dennis sinned"));
	}

}
