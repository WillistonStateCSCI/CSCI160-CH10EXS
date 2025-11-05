/* Square class
*  inherits from abstract Figure class
*  Anderson, Franceschi
*/

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Square extends Figure
{
   private final int MIN_LENGTH = 10;
   private int length;

   /** default constructor
   *   calls default constructor of Figure class
   *   sets length to minimum value
   */
   public Square( )
   {
     super( );
     length = MIN_LENGTH;
   }

   /** overloaded constructor
   *   sends x, y, and color parameters to Figure constructor
   *   sends length to setLength method
   *   @param x      starting x coordinate
   *   @param y      starting y coordinate
   *   @param color  color for square
   *   @param length length of square
   */
   public Square( int x, int y, Color color,
                                int length )
   {
      super( x, y, color );
      setLength( length );
   }

   /** mutator method for length
   *   @param length  new value for length
   *   @return a reference to this object
   */
   public Square setLength( int length )
   {
      if ( length > MIN_LENGTH )
         this.length = length;
      else
         this.length = MIN_LENGTH;
      
      return this;
   }

   /** accessor method for length
   *   @return length
   */
   public int getLength( )
   {
      return length;
   }

   /** draw method
   *  sets color and draws a square
   *  @param gc  GraphicsContext for drawing the square
   */
   @Override
   public void draw( GraphicsContext gc )
   {
      gc.setFill( getColor( ) );
      gc.fillRect( getX( ), getY( ),
                   length, length );
   }
}
