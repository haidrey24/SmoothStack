/*
* This file contains code for SmoothStack Essentials Java Basics 4 Assignment1
* @author Bruce Haidrey
*/

/*
* This class implements a Singleton class with double checked locking
*/
public class Singleton {
  // create instance variable and declare volatile to make the var threadsafe
  volatile public static Singleton instance = null;

  // only constructor used to create an instance of the class
  private Singleton() {}


  /*
  * This gets the instance of this class iff no other thread is using the instance
  * This method is threadsafe
  */
  public Singleton getInstance() {
    // First check to see if instance is null
    if (instance == null)
    {
      // must synchronize in case multiple threads try to access
      synchronized (Singleton.class)
      {
        // Double check to see if instance is null
        if (instance == null)
        {
          // only after instance checks do we create an instance of the class
          instance = new Singleton();
        }
      }
    }
    return instance;
  }
}
