

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class ArrayLoopingPractice1Test {


	@Test
	public void tests() {
	
		String[] firstNames = new String[] {"firstone","firsttwo"};
		String[] lastNames = new String[] {"lastone", "lasttwo"};
		
		String[] combinedNames = ArrayLoopingPractice1.combineNames(firstNames, lastNames);
		assertTrue(Arrays.equals(new String[] {"firstone lastone","firsttwo lasttwo"},combinedNames));

		firstNames = new String[] {"Aaron","Abraham", "Agamemnon"};
		lastNames = new String[] {"Akers", "Anderson", "Arbuckle"};
		
		combinedNames = ArrayLoopingPractice1.combineNames(firstNames, lastNames);
		assertTrue(Arrays.equals(new String[] {"Aaron Akers", "Abraham Anderson", "Agamemnon Arbuckle"},combinedNames));

		firstNames = new String[] {};
		lastNames = new String[] {};
		
		combinedNames = ArrayLoopingPractice1.combineNames(firstNames, lastNames);
		assertTrue(Arrays.equals(new String[] {},combinedNames));

	}


}
