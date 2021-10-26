/*
* This file contains code for SmoothStack Essentials Java Basics 5 Assignment1
* @author Bruce Haidrey
*/

import java.time.Month;
import java.time.Year;
import java.time.YearMonth;
import java.time.DateTimeException;
import java.lang.IndexOutOfBoundsException;

/*
* This class displays the number of days in each month of a specific year
*/
public class MonthLength {
  /*
  * Calculate the length of each month within a year
  * @param year - specified year to calculate
  */
  private void calculateLength(int year) {
    try {
      // Obtains an insance of Year by calling .of()
      Year yr = Year.of(year);
      System.out.println("For the year: " + year);

      // iterate through every month in array of constant month values
      for (Month m : Month.values()) {
        // create a YearMonth from the given year and month values
        YearMonth ym = yr.atMonth(m);
        System.out.println(m + ": " + ym.lengthOfMonth() + " days");
      }
    } catch(DateTimeException e) {
      // .of() method throws a DateTimeException if the field is invalid
      System.out.println("Year is invalid");
      e.printStackTrace();
    }
  }

  /*
  * @param args
  */
  public static void main(String[] args) {
    // create instance of class to call method
    MonthLength ml = new MonthLength();
    int year = 0;

    // make sure the correct number of agruments are being passed to command line
    if (args.length <= 0 || args.length >= 2) {
      // print message and throw exception
      System.out.println("Make sure to only pass in the year");
      throw new IndexOutOfBoundsException();
    }
    try {
      // obtain the year from the command line
      year = Integer.parseInt(args[0]);
    } catch(NumberFormatException e) {
      // parseInt throws a NumberFormatException
      System.out.println("Year is not formatted correctly");
      e.printStackTrace();
      System.exit(0);
    }

    // call the method
    ml.calculateLength(year);

  }
}
