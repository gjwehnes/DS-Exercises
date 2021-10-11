package ex038;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class ArrayLists3Test {

	@Test
	public void test() {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(4);
		a.add(2);
		a.add(3);
		a.add(4);
		assertEquals(13,ArrayLists3.getSum(a));

		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(2);
		b.add(2);
		b.add(1);
		b.add(5);
		b.add(7);
		b.add(-3);
		assertEquals(14,ArrayLists3.getSum(b));
	}

}
