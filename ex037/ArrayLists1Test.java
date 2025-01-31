

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class ArrayLists1Test {

	@Test
	public void test() {
		ArrayList<String> a = new ArrayList<String>(Arrays.asList("1","2","3","4"));
		ArrayList<String> b = new ArrayList<String>(Arrays.asList("3","4"));
		ArrayList<String> c = new ArrayList<String>(Arrays.asList("1","2","3","4","3","4"));
		assertEquals(c,ArrayLists1.combineLists(a,b));

		ArrayList<String> d = new ArrayList<String>(Arrays.asList("a","z","b"));
		ArrayList<String> e = new ArrayList<String>(Arrays.asList("wow","very","doge","such","meme"));
		ArrayList<String> f = new ArrayList<String>(Arrays.asList("a","z","b","wow","very","doge","such","meme"));
		assertEquals(f,ArrayLists1.combineLists(d,e));
		
		ArrayList<String> g = new ArrayList<String>(Arrays.asList("x","y","z"));
		ArrayList<String> h = new ArrayList<String>(Arrays.asList());
		ArrayList<String> i = new ArrayList<String>(Arrays.asList("x","y","z"));
		assertEquals(i,ArrayLists1.combineLists(g,h));
		
	}

}
