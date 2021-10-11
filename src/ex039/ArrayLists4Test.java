package ex039;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLists4Test {

	@Test
	public void test() {
		ArrayList<String> a = new ArrayList<String>(Arrays.asList("how","is","everyone","doing?"));
		ArrayLists4.addElements(a);
		ArrayList<String> b = new ArrayList<String>(Arrays.asList("hey","how","is","yo","everyone","doing?"));
		assertEquals(b,a);

		ArrayList<String> c = new ArrayList<String>(Arrays.asList("1","2","3","4","5","6"));
		ArrayLists4.addElements(c);
		ArrayList<String> d = new ArrayList<String>(Arrays.asList("hey","1","2","yo","3","4","5","6"));
		assertEquals(d,c);
	}

}
