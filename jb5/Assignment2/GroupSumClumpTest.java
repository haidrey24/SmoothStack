/*
* This file contains code for SmoothStack Essentials Java Basics 5 Assignment2
* @author Bruce Haidrey
*/


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


import org.junit.Before;
import org.junit.Test;


/*
* This class creates junit tests for the GroupSumClump class
*/
public class GroupSumClumpTest {
	GroupSumClump gsc;
	private int[] arr = new int[] {2, 4, 8};
	private int[] arr2 = new int[] {1, 2, 4, 8, 1};
	private int[] arr3 = new int[] {2, 4, 4, 8};
		
	
	/*
	 * Runs before each method
	 */
	@Before
	public void setUp() {
		gsc  = new GroupSumClump();
	}
	
	/*
	 * tests to see if the ints in an array can be sum'd to the target
	 */
	@Test
	public void canClumpTest() {
		boolean result = gsc.canClump(0, arr, 10);
		assertTrue(result);
	}
	
	/*
	 * tests to see if the ints in an array can be sum'd to the target
	 */
	@Test
	public void canClumpTest2() {
		boolean result2 = gsc.canClump(0, arr2, 14);
		assertTrue(result2);
	}
	
	/*
	 * tests to see if the ints in an array can be sum'd to the target
	 */
	@Test
	public void canClumpTest3() {
		boolean result3 = gsc.canClump(0, arr3, 14);
		assertFalse(result3);
	}
	
	

}
