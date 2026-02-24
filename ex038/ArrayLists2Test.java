

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLists2Test {

	@Test
	public void test() {
		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
		ArrayLists2.timesTwo(a);
		ArrayList<Integer> b = new ArrayList<Integer>(Arrays.asList(2,4,6,8));
		assertEquals(b,a);

		ArrayList<Integer> c = new ArrayList<Integer>(Arrays.asList(6,3,1,2,3,-5));
		ArrayLists2.timesTwo(c);
		ArrayList<Integer> d = new ArrayList<Integer>(Arrays.asList(12,6,2,4,6,-10));
		assertEquals(d,c);


	}

}
