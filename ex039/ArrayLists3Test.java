

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLists3Test {

	@Test
	public void test() {
		ArrayList<String> a = new ArrayList<String>(Arrays.asList("a","b","c","d","e","f"));
		ArrayList<String> b = new ArrayList<String>(Arrays.asList("b","d","f"));
		ArrayLists3.removeEveryOther(a);
		assertEquals(b,a);

		ArrayList<String> c = new ArrayList<String>(Arrays.asList("h","i","j","k","l"));
		ArrayList<String> d = new ArrayList<String>(Arrays.asList("i","k"));
		ArrayLists3.removeEveryOther(c);
		assertEquals(d,c);



	}

}
