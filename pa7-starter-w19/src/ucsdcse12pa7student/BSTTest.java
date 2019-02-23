package ucsdcse12pa7student;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.junit.*;

public class BSTTest {

	/**
	 * This is an example test that shows using a method reference as a Comparator.
	 * The use of String::compareTo accomplishes the same thing as writing out a
	 * whole interface implementation like below and using `new StringComparator()`.
	 * 
	 * It is highly recommended that you use method references like these to make
	 * testing easier. Note that Integer::compareTo is a method that can be
	 * referenced this way as well!
	 * 
	 * class StringComparator implements Comparator<String> {
	 * 
	 *   public int compare(String s1, String s2) { return s1.compareTo(s2); }
	 * 
	 * }
	 */
	@Test
	public void testSetAndGet() {
		BSTMap<String, Integer> bst = new BSTMap<>(String::compareTo);
		bst.set("a", 1);
		assertEquals(1, (int) bst.get("a"));
	}


}
