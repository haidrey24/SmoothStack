/*
* This file implements a Circle from the Shape interface
* @author Bruce Haidrey
*/

import java.lang.Math;

/*
This class calculates the area of a circle and displays it
*/
public class Circle implements Shape {
  private double radius;

  /*
  * @param radius - radius of the circle
  */
  public Circle(double radius) {
    this.radius = radius;
  }

  /*
  * Calculate the area of the shape
  */
  @Override
  public double calculateArea() {
    return Math.PI * this.radius * this.radius;
  }

  /*
  * @param args
  */
  public static void main(String[] args) {
    // create an instance of the class
    Circle cir = new Circle(3);
    // call your functions
    cir.calculateArea();
    cir.display();
  }
}
