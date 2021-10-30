/*
* This file contains code for SmoothStack Essentials Java Basics 5 Assignment2
* @author Bruce Haidrey
*/

import java.util.Scanner;
import java.io.File;



/*
* This class reads from a text file and gives the user options to check a characteristic of the integers in the file
*/
public class PerformOperation {
  
  /*
  * This method doubles each value in the array
  * @param help - used to call abstract method in helper interface
  * @param num - number to check the operation on
  */
  public boolean handleOperation(Helper help, int num) {
	  // calls the abstract method from the helper class
	  return help.checkOperation(num);
  }
  
  /*
   * lambda function to check if the int isOdd
   */
  public Helper isOdd() {
	  // mod the number to see if the remainder is 0 or 1
	  return num -> (num%2 != 0);
  }
	  
  /*
   * lambda function to check if the int isPrime
   */
  public Helper isPrime() {
	  return num -> 
	  {
		  // variable to return
		  boolean result = true;
		  // iterate through starting from 2 until half the number to check for factors of the num
		  for (int i = 2; i <= num/2; i++) 
		  {
			  // mod the number with i to see if there's a remainder of a factor of the number
			  if (num % i == 0)
			  {
				  // return if not prime
				  result = false;
				  return result;
			  }
		  }
		  // return if prime
		  return result;
	  };
  }

  /*
   * lambda function to check if the int is a Palindrome
   */
  public Helper isPalindrome() {
	  return num -> 
	  {
		  // Convert the integer to a string
		  String str = ((Integer)num).toString();
		  // going to build a reverse of the string. need stringbuilder to allow the string to be mutable
		  StringBuilder reverse = new StringBuilder();
		  int len = str.length();
		  // iterate from the end of the string 
		  for (int i = len - 1; i >= 0; i--)
		  {
			  // append each character to this string
			  reverse = reverse.append(str.charAt(i));
		  }
		  // check if the strings are equal 
		  if (str.equals(reverse.toString()))
		  {
			  return true;
		  }
		  else {
			  return false;
		  }
	  };
  }
  
  /*
  * @param args
  */
  public static void main(String[] args) {
	  // create instances to call methods
	  PerformOperation po = new PerformOperation();
	  // retrieve the file to pass to scanner
	  File text = new File(args[0]);
	  Scanner sc = null;
	  // used to call abstract method
	  Helper help;
	  boolean result = false;
	  
	  try {
		  // retrieve the number of test cases to run on the text file
		  sc = new Scanner(text);
		  int testCases = sc.nextInt();
		  
		  // iterate through the number of test cases
		  for (int i = 0; i < testCases; i++) 
		  {
			  // retrieve both ints on every line
			  int op = sc.nextInt();
			  int num = sc.nextInt();
			  
			  // handles the isOdd method
			  if (op == 1)
			  {
				  // call method
				  help = po.isOdd();
				  // result returned by the method
				  result = po.handleOperation(help, num);
				  if (result == true)
				  {
					  System.out.println("ODD");
				  }
				  else {
					  System.out.println("EVEN");
				  }
			  }
			  // handles the isPrime method
			  else if (op == 2)
			  {
				  // call method
				  help = po.isPrime();
				  // result returned by the method
				  result = po.handleOperation(help, num);
				  if (result == true)
				  {
					  System.out.println("PRIME");
				  }
				  else {
					  System.out.println("COMPOSITE");
				  }
			  }
			  // handles the isPalindrome method
			  else if (op == 3) 
			  {
				  // call method
				  help = po.isPalindrome();
				  // result returned by the method
				  result = po.handleOperation(help, num);
				  if (result == true)
				  {
					  System.out.println("PALINDROME");
				  } else {
					  System.out.println("NOT PALINDROME");
				  }
			  }
			  
		  }
	} catch (Exception e) {
		// catch any thrown exceptions
		e.printStackTrace();
	} finally {
		// close the scanner
		sc.close();
	}
	 
  }
   
}
