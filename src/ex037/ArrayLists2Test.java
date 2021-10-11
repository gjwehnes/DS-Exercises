package ex037;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

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
