import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class ArrayLists4Test {

    @Test
    public void testMergeLists() {
        ArrayList<String> a = new ArrayList<String>(Arrays.asList("1", "2", "3", "4"));
        ArrayList<String> b = new ArrayList<String>(Arrays.asList("a", "b", "c", "d"));
        ArrayList<String> c = new ArrayList<String>(Arrays.asList("1", "a", "2", "b", "3", "c", "4", "d"));
        assertEquals(c, ArrayLists4.mergeLists(a, b));

        ArrayList<String> d = new ArrayList<String>(Arrays.asList("a", "z", "b"));
        ArrayList<String> e = new ArrayList<String>(Arrays.asList("wow", "very"));
        ArrayList<String> f = new ArrayList<String>(Arrays.asList("a", "wow", "z", "very", "b"));
        assertEquals(f, ArrayLists4.mergeLists(d, e));

        ArrayList<String> g = new ArrayList<String>(Arrays.asList("x", "y", "z"));
        ArrayList<String> h = new ArrayList<String>(Arrays.asList());
        ArrayList<String> i = new ArrayList<String>(Arrays.asList("x", "y", "z"));
        assertEquals(i, ArrayLists4.mergeLists(g, h));

        ArrayList<String> j = new ArrayList<String>(Arrays.asList());
        ArrayList<String> k = new ArrayList<String>(Arrays.asList("1", "2", "3"));
        ArrayList<String> l = new ArrayList<String>(Arrays.asList("1", "2", "3"));
        assertEquals(l, ArrayLists4.mergeLists(j, k));
    }
}