/*
* This file contains code for SmoothStack Essentials Java Basics 4 Assignment4
* @author Bruce Haidrey
*/

package com.ss.jb.four.test;

import com.ss.jb.four.Line;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

//import org.junit.BeforeClass;
import org.junit.Test;

/*
* This class creates junit tests for the Line class
*/
public class LineTest {
	/*
	 * getSlope
	 * Create a test to show a positive vs negative slope
	 * Create a test to show fractions
	 * Create a test to show denominator as 0
	 */
	@Test(expected = ArithmeticException.class)
	public void zeroDenominatorTest() {
		Line x = new Line(1.0, 2.0, 1.0, 4.0);
		x.getSlope();
	}
	
	@Test
	public void posSlopeTest() {
		Line pos = new Line(5.0, 10.0, 2.0, 4.0);
		assertEquals(2.0, pos.getSlope(), 0.0001);
	}
	
	@Test
	public void negSlopeTest() {
		Line neg = new Line(2.0, 10.0, 5.0, 4.0);
		assertEquals(-2, neg.getSlope(), 0.0001);
	}
	
	@Test
	public void fractionTest() {
		Line frac1 = new Line(7.0, 6.0, 10.0, 13.0);
		Line frac2 = new Line(6.0, 7.0, 13.0, 10.0);
		assertEquals(2.3333, frac1.getSlope(), 0.0001);
		assertEquals(0.4286, frac2.getSlope(), 0.0001);
	}
	
	/*
	 * getDistance
	 * see if sqrt is positive
	 * sqrt of 0
	 */
	
	@Test
	public void posDistTest() {
		Line pos = new Line(5.0, 10.0, 2.0, 4.0);
		assertEquals(Math.sqrt(45), pos.getDistance(), 0.0001);
	}
	
	@Test
	public void zeroDistTest() {
		Line zero = new Line(0.0, 0.0, 0.0, 0.0);
		assertEquals(Math.sqrt(0), zero.getDistance(), 0.0001);
	}
	
	/*
	 * parallelTo
	 * test to see if slopes are parallel
	 * test to see if slopes aren't parallel
	 * test to see if both slopes are 0
	 * test to see if slopes are inverses of each other
	 */
	
	@Test
	public void perpendicularTest() {
		Line pos = new Line(5.0, 10.0, 2.0, 4.0);
		Line neg = new Line(2.0, 10.0, 4.0, 9.0);
		assertFalse(pos.parallelTo(neg));
		
	}
	
	@Test(expected = ArithmeticException.class)
	public void zeroSlopeTest() {
		Line zero1 = new Line(0.0, 0.0, 0.0, 0.0);
		Line zero2 = new Line(0.0, 0.0, 0.0, 0.0);
		zero1.parallelTo(zero2);
	}
	
	@Test
	public void parallelTest() {
		Line pos = new Line(5.0, 10.0, 2.0, 4.0);
		Line neg = new Line(2.0, 10.0, 3.0, 12.0);
		assertTrue(pos.parallelTo(neg));
	}
}
