/*
* This file contains code for SmoothStack Essentials Java Basics 5 Assignment2
* @author Bruce Haidrey
*/

/*
* This class takes a list of positive integers and returns a list with the rightmost digit of each value
*/
public class RightDigit {
  /*
  * This method takes an array of ints, and returns the int's rightmost digit
  * @param arr - array of integers to transform
  */
  public void rightMost(int[] arr) {
	  // iterate through the array and mod with 10 to return the rightmost bit
	  for (int i = 0; i < arr.length; i++)
	  {
		  arr[i] = arr[i] % 10;
	  }
  }

  /*
  * @param args
  */
  public static void main(String[] args) {
	  RightDigit rd = new RightDigit();
	  int[] arr = new int[]{101, 999, 483, 7596, 3848, 5994, 90922};
	  rd.rightMost(arr);
	  
	  for (int i = 0; i < arr.length; i++)
	  {
		  System.out.println(arr[i]);
	  }
  }
   
}
