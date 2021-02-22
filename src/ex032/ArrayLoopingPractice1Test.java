package ex032;

import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Test;

public class ArrayLoopingPractice1Test {


	@Test
	public void tests() {
		// Failure message: 
		// This test has no failure messages
		assertTrue(Arrays.equals(new String[] {"firstone lastone","firsttwo lasttwo"}, ArrayLoopingPractice1
				.combineNames(new String[] {"firstone","firsttwo"}, new String[] {"lastone", "lasttwo"})));
	}


}
