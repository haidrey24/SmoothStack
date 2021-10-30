/*
* This file contains code for SmoothStack Essentials Java Basics 5 Assignment1
* @author Bruce Haidrey
*/

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/*
* This class turns a list of integers into a comma separated string
*/
public class StartWithA {

  /*
  * Checks if the list contains words that start with a and are of length 3
  * @param list - list to be searched
  */
  public void hasA(List<String> list) {
    // filter the list to see if it starts with a and its length is 3
    // startsWith is a String method
    list.stream().filter(s -> ((s.startsWith("a") && s.length() == 3)) || (s.startsWith("A") && s.length() == 3))
    .collect(Collectors.toList()).forEach((str) -> System.out.println(str));
  }

  /*
  * @param args
  */
  public static void main(String[] args) {
    // create instance of class to call method on and example lists
    StartWithA instance = new StartWithA();
    List<String> list = new ArrayList<String>
    (Arrays.asList("Hopefully", "This", "Example", "is", "efficient", "and", "WORKS!"));
    List<String> list2 = new ArrayList<String>
    (Arrays.asList("Amsterdam", "are", "acknowledging", "as", "anybody", "and", "ANY!"));
    List<String> list3 = new ArrayList<String>
    (Arrays.asList("Hopefully", "This", "Example", "is", "efficient", "WORKS!"));

    
    // test method on lists
    instance.hasA(list);
    System.out.println();
    instance.hasA(list2);
    System.out.println();
    instance.hasA(list3);
    System.out.println();
  }
}
