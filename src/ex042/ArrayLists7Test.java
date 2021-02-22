package ex042;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLists7Test {

	@Test
	public void test() {
		ArrayList<String> a = new ArrayList<String>(Arrays.asList("a","b","c","d","e","f"));
		ArrayList<String> b = new ArrayList<String>(Arrays.asList("b","d","f"));
		ArrayLists7.removeEveryOther(a);
		assertEquals(b,a);

		ArrayList<String> c = new ArrayList<String>(Arrays.asList("h","i","j","k","l"));
		ArrayList<String> d = new ArrayList<String>(Arrays.asList("i","k"));
		ArrayLists7.removeEveryOther(c);
		assertEquals(d,c);



	}

}
