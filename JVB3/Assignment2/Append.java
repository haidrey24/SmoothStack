/*
* This file contains code for SmoothStack Essentials Java Basics 3 Assignment2
* @author Bruce Haidrey
*/

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

/*
This class appends text to an existing file
*/
public class Append {
  /*
  * this method prints the files and sub-directories in a given directory
  */
  private void printToFile(String path, String text) {
    // initialize your file with the given path
    File file = new File(path);
    FileWriter fw = null;
    PrintWriter pw = null;

    // try setting all your writers accordingly and if there's an error catch it
    try {
      fw = new FileWriter(file, true);
      pw = new PrintWriter(fw);
      // append the text to the end of the file
      pw.println(text);
    }
    catch (IOException e) {
      // print the stack to trace why the exception is being thrown
      e.printStackTrace();
    }
    finally {
      try {
        // try closing all the writers and throw an exception if it can't be closed
        pw.close();
        fw.close();
      } catch (IOException e) {
        // print the stack to trace why the exception is being thrown
        e.printStackTrace();
      }
    }
  }

  /*
  * @param args
  */
  public static void main(String[] args) {
    // create strings to the path of the text file and the text you want to append
    String path = "/Users/brucehaidrey/Documents/SmoothStack/JVB3/Assignment2/out.txt";
    String text = "This method works! Assignment2 complete";

    // create instance of the class and call the method to append to a file
    Append a = new Append();
    a.printToFile(path, text);
  }
}
