/*
* This file contains code for SmoothStack Essentials Java Basics 5 Assignment1
* @author Bruce Haidrey
*/

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


/*
* This class creates junit tests for the CommaSeparated class
*/
public class CommaSeparatedTest {
	private CommaSeparated cs;
	private List<Integer> even;
	private List<Integer> odd;
	private List<Integer> empty;
	
	/*
	 * Runs before each method
	 */
	@Before
	public void setUp() {
		cs = new CommaSeparated();
		even = new ArrayList<Integer>(Arrays.asList(0,2,4,6,8));
		odd = new ArrayList<Integer>(Arrays.asList(1,3,5,7,9));
		empty = new ArrayList<Integer>();
	}
	
	/*
	 * list with all even numbers
	 */
	@Test
	public void evenList() {
		assertEquals("e0,e2,e4,e6,e8", cs.deList(even));
	}
	
	/*
	 * list with all odd numbers
	 */
	@Test
	public void oddList() {
		assertEquals("o1,o3,o5,o7,o9", cs.deList(odd));
	}
	
	/*
	 * empty list
	 */
	@Test
	public void emptyList() {
		assertEquals("", cs.deList(empty));
	}
}
