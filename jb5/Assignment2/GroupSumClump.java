/*
* This file contains code for SmoothStack Essentials Java Basics 5 Assignment2
* @author Bruce Haidrey
*/

/*
* This class checks an array to see if the ints in an array can be added to a target number
*/

public class GroupSumClump {
  /*
  * This method recursively calls itself to sum the ints within the array in order to reach the target
  * @param start - position in array to start at
  * @param arr - array to iterate through
  * @param target - number to sum to
  */
  public boolean canClump(int start, int[] arr, int target) {
	  // declare all variables to use later
	  int sum = 0;
	  int itr = start;
	  int len = arr.length;
	  boolean result = false;
	
	  // check if the start is within the length of the array
	  // we recursively subtract from the target so we need to 
	  // check if the target has reached 0 meaning we're done
	  if (start >= len)
	  {
		  return target == 0;
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
	  else if (canClump(itr, arr, target))
	  {
		  result = true;
		  return result;
	  }
	  return result;


  }
	
  /*
  * @param args
  */
//  public static void main(String[] args) {
//	  GroupSumClump gsc = new GroupSumClump();
//	  
//	  int[] arr = new int[] {2, 4, 8};
//	  int[] arr2 = new int[] {1, 2, 4, 8, 1};
//	  int[] arr3 = new int[] {2, 4, 4, 8};
//	  
//	  
//	  System.out.println(gsc.canClump(0, arr, 10));
//	  System.out.println(gsc.canClump(0, arr2, 14));
//	  System.out.println(gsc.canClump(0, arr3, 14));
//  }


}
