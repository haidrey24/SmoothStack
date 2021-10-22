/*
* This file contains code for SmoothStack Essentials Java Basics 2 Assignment2
* @author Bruce Haidrey
*/

/*
This class constructs a 2D array and finds the max number. It also show its position in the array
*/
public class DisplayMax {

  /*
  * Finds the max number and its position
  * @param arr - array to be searched
  */
  private void findMax(int[][] arr) {
    // temp variables used for return
    int max = 0;
    int tempI = 0;
    int tempJ = 0;

    // iterate through the rows
    for (int i = 0; i < arr.length; i++)
    {
      // iterate through the columns
      for (int j = 0; j < arr[i].length; j++)
      {
        // if the number at this position in the array is greater than the max
        if (arr[i][j] > max)
        {
          // update max
          max = arr[i][j];
          tempI = i;
          tempJ = j;
        }
      }
    }

    // print out the max and its position
    System.out.print("The max number in this array is: " + max);
    System.out.print(" at position (" + tempI +"," + tempJ +")");

  }

  /*
  * @param args
  */
  public static void main(String[] args) {
    // create instance of the class
    DisplayMax a = new DisplayMax();

    // sample arrays to test first and last spots on array
    int[][] arr = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8, 9}};
    int[][] arr2 = {{94, 1, 2, 76}, {4, 5}, {6, 7, 8, 9, 27}};

    // call the functions
    a.findMax(arr);
    System.out.println();
    a.findMax(arr2);
  }


}
