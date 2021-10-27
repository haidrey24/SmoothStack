/*
* This file contains code for SmoothStack Essentials Java Basics 5 Assignment1
* @author Bruce Haidrey
*/

import static org.junit.Assert.assertEquals;

import java.time.Month;
import java.time.Year;

import org.junit.Before;
import org.junit.Test;


/*
* This class creates junit tests for the FridayThirteenth class
*/
public class FridayThirteenthTest {
	private FridayThirteenth ft;
	private Month aug;
	private Month jan;
	private Year current;
	private Year twoK;
	
	/*
	 * Runs before each method
	 */
	@Before
	public void setUp() {
		ft = new FridayThirteenth();
		aug = Month.valueOf("AUGUST");
		jan = Month.valueOf("JANUARY");
		current = Year.of(2021);
		twoK = Year.of(2000);
	}
	
	/*
	 * August 13 2021 - true
	 */
	@Test
	public void correctDate() {
		assertEquals("true", ft.calculateDate(aug, 13, current));
	}
	
	/*
	 * January 12 2000 - false
	 */
	@Test
	public void incorrectDate() {
		assertEquals("false", ft.calculateDate(jan, 12, twoK));
	}
}
