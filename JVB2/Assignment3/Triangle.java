/*
* This file implements a Triangle from the Shape interface
* @author Bruce Haidrey
*/

/*
This class calculates the area of a triangle and displays it
*/
public class Triangle implements Shape {
  private double height;
  private double width;

  /*
  * @param height - height of the triangle
  * @param width - width of the triangle
  */
  public Triangle(double height, double width) {
    this.height = height;
    this.width = width;
  }

  /*
  * Calculate the area of the shape
  */
  @Override
  public double calculateArea() {
    return (this.height * this.width) / 2;
  }

  public static void main(String[] args) {
    // create an instance of the class
    Triangle tri = new Triangle(10,10);
    // call your functions
    tri.calculateArea();
    tri.display();
  }
}
