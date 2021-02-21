package ex016;

import static org.junit.Assert.*;

import org.junit.Test;

public class DonutBoxesTest {

	@Test
	public void test() {
		assertEquals(1, DonutBoxes.calculateBoxes(3));
		assertEquals(1, DonutBoxes.calculateBoxes(12));
		assertEquals(2, DonutBoxes.calculateBoxes(13));
		assertEquals(2, DonutBoxes.calculateBoxes(23));
		assertEquals(2, DonutBoxes.calculateBoxes(24));
		assertEquals(3, DonutBoxes.calculateBoxes(25));
		assertEquals(3, DonutBoxes.calculateBoxes(36));
		assertEquals(12, DonutBoxes.calculateBoxes(144));
	}

}
