

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ArrayLoopingPractice4Test {


	@Test
	public void tests() {

		String[] a = {"heya","yolo","YOOOOO","super long","ez"};
		assertEquals("super long",ArrayLoopingPractice4.maxLength(a));

		String[] b = {"gg","ez","no re","whaddup"};
		assertEquals("whaddup",ArrayLoopingPractice4.maxLength(b));

		String[] c = {"aaa","bbb","ccc","ddd"};
		assertEquals("aaa",ArrayLoopingPractice4.maxLength(c));
		
		String[] d = {"a","bb","ccc","dddd", "eeee"};
		assertEquals("dddd",ArrayLoopingPractice4.maxLength(d));	

		String[] e = {"eee", "dddd", "cc",  "b", "aaaaa"};
		assertEquals("aaaaa",ArrayLoopingPractice4.maxLength(e));	

		String[] f = {};
		assertEquals("",ArrayLoopingPractice4.maxLength(f));	

		String[] g = null;
		assertEquals("",ArrayLoopingPractice4.maxLength(g));	
		
	}

}
