import java.util.List;
import java.util.stream.Collectors;

/*
* This file contains code for SmoothStack Essentials Java Basics 5 Assignment2
* @author Bruce Haidrey
*/

/*
* This class removes any x character in a list of strings
*/
public class NoX {
  /*
  * Removes any x from the list of strings
  * @param list - list of strings
  * @return - List of strings without any 'x' characters
  */
  public List<String> removeX(List<String> list) {
	  return list.stream().map(x -> x.replaceAll("x", "")).collect(Collectors.toList());
  }   
}
