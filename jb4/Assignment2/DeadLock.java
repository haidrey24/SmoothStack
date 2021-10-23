/*
* This file contains code for SmoothStack Essentials Java Basics 4 Assignment2
* @author Bruce Haidrey
*/

import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.lang.Thread;

/*
* This class implements a Producer/Consumer Problem with DeadLock
*
* By acquiring the lock in producer and then checking if the buffer is full,
* if the buffer is full there will be a DeadLock because the buffer can never be
* free'd again.
*
* The consumer can free the buffer however if the producer has the lock,
* the consumer can never acquire it in order to remove from the buffer, causing
* a DeadLock
*/
public class DeadLock {
  // create an ArrayList with max capacity of 7
  private final int SEVEN = 7;
  private List<Integer> buffer = new ArrayList<Integer>(SEVEN);
  private final Lock lock = new ReentrantLock();

  /*
  * This method will produce a random number between 0-99 and will add it to the buffer
  */
  private void producer() {
    // doing while true to continue to run
    while (true) {
      try {
        // create random number to be added to the buffer
        Random rand = new Random();
        int randomNum = rand.nextInt(100);
        Integer produced = new Integer(randomNum);
        // calling synchronized on this is calling it on the thread

        synchronized(this) {
          // acquire the lock
          lock.lock();

          // if the buffer is full, wait
          while (buffer.size() == SEVEN) {
            wait();
            System.out.println("producer waiting");
          }

          // append the produced number to the end of the list
          buffer.add(produced);
          System.out.println("producer produced: " + produced);

          // release the lock
          lock.unlock();

          // notify consumer thread to consume
          notify();

          // have the thread sleep before producing another integer
          Thread.sleep(1000);
        }
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  /*
  * This method will consume a the first number entered into the buffer
  */
  private void consumer() {
    // doing while true to continue to run
    while (true) {
      try {
        synchronized (this) {
          // acquire the lock
          lock.lock();

          // wait if buffer is empty
          while (buffer.size() == 0) {
            wait();
            System.out.println("consumer waiting");
          }

          // consume the first element in the list
          int rem = buffer.remove(0);
          Integer consume = new Integer(rem);
          System.out.println("consumer removed: " + consume);

          // release the lock
          lock.unlock();

          // notify the producer to continue producing
          notify();

          // have the thread sleep before consuming again
          Thread.sleep(1000);
        }
      } catch(InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  /*
  * @param args
  */
  public static void main(String[] args) {
    // create instance of the class to call methods
    DeadLock dl = new DeadLock();

    // create runnable for producer thread
    Runnable r1 = new Runnable() {
      // override run method and catch if there's an exception
      @Override
      public void run() {
        try {
          // call producer
          dl.producer();
        } catch(Exception e) {
          e.printStackTrace();
        }
      }
    };

    // create runnable for consumer thread
    Runnable r2 = new Runnable() {
      // override run method
      @Override
      public void run() {
        try {
          // call consumer and catch if there's an exception
          dl.consumer();
        } catch(Exception e) {
          e.printStackTrace();
        }
      }
    };

    // create thread for producer and consumer
    Thread p1 = new Thread(r1);
    Thread c1 = new Thread(r2);

    // start the threads
    p1.start();
    c1.start();
  }
}
