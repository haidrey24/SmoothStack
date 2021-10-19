/*
* This file contains code for SmoothStack Essentials Java Basics 1 Assignment2
* @author Bruce Haidrey
*/

import java.util.Scanner;
import java.util.Random;


public class Assignment2 {

  // create constants to use below
  private static final int MIN = 1;
  private static final int MAX = 100;
  private static final int ITER = 5;

  /*
  * @param args
  */
  public static void main(String[] args) {
    // create scanner to get user input
    Scanner scan = new Scanner(System.in);
    // generate random number. add 1 because random generates ints starting from 0
    Random rand = new Random();
    int num = rand.nextInt(MAX) + MIN;

    System.out.println("Guess a number between 1-100");

    for (int i = 0; i < ITER; i++)
    {
      // get user input
      int guess = scan.nextInt();
      // if guess is between num - 10 and num + 10, output correct answer and exit
      if (guess >= (num - 10) && guess <= (num + 10))
      {
        System.out.println("Nice! The correct answer is: " + num);
        return;
      }
      else if (i == ITER - 1) {
        // if you're on the last iteration, print correct number and exit
        System.out.println("Sorry the answer is: " + num);
      }
      else {
        // accessed if user is incorrect and has more guesses
        System.out.println("Incorrect, guess again");
      }
    }

    // close the scanner
    scan.close();
  }
}
