/*
* * This file contains code for SmoothStack Essentials Java Basics 1 Assignment1
* @author Bruce Haidrey
*/

public class Assignment1 {

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
    for (int i = 0; i < 4; i++)
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
    System.out.println(DOT);
  }

  /*
  * Prints the 2nd pattern on the screen
  */
  public static void pattern2() {
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
    System.out.println(DOT + ".");
  }

  /*
  * Prints the 3rd pattern on the screen
  */
  public static void pattern3() {
    int width = 1;
    int padding = 5;

    printLine(width, padding);

    for (int i = 0; i < THREE; i++)
    {
      width += 2;
      padding -= 1;
      System.out.println();
      printLine(width, padding);
    }
    System.out.println();
    System.out.println(DOT + "..");
  }

  /*
  * Prints the 4th pattern on the screen
  */
  public static void pattern4() {
    int width = 7;
    int padding = 2;

    System.out.println(DOT + "...");

    printLine(width, padding);

    for (int i = 0; i < THREE; i++)
    {
      width -= 2;
      padding += 1;
      System.out.println();
      printLine(width, padding);
    }
  }


  private static void printLine(int width, int padding)
  {
    for (int i = 0; i < padding; i++)
    {
      System.out.print(SPACE);
    }

    for (int i = 0; i < width; i++)
    {
      System.out.print(STAR);
    }

    for (int i = 0; i < padding; i++)
    {
      System.out.print(SPACE);
    }
  }

  private static void printStar(int width, int padding)
  {


    for (int i = 0; i < width; i++)
    {
      System.out.print(STAR);
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
