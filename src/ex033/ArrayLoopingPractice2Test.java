package ex033;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class ArrayLoopingPractice2Test {

	@Test
	public void tests() {
		// Failure message: 
		// This test has no failure messages
		assertTrue(Arrays.equals(new double[] {10.0,20.0,30.0}, ArrayLoopingPractice2.timesTen(new double[] {1,2,3})));
	}


}
