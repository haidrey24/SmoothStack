/*
* This file contains code for SmoothStack Essentials Java Basics 5 Assignment1
* @author Bruce Haidrey
*/

/*
* This class uses a static helper method to check if a string contains e
*/

public class Utils {
  /*
  * Sorts the string array to list words that contain 'e' first, and others second
  * @param words - list of strings to sort
  */
  public static int helper(String s1, String s2) {
    // use String method to see if the string contains char 'e'
    if (s1.toLowerCase().contains("e")) {
      return -1;
    }
    else {
      return 1;
    }
  }


}
