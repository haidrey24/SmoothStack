/*
* This file contains code for SmoothStack Essentials Java Basics 5 Assignment2
* @author Bruce Haidrey
*/

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
* This class creates a double checked singleton class
*/
public class SampleSingleton {
	
	volatile private static Connection conn = null;
	volatile private static SampleSingleton instance = null;
	
	public static SampleSingleton getInstance() {
		  // First check to see if instance is null
	    if (instance == null)
	    {
	      // must synchronize in case multiple threads try to access
	      synchronized (SampleSingleton.class)
	      {
	        // Double check to see if instance is null
	        if (instance == null)
	        {
	          // only after instance checks do we create an instance of the class
	          instance = new SampleSingleton();
	        }
	      }
	    }
	    return instance;
	}
}
