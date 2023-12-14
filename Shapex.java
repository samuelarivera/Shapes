
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
    
  }
  public double getPerimeter()
  {
    return this.sideLength * this.sides;
  }

  public String getColor()
  {
    return this.color;
  }
}
