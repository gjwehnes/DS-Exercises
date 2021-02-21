package ex022;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConditionalStatements6Test {

	@Test
	public void test() {
		assertEquals("abc", ConditionalStatements6.longestWord("a", "ab", "abc"));
		assertEquals("efg", ConditionalStatements6.longestWord("efg", "ef", "g"));
		assertEquals("hij", ConditionalStatements6.longestWord("hi", "hij", "h"));
		assertEquals("klm", ConditionalStatements6.longestWord("kl", "k", "klm"));
		assertEquals("nop", ConditionalStatements6.longestWord("nop", "n", "no"));
		assertEquals("qrs", ConditionalStatements6.longestWord("q", "qrs", "qr"));
	}

}
