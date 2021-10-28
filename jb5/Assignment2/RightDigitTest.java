/*
* This file contains code for SmoothStack Essentials Java Basics 5 Assignment2
* @author Bruce Haidrey
*/

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;


/*
* This class creates junit tests for the RightDigit class
*/
public class RightDigitTest {
	private RightDigit rd;
	private int[] arr = new int[]{101, 999, 483, 7596, 3848, 5994, 90922};
	private int[] result = new int[]{1, 9, 3, 6, 8, 4, 2};

	
	/*
	 * Runs before each method
	 */
	@Before
	public void setUp() {
		rd = new RightDigit();
	}
	
	/*
	 * list with all even numbers
	 */
	@Test
	public void rightMostTest() {
		rd.rightMost(arr);
		assertArrayEquals(result, arr);
	}
	

}
