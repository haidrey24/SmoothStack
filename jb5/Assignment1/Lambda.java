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
  private void shortToLong(String[] words) {
    Arrays.sort(words, (s1, s2) -> s1.length() - s2.length());
    Arrays.stream(words).forEach(System.out::println);
  }

  /*
  * This method sorts the string array from longest to shortest
  * @param words - list of strings to sort
  */
  private void longToShort(String[] words) {
    Arrays.sort(words, (s1, s2) -> s2.length() - s1.length());
    Arrays.stream(words).forEach(System.out::println);
  }

  /*
  * This method sorts the string array alphabetically
  * @param words - list of strings to sort
  */
  private void alphabetically(String[] words) {
    Arrays.sort(words, (s1, s2) -> s1.toLowerCase().charAt(0) - s2.toLowerCase().charAt(0));
    Arrays.stream(words).forEach(System.out::println);
  }

  /*
  * This method sorts the string array into words containing 'e' first, and the rest second
  * @param words - list of strings to sort
  */
  private void containsE(String[] words) {
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

  // /*
  // * This helper method sorts the string array like containsE
  // * @param words - list of strings to sort
  // */
  // private static int helper(String s1, String s2) {
  //   if (s1.toLowerCase().contains("e")) {
  //     return -1;
  //   }
  //   else {
  //     return 1;
  //   }
  // }

  /*
  * @param args
  */
  public static void main(String[] args) {
    // create instance of class and sample string array
    Lambda lamb = new Lambda();
    Utils util = new Utils();
    String[] list = {"Hopefully", "This", "Example", "is", "efficient", "and", "WORKS!"};

    // call the short to long method and print the results
    System.out.println("Short to Long");
    lamb.shortToLong(list);
    System.out.println();

    // call the long to short method and print the results
    System.out.println("Long to Short");
    lamb.longToShort(list);
    System.out.println();

    // call the alphabetical method and print the results
    System.out.println("Alphabetically");
    lamb.alphabetically(list);
    System.out.println();

    // call the containsE method and print the results
    System.out.println("Contains e without helper method");
    lamb.containsE(list);
    System.out.println();

    // call the helper method and print the results
    System.out.println("Contains e using static helper method");
    Arrays.sort(list, (s1, s2) -> Utils.helper(s1, s2));
    Arrays.stream(list).forEach(System.out::println);
  }


}
