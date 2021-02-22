package ex031;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayPractice3Test {

	@Test
	public void test() {
		int[] a = {1,2,3,4,5};
		int[] b = {6,2,73,5,1,6};
		ArrayPractice3.timesTen(a);
		ArrayPractice3.timesTen(b);
		assertArrayEquals(new int[] {10,1,30,2,50},a);
		assertArrayEquals(new int[] {3,1,730,50,10,3},b);
	}

}
