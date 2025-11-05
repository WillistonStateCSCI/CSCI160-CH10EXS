/** ShippingCalculator
*   Anderson, Franceschi
*/
import java.util.Scanner;
import java.text.NumberFormat;

public class ShippingCalculator
{
   public static void main( String [] args )
   {
     Scanner scan = new Scanner( System.in );
     NumberFormat money = NumberFormat.getCurrencyInstance( );
          
     System.out.print( "What is the weight of the item? " );
     double weight = scan.nextDouble( );
     
     System.out.println( "Our shipping options are: "
                        + "\n\t1 Express shipping: 1-2 business days"
                        + "\n\t2 Standard shipping: 3-5 business days"
                        + "\n\t3 Flat Rate: 6-8 business days" );
     System.out.print( "Select your shipping option > " );
     int option = scan.nextInt( );
     
     ShippingCost shippingCost = switch ( option )
     {
        case 1 -> new ExpressShipping( );
        case 2 -> new StandardShipping( );
        case 3 -> new FlatRateShipping( );
        default -> null;
     };
     
     if ( shippingCost != null )
        System.out.println( "Your shipping cost is " 
            + money.format( shippingCost.calculateShipping( weight ) ) );
     else 
        System.out.println( "No valid shipping option selected." );         
   }
} 