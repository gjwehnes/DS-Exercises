

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ArrayPractice2Test {

	@Test
	public void test() {
		
		int[] a = {5,3,7,2,1,5};
		assertEquals(3.833333,ArrayPractice2.avgElements(a),0.001);
		
		int[] b = {5,3,-2,6,-9,5,2};
		assertEquals(1.4285714,ArrayPractice2.avgElements(b),0.001);

		int[] c = {};
		assertEquals(true,Double.isNaN(ArrayPractice2.avgElements(c)));
			
	}

}
