/*
* This file contains code for SmoothStack Essentials Java Basics 5 Assignment1
* @author Bruce Haidrey
*/

import java.util.Arrays;

/*
* This class implements Basic Lambda array configuration
*/

public class Lambda {
  /*
  * This method sorts the string array from shortest to longest
  * @param words - list of strings to sort
  */
  public void shortToLong(String[] words) {
    Arrays.sort(words, (s1, s2) -> s1.length() - s2.length());
    Arrays.stream(words).forEach(System.out::println);
  }

  /*
  * This method sorts the string array from longest to shortest
  * @param words - list of strings to sort
  */
  public void longToShort(String[] words) {
    Arrays.sort(words, (s1, s2) -> s2.length() - s1.length());
    Arrays.stream(words).forEach(System.out::println);
  }

  /*
  * This method sorts the string array alphabetically
  * @param words - list of strings to sort
  */
  public void alphabetically(String[] words) {
    Arrays.sort(words, (s1, s2) -> s1.toLowerCase().charAt(0) - s2.toLowerCase().charAt(0));
    Arrays.stream(words).forEach(System.out::println);
  }

  /*
  * This method sorts the string array into words containing 'e' first, and the rest second
  * @param words - list of strings to sort
  */
  public void containsE(String[] words) {
    Arrays.sort(words, (s1, s2) -> {
      if (s1.toLowerCase().contains("e")) {
        return -1;
      }
      else {
        return 1;
      }
    });
    Arrays.stream(words).forEach(System.out::println);
  }

  /*
  * @param args
  */
  public static void main(String[] args) {
	// String list to test helper method. Used junit for other methods
    String[] list = {"Hopefully", "This", "Example", "is", "efficient", "and", "WORKS!"};

    // call the helper method and print the results
    System.out.println("Contains e using static helper method");
    Arrays.sort(list, (s1, s2) -> Utils.helper(s1, s2));
    Arrays.stream(list).forEach(System.out::println);
  }


}
