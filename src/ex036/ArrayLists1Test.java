package ex036;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class ArrayLists1Test {

	@Test
	public void test() {
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = ArrayLists1.test();
		
		assertTrue(a.getClass().equals(b.getClass()));
	}

}
