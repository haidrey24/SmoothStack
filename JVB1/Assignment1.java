/*
* This file contains code for SmoothStack Essentials assignment1
* @author Bruce Haidrey
*/

public class Assignment1 {

  /*
  * Prints the 1st pattern on the screen
  */
  public static void pattern1() {
    System.out.println("*\n**\n***\n****\n.........\n");
  }

  /*
  * Prints the 2nd pattern on the screen
  */
  public static void pattern2() {
    System.out.println("..........\n****\n***\n**\n*\n");
  }

  /*
  * Prints the 3rd pattern on the screen
  */
  public static void pattern3() {
    System.out.println("    *    \n   ***   \n  *****  \n ******** \n..........\n");
  }

  /*
  * Prints the 4th pattern on the screen
  */
  public static void pattern4() {
    System.out.println("..........\n ******** \n  *****  \n   ***   \n    *    \n");
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
