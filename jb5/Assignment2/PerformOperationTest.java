/*
* This file contains code for SmoothStack Essentials Java Basics 5 Assignment2
* @author Bruce Haidrey
*/


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


import org.junit.Before;
import org.junit.Test;


/*
* This class creates junit tests for the PerformOperation class
*/
public class PerformOperationTest {
	PerformOperation po;
	Helper help;
	
	/*
	 * Runs before each method
	 */
	@Before
	public void setUp() {
		po  = new PerformOperation();
	}
	
	/*
	 * tests an integer to see if it's even
	 */
	@Test
	public void EvenTest() {
		help = po.isOdd();
		boolean result = po.handleOperation(help, 4);
		assertFalse(result);
	}
	
	/*
	 * tests an integer to see if it's odd
	 */
	@Test
	public void OddTest() {
		help = po.isOdd();
		boolean result = po.handleOperation(help, 3);
		assertTrue(result);
	}
	
	/*
	 * tests an integer to see if it's prime
	 */
	@Test
	public void PrimeTest() {
		help = po.isPrime();
		boolean result = po.handleOperation(help, 13);
		assertTrue(result);
	}
	
	/*
	 * tests an integer to see if it's composite
	 */
	@Test
	public void CompositeTest() {
		help = po.isPrime();
		boolean result = po.handleOperation(help, 15);
		assertFalse(result);
	}
	
	/*
	 * tests an integer to see if it's a Palindrome
	 */
	@Test
	public void PalindromeTest() {
		help = po.isPalindrome();
		boolean result = po.handleOperation(help, 898);
		assertTrue(result);
	}

	/*
	 * tests an integer to see if it's not a Palindrome
	 */
	@Test
	public void NotPalindromeTest() {
		help = po.isPalindrome();
		boolean result = po.handleOperation(help, 8989);
		assertFalse(result);
	}
}
