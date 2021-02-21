package ex021;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConditionalStatements4Test {

	@Test
	public void test() {
		assertEquals("suddenly", ConditionalStatements4.makeAdjective("sudden"));
		assertEquals("mysteriously", ConditionalStatements4.makeAdjective("mysterious"));

		assertEquals("happily", ConditionalStatements4.makeAdjective("happy"));
		assertEquals("hastily", ConditionalStatements4.makeAdjective("hasty"));

		assertEquals("terribly", ConditionalStatements4.makeAdjective("terrible"));
		assertEquals("predictably", ConditionalStatements4.makeAdjective("predictable"));
	
	}

}
