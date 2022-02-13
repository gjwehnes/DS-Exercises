package ex037;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

public class ArrayLists2Test {

	@Test
	public void test() {
		
		ArrayList<String> comparison = new ArrayList<String>();
		
		comparison.add("alpha");		
		comparison.add("beta");		
		comparison.add("gamma");		
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("one");
		a.add("two");
		a.add("three");
		ArrayLists2.modify(a);		
		assertEquals(comparison,a);
		
		ArrayList<String> b = new ArrayList<String>();
		b.add("A");
		b.add("B");
		b.add("C");
		ArrayLists2.modify(b);		
		assertEquals(comparison,b);
	}

}
