/*
* This file contains code for SmoothStack Essentials Java Basics 5 Assignment2
* @author Bruce Haidrey
*/

/*
* This class takes a list of positive integers and returns a list each value doubled
*/
public class Double {
  /*
  * This method doubles each value in the array
  * @param arr - array of integers to double
  */
  public void squared(int[] arr) {
	  // iterate through the array and multiply each value by 2
	  for (int i = 0; i < arr.length; i++)
	  {
		  arr[i] = arr[i] * 2;
	  }
  }

  /*
  * @param args
  */
  public static void main(String[] args) {
	  // create instance to test method
	  Double dub = new Double();
	  int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
	  dub.squared(arr);
	  
	  for (int i = 0; i < arr.length; i++)
	  {
		  System.out.println(arr[i]);
	  }
  }
   
}
