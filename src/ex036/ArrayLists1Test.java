package ex036;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

public class ArrayLists1Test {

	@Test
	public void test() {
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = ArrayLists1.test();
		
		assertTrue(a.getClass().equals(b.getClass()));
	}

}
