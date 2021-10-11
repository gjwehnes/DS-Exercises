package ex043;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLists8Test {

	@Test
	public void test() {
		ArrayList<String> a = new ArrayList<String>(Arrays.asList("a","b","c","d","e","f"));
		ArrayList<String> b = new ArrayList<String>(Arrays.asList("b","d","f"));
		ArrayLists8.removeEveryOther(a);
		assertEquals(b,a);

		ArrayList<String> c = new ArrayList<String>(Arrays.asList("h","i","j","k","l"));
		ArrayList<String> d = new ArrayList<String>(Arrays.asList("i","k"));
		ArrayLists8.removeEveryOther(c);
		assertEquals(d,c);



	}

}
