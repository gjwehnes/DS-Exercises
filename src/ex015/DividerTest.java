package ex015;
import static org.junit.Assert.*;

import org.junit.Test;

public class DividerTest {

	@Test
	public void test1() {
		
		assertEquals(2, Divider.divide(4, 2), 0.01);		
		assertEquals(2.5, Divider.divide(5, 2), 0.01);
		
	}

}

