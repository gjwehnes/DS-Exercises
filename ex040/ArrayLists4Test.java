

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLists4Test {

	@Test
	public void test() {
		ArrayList<String> a = new ArrayList<String>(Arrays.asList("a","b","c","d","e","f"));
		ArrayList<String> b = new ArrayList<String>(Arrays.asList("b","d","f"));
		ArrayLists4.removeEveryOther(a);
		assertEquals(b,a);

		ArrayList<String> c = new ArrayList<String>(Arrays.asList("h","i","j","k","l"));
		ArrayList<String> d = new ArrayList<String>(Arrays.asList("i","k"));
		ArrayLists4.removeEveryOther(c);
		assertEquals(d,c);



	}

}
