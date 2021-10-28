/*
* This file contains code for SmoothStack Essentials Java Basics 5 Assignment1
* @author Bruce Haidrey
*/


import java.time.Month;
import java.time.Year;

import org.junit.Before;
import org.junit.Test;

/*
* This class creates junit tests for the Lambda class
*/
public class MondaysTest {
	private Mondays mon;
	private Month aug;
	private Month oct;
	private Year year;
	
	/*
	 * Runs before each method
	 */
	@Before
	public void setUp() {
		mon = new Mondays();
		aug = Month.valueOf("August");
		oct = Month.valueOf("October");
		year = Year.now();
	}
	
	/*
	 * August has 5 mondays
	 */
//	public void augustTest() {
//	}
}
