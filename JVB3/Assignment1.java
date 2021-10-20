/*
* This file contains code for SmoothStack Essentials Java Basics 3 Assignment1
* @author Bruce Haidrey
*/

import java.io.File;

/*
This class gets a list of all file/directory names and their sub-directories
*/
public class Assignment1 {
  /*
  * this method prints the files and sub-directories in a given directory
  */
  private void printFiles(File[] files, int index, int level) {
    // if there are no more files terminate
    if (index == files.length)
    {
      return;
    }

    for (int i = 0; i < level; i++)
    {
      // indent as you go deeper into the sub-directories
      System.out.print("\t");
    }

    // check if the next item is a file
    if (files[index].isFile())
    {
      // print the name of the file
      System.out.println(files[index].getName());
    }
    // check if the next file is a sub-directory
    else if (files[index].isDirectory())
    {
      // print the sub-directory in brackets to distinguish from the files
      System.out.println("{" + files[index].getName() + "}");

      // make a recursive call on the next file in the array's sub-directory
      printFiles(files[index].listFiles(), 0, level + 1);
    }

    // increment your index to move to next file
    index += 1;
    // make a recursive call on the next file in the array's directory
    printFiles(files, index, level);

  }

  /*
  * @param args
  */
  public static void main(String[] args) {
    // create instance to call the method above
    Assignment1 a = new Assignment1();
    // create a string to the file path
    String directory = "/Users/brucehaidrey/Documents/SmoothStack";
    File dir = new File(directory);

    // check if directory exists and is a directory
    if (dir.exists() && dir.isDirectory())
    {
      // put the directories in an array to pass into the method
      File[] arr = dir.listFiles();
      a.printFiles(arr, 0, 0);
    }
  }
}
