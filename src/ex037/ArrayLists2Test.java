package ex037;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class ArrayLists2Test {

	@Test
	public void test() {
		ArrayList<String> a = new ArrayList<String>();
		a.add("hi");
		a.add("there");
		a.add("howdy");
		a.add("woo");
		ArrayLists2.modify(a);
		ArrayList<String> b = new ArrayList<String>();
		b.add("git");
		b.add("there");
		b.add("gud");
		b.add("woo");

		assertEquals(b,a);
	}

}
