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
public class CommaSeparated {
  /*
  * This method takes a list of Integers, determines whether the int is an even
  * or odd,
  * @param list - list of Inegers to convert to string
  */
  private String deList(List<Integer> list) {
    // map i to e or o depending on if int is even or odd
    return list.stream().map((i) -> {
      // mod with 2 to determine if even or odd
      if (i%2 == 0) {
        return "e" + i;
      } else {
        return "o" + i;
      }
      // this joins the strings and separates them with a comma
    }).collect(Collectors.joining(","));
  }

  /*
  * @param args
  */
  public static void main(String[] args) {
    // create instance of the class and sample list of integers
    CommaSeparated cs = new CommaSeparated();
    List<Integer> list = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));

    // create a string to store the deListed list and print
    String str = cs.deList(list);
    System.out.println(str);
  }
}
