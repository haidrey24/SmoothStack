/*
* This file contains code for SmoothStack Essentials Java Basics 5 Assignment1
* @author Bruce Haidrey
*/

import java.time.Month;
import java.time.Year;
import java.time.DayOfWeek;
import java.time.LocalDate;
//import java.time.temporal.TemporalAdjusters;
import java.time.DateTimeException;
import java.lang.IndexOutOfBoundsException;

/*
* This class determines whether a given date was on friday the 13th
*/
public class FridayThirteenth {
  /*
  * Calculate the number of mondays in given month. All parameters used to intialize LocalDate
  * @param month - month to check
  * @param day - day to check
  * @param year - year to check
  */
  public String calculateDate(Month month, int day, Year year) {
    // declare LocalDate variable and initialize to null
    LocalDate date = null;

    try {
      // set up your date with current month, day, and year
      date = year.atMonth(month).atDay(day);

      // if the date is on Friday 13th, print true
      if (date.getDayOfWeek() == DayOfWeek.FRIDAY && date.getDayOfMonth() == 13) {
//        System.out.println("true");
    	  return "true";
      }
      else {
        // if not, print false
//        System.out.println("false");
    	  return "false";
      }
    } catch(DateTimeException e) {
      // .atMonth() and .atDay() can throw Date Time Exceptions
      System.out.println("Date Time Exception");
      e.printStackTrace();
    }
    
    return "false";
  }

  /*
  * Must pass in month as args[0], day as args[1], and year as args[2]
  * @param args
  */
  public static void main(String[] args) {
    // create instance of class and declare all variables needed
    FridayThirteenth ft = new FridayThirteenth();
    Month month = null;
    Year year = null;
    int day = 0;

    // checks to see if correct number of arguments are being passed
    if (args.length <= 1 || args.length >= 4) {
      System.out.println("Enter month, day, then year");
      throw new IndexOutOfBoundsException();
    }

    // try-catch block to initialize the month
    try {
      // using toUpper because Months are capitalized and valueOf needs to
      // match the month exactly
      month = Month.valueOf(args[0].toUpperCase());
    } catch(IllegalArgumentException e) {
      // value of throws Illegal Argument Exception
      System.out.println("Illegal Argument Passed");
      e.printStackTrace();
    } catch(NullPointerException e) {
      // value of throws Null Pointer Exception
      System.out.println("Null Pointer Passed as Argument");
      e.printStackTrace();
    }

    // try-catch block to initialize the day and year
    try {
      // obtain the day and year from the command line
      day = Integer.parseInt(args[1]);
      year = Year.of(Integer.parseInt(args[2]));
    } catch(NumberFormatException e) {
      // parseInt throws a NumberFormatException
      System.out.println("Day is not formatted correctly");
      e.printStackTrace();
    }
    catch(DateTimeException e) {
      // Year.of() can throw a date time exception
      System.out.println("Date Time Exception");
      e.printStackTrace();
    }

    // call the method to see if the date is on friday the 13th
    String answer = ft.calculateDate(month, day, year);
    System.out.println(answer);
  }
}
