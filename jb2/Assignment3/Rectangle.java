/*
* This file implements a Rectangle from the Shape interface
* @author Bruce Haidrey
*/

/*
This class calculates the area of a rectangle and displays it
*/
public class Rectangle implements Shape {
  private double height;
  private double width;

  /*
  * @param height - height of the rectangle
  * @param width - width of the rectangle
  */
  public Rectangle(double height, double width){
    this.height = height;
    this.width = width;
  }

  /*
  * Calculate the area of the shape
  */
  @Override
  public double calculateArea(){
    return this.height * this.width;
  }

  /*
  * @param args
  */
  public static void main(String[] args) {
    // create an instance of the class
    Rectangle rec = new Rectangle(10,13);
    // call your functions
    rec.calculateArea();
    rec.display();
  }
}
