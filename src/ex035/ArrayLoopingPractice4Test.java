package ex035;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ArrayLoopingPractice4Test {


	@Test
	public void tests() {
		// Failure message: 
		// This test has no failure messages
		String[] a = {"heya","yolo","YOOOOO","super long","ez"};
		assertEquals("super long",ArrayLoopingPractice4.maxLength(a));

		String[] b = {"gg","ez","no re","whaddup"};
		assertEquals("whaddup",ArrayLoopingPractice4.maxLength(b));	}


}
