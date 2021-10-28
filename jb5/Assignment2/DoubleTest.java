/*
* This file contains code for SmoothStack Essentials Java Basics 5 Assignment2
* @author Bruce Haidrey
*/

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;


/*
* This class creates junit tests for the Double class
*/
public class DoubleTest {
	private Double dub;
	private int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
	private int[] result = new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18};

	
	/*
	 * Runs before each method
	 */
	@Before
	public void setUp() {
		dub = new Double();
	}
	
	/*
	 * correctly doubles each value in the list
	 */
	@Test
	public void timesTwoTest() {
		dub.squared(arr);
		assertArrayEquals(result, arr);
	}
	

}
