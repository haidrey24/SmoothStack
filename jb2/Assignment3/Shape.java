/*
* This file is an interface for Shapes
* @author Bruce Haidrey
*/

interface Shape {
  /*
  * calculate the area of the shape
  */
  public double calculateArea();

  /*
  * display the area of the shape
  */
  default void display()
  {
    System.out.println("Area of the shape is: " + calculateArea());
  }
}
