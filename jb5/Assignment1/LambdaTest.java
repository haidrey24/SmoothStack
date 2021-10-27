/*
* This file contains code for SmoothStack Essentials Java Basics 5 Assignment1
* @author Bruce Haidrey
*/

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

/*
* This class creates junit tests for the Lambda class
*/
public class LambdaTest {
	private Lambda lamb;
	private String[] list1 = {"Hopefully", "This", "Example", "is", "efficient", "and", "WORKS!"};
	private String[] list2 = {"Hopefully", "This", "Example", "is", "efficient", "and", "WORKS!"};
	private String[] list3 = {"Hopefully", "This", "Example", "is", "efficient", "and", "WORKS!"};
	private String[] list4 = {"Hopefully", "This", "Example", "is", "efficient", "and", "WORKS!"};
	private String[] sList = {"is", "and", "This", "WORKS!", "Example", "Hopefully", "efficient"};
	private String[] lList = {"Hopefully", "efficient", "Example", "WORKS!", "This", "and", "is"};
	private String[] alpha = {"and", "Example", "efficient", "Hopefully", "is", "This", "WORKS!"};
	private String[] e = {"efficient", "Example", "Hopefully", "This", "is", "and", "WORKS!"};
	

	
	/*
	 * Runs before each method
	 */
	@Before
	public void setUp() {
		lamb = new Lambda();
	}
	
	/*
	 * Testing the shortToLong method of the Lambda class
	 */
	@Test
	public void shortToLongTest() {
		lamb.shortToLong(list1);
		assertArrayEquals(sList, list1);
	}
	
	/*
	 * Testing the longToShort method of the Lambda class
	 */
	@Test
	public void longToShortTest() {
		lamb.longToShort(list2);
		assertArrayEquals(lList, list2);
	}
	
	/*
	 * Testing the alphabetically method of the Lambda class
	 */
	@Test
	public void alphabeticalTest() {
		lamb.alphabetically(list3);
		assertArrayEquals(alpha, list3);
	}
	
	/*
	 * Testing the containsE method of the Lambda class
	 */
	@Test
	public void containsETest() {
		lamb.containsE(list4);
		assertArrayEquals(e, list4);
	}
}
