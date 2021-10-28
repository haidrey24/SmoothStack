/*
* This file contains code for SmoothStack Essentials Java Basics 5 Assignment1
* @author Bruce Haidrey
*/

import java.time.Month;
import java.time.Year;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.time.DateTimeException;
import java.lang.IndexOutOfBoundsException;

/*
* This class displays the dates of each monday in a given month
*/

public class Mondays {
  /*
  * Calculate the number of mondays in given month
  * @param year - passes in the current year to calculate
  * @param month - month to check
  */
  public void calculateMonday(Year year, Month month) {
    try {
      // retrieve the date using current year, given month, and first day
      // use temporal adjuster to get the first occurrence of a monday in month
      LocalDate date = year.atMonth(month).atDay(1)
        .with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));

      // retrieve the same month. will be used to iterate through the month
      Month tempMonth = date.getMonth();

      // check if the months are the same
      while (tempMonth == month) {
        // print the date of each monday
        System.out.println("Date: " + date);
        // update the week of the month by getting the next monday occurrence

        date = date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        // check to see if we're in the same month
        tempMonth = date.getMonth();
      }
    } catch(DateTimeException e) {
      // date.with() throws Date Time Exception
      e.printStackTrace();
    } catch(ArithmeticException e) {
      // date.with() throws Arithmetic Exception
      e.printStackTrace();
    }
  }

  /*
  * @param args
  */
  public static void main(String[] args) {
    // create instance of class to call method
    Mondays mon = new Mondays();
    Year yr = Year.now();
    Month month = null;

    // make sure the correct number of arguments are being passed to command line
    if (args.length <= 0 || args.length >= 2) {
      // print message and throw exception
      System.out.println("Make sure to only pass in a month");
      throw new IndexOutOfBoundsException();
    }
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

    mon.calculateMonday(yr, month);
  }
}
