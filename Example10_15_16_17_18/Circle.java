/* Circle class
*  inherits from abstract Figure class
*  Anderson, Franceschi
*/

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Circle extends Figure
{
   private final int MIN_RADIUS = 15;
   private int radius;

   /** default constructor
   *   calls default constructor of Figure class
   *   sets radius to minimum value
   */
   public Circle( )
   {
      super( );
      radius = MIN_RADIUS;
   }

   /** overloaded constructor
   *   sends x, y, color parameters to Figure constructor
   *   sends radius to setRadius method
   *   @param x      starting x coordinate
   *   @param y      starting y coordinate
   *   @param color  color for circle
   *   @param radius radius of circle
   */
   public Circle( int x, int y, Color color,
                             int radius )
   {
      super( x, y, color );
      setRadius( radius );
   }

   /** mutator method for radius
   *   @param radius  new value for radius
   *   @return a reference to this object
   */
   public Circle setRadius( int radius )
   {
      if ( radius > MIN_RADIUS )
         this.radius = radius;
      else
         this.radius = MIN_RADIUS;
      
      return this;
   }

   /** accessor method for radius
   *   @return radius
   */
   public int getRadius( )
   {
      return radius;
   }

   /** draw method
   *  sets color and draws a circle
   *  @param gc  GraphicsContext for drawing the circle
   */
   @Override
   public void draw( GraphicsContext gc )
   {
       gc.setFill( getColor( ) );
       gc.fillOval ( getX( ), getY( ),
                     radius * 2, radius * 2 );
   }
}
