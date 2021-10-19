/*
* * This file contains code for SmoothStack Essentials Java Basics 1 Assignment1
* @author Bruce Haidrey
*/

public class Assignment1 {

  // constants to use rather than hard coding iterations
  private static final int ONE = 1;
  private static final int THREE = 3;
  private static final int FOUR = 4;
  private static final int NINE = 9;
  private static final int TEN = 10;
  private static final int ELEVEN = 11;
  private static final int TWELVE = 12;
  private static final char STAR = '*';
  private static final char SPACE = ' ';
  private static final String DOT = ".........";


  /*
  * Prints the 1st pattern on the screen
  */
  public static void pattern1() {
    // iterate through and print the number of stars depending on the iteration
    for (int i = 0; i < FOUR; i++)
    {
      switch (i) {
        case 0: System.out.println("*");
                break;
        case 1: System.out.println("**");
                break;
        case 2: System.out.println("***");
                break;
        case 3: System.out.println("****");
                break;
      }

    }
    // prints the dots at the end of the stars
    System.out.println(DOT);
  }

  /*
  * Prints the 2nd pattern on the screen
  */
  public static void pattern2() {
    // iterate through and print the number of stars depending on the iteration
    for (int i = FOUR; i > 0; i--)
    {
      switch (i) {
        case 1: System.out.println("*");
                break;
        case 2: System.out.println("**");
                break;
        case 3: System.out.println("***");
                break;
        case 4: System.out.println("****");
                break;
      }
    }
    // prints the dots at the end of the stars
    System.out.println(DOT + ".");
  }

  /*
  * Helper function for patterns 3 and 4
  */
  private static void printLine(int width, int padding)
  {
    // prints the appropriate padding
    for (int i = 0; i < padding; i++)
    {
      System.out.print(SPACE);
    }
    // prints the appropriate number of stars
    for (int i = 0; i < width; i++)
    {
      System.out.print(STAR);
    }
    // prints the same number of padding on the other side
    for (int i = 0; i < padding; i++)
    {
      System.out.print(SPACE);
    }
  }

  /*
  * Prints the 3rd pattern on the screen
  */
  public static void pattern3() {
    // create local variables for the number of spaces and starting width
    int width = 1;
    int padding = 5;

    // use this helper function to print correct padding
    printLine(width, padding);

    // loop through the rest of the lines
    for (int i = 0; i < THREE; i++)
    {
      // update padding and width for next iteration
      width += 2;
      padding -= 1;
      // print the correct pattern with the correct spacing again
      System.out.println();
      printLine(width, padding);
    }
    // print the correct number of .'s at the end
    System.out.println();
    System.out.println(DOT + "..");
  }

  /*
  * Prints the 4th pattern on the screen
  */
  public static void pattern4() {
    // create local variables for the number of spaces and starting width
    int width = 7;
    int padding = 2;

    // create local variables for the number of spaces and starting width
    System.out.println(DOT + "...");

    // use this helper function to print correct padding
    printLine(width, padding);

    // loop through the rest of the lines
    for (int i = 0; i < THREE; i++)
    {
      // update padding and width for next iteration
      width -= 2;
      padding += 1;
      // print the correct pattern with the correct spacing again
      System.out.println();
      printLine(width, padding);
    }
  }

  /*
  * @param args
  */
  public static void main(String[] args) {
    // call each function
    System.out.println("1)");
    pattern1();
    System.out.println("2)");
    pattern2();
    System.out.println("3)");
    pattern3();
    System.out.println("4)");
    pattern4();
  }
}
