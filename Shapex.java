
public class Shapex implements Shape
{
  private int sideLength;
  private String color;
  private int sides;
  private int angle;
  public Shapex(int sideLength, String color, int sides)
  {
    this.sideLength = sideLength;
    this.color = color;
    this.sides = sides;
    this.angle = (180 *(sides-2)/sides);
  }
  
  public double getArea()
  {
          double apothem = this.sideLength/(2*Math.tan(Math.toDegrees(Math.PI)/this.sides));
          return (sides * sideLength * apothem)/2;
        //number of sides × length of one side × apothem)/2, 
        //By definition, all sides of a regular polygon are equal in length. 
        //If you know the length of one of the sides, 
        //the apothem length is given by the formula:
        //  apothem=s /(2 tan 180/n)
      
  
     
    }
  public double getPerimeter(){
    return this.sideLength * this.sides;
  }

  public String getColor()
  {
    return this.color;
  }
}
