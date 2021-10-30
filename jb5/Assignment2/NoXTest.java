/*
* This file contains code for SmoothStack Essentials Java Basics 5 Assignment2
* @author Bruce Haidrey
*/

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


/*
* This class creates junit tests for the NoX class
*/
public class NoXTest {
	private NoX removed;
	List<String> list = new ArrayList<String>
	(Arrays.asList("xray"));
	List<String> result = new ArrayList<String>
	(Arrays.asList("ray"));
	
	/*
	 * Runs before each method
	 */
	@Before
	public void setUp() {
		removed = new NoX();
	}
	
	/*
	 * tests to correctly remove every x character in the list of strings
	 */
	@Test
	public void timesTwoTest() {
		List<String> finalList = removed.removeX(list);
		assertEquals(result, finalList);
	}
	

}
