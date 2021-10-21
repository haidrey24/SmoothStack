/*
* This file contains code for SmoothStack Essentials Java Basics 3 Assignment3
* @author Bruce Haidrey
*/

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;

/*
This class counts the frequency of a character in the file
*/
public class Assignment3 {
  /*
  * This method counts the frequencies of a specific character in a file
  * @param c - character to count
  * @param path - path to the file
  */
  private void frequency(char c, String path) {
    // create file and scanner
    File file = new File(path);
    Scanner sc = null;

    // used to store return value and to retrieve the char from the file
    int result = 0;
    char ch;

    try {
      // point scanner to the file
      sc = new Scanner(file);

      // check if the scanner's next exists
      while (sc.hasNext()) {
        // retrieve the next string
        String line = sc.next();

        // iterate through the lenght of the string
        for (int i = 0; i < line.length(); i++)
        {
          // check if the next char matches the user input
          if (line.charAt(i) == c)
          {
            // update frequency count
            result++;
          }
        }
      }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (NoSuchElementException e) {
        e.printStackTrace();
    } finally {
        // properly close the scanner
        sc.close();
    }

    // display the results
    System.out.println("The frequency of " + c + " is: " + result);
  }

  /*
  * @param args
  */
  public static void main(String[] args) {
    // create a path to a text file
    String path = "/Users/brucehaidrey/Documents/SmoothStack/JVB3/Assignment2/out.txt";
    // retrieve the first string argument and turn it into a char
    String str = args[0];
    char ch = str.charAt(0);

    // create an instance of the class and call the above method
    Assignment3 a = new Assignment3();
    a.frequency(ch, path);
  }
}
