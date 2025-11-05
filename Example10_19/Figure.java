/** abstract Figure superclass for drawing shapes
*   Anderson, Franceschi
*/
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Figure
{
  private int x;
  private int y;
  private Color color;

  /** default constructor
  *   sets x and y to 0
  *   sets color to black
  */
  public Figure( )
  {
    x = 0;
    y = 0;
    color = Color.BLACK;
  }

  /** overloaded constructor
  *   @param  x      starting x pixel for figure
  *   @param  y      starting y pixel for figure
  *   @param  color  figure color
  */
  public Figure( int x, int y, Color color )
  {
    this.x = x;
    this.y = y;
    this.color = color;
  }

  /** accessor method for color
  *   @return current figure color
  */
  public Color getColor( )
  {
    Color tempColor = color;
    return tempColor;
  }

  /** mutator method for color
  *   @param color  new color for figure
  *   @return a reference to this object
  */
  public Figure setColor( Color color )
  {
    this.color = color;
    
    return this;
  }

  /** accessor method for x
  *   @return current x value
  */
  public int getX( )
  {
    return x;
  }

  /** mutator method for x
  *   @param x  new value for x
  *   @return a reference to this object
  */
  public Figure setX( int x )
  {
    this.x = x;
    
    return this;
  }

  /** accessor method for y
  *   @return current y value
  */
  public int getY( )
  {
    return y;
  }

  /** mutator method for y
  *   @param y new y value
  *   @return a reference to this object
  */
  public Figure setY( int y )
  {
     this.y = y;
     
     return this;
  }

  /** abstract draw method
  *   @param gc GraphicsContext for drawing figure
  */
  public abstract void draw( GraphicsContext gc );
}
