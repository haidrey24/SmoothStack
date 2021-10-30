/*
* This file contains code for SmoothStack Essentials Java Basics 5 Assignment2
* @author Bruce Haidrey
*/

/*
* This class checks an array to see if the ints in an array can be added to a target number
*/

public class GroupSumClump {
  /*
  * This method sorts the string array from shortest to longest
  * @param words - list of strings to sort
  */
  public boolean canClump(int start, int[] arr, int target) {
	  int sum = 0;
	  int itr = start;
	  int len = arr.length;
	  boolean result = false;
	  // check if the start is within the length of the array
	  if (start >= len)
	  {
		  return result;
	  }
	  
	  // iterate through the length of the list and add to sum if
	  // the integers at i and i+1 are the same integer
	  while (itr < len && arr[itr] == arr[start])
	  {
		  // add to sum if an integer repeats and move to next location in array
		  sum += arr[itr];
		  itr++;
	  }
	  
	  // recursively call on the rest of the list and subtract the sum from the target to get new target
	  if (canClump(itr, arr, target - sum))
	  {
		  result = true;
		  return result;
	  }
	  
	  // if adding with the starting number doesn't work, recursively call by starting with next position
	  if (canClump(itr, arr, target))
	  {
		  result = true;
		  return result;
	  }
	  
	  return result;
  }
//	
//  /*
//  * @param args
//  */
//  public static void main(String[] args) {
//
//  }
//

}
