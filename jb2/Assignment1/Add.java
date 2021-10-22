/*
* This file contains code for SmoothStack Essentials Java Basics 2 Assignment1
* @author Bruce Haidrey
*/

/*
This class adds all the values passed in by the command line
*/
public class Add {

  /*
  * @param args
  */
  public static void main(String[] args) {
    // create a sum and retrieve the number of values to add
    int count = args.length;
    int sum = 0;

    // check if any arguments are passed. if not return
    if (count == 0)
    {
      System.out.println("Nothing to add");
      return;
    }

    // iterate through the length of the args array and add all the ints
    for (int i = 0; i < count; i++)
    {
      sum += Integer.parseInt(args[i]);
    }

    // print out the sum
    System.out.println("The sum of the values are: " + sum);
  }
}
