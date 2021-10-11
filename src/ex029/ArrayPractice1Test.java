package ex029;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ArrayPractice1Test {

	@Test
	public void test() {
		int[] a = {1,2,3,4,5};
		int[] b = {3,4,5};
		assertEquals(15,ArrayPractice1.sumElements(a));
		assertEquals(12,ArrayPractice1.sumElements(b));

	}

}
