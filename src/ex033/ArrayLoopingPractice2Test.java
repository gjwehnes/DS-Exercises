package ex033;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArrayLoopingPractice2Test {

	@Test
	public void tests() {
		// Failure message: 
		// This test has no failure messages
		assertTrue(Arrays.equals(new double[] {10.0,20.0,30.0}, ArrayLoopingPractice2.timesTen(new double[] {1,2,3})));
	}


}
