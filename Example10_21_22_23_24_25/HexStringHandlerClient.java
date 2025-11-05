/*  HexStringHandlerClient class
*   Anderson, Franceschi
*/

import java.util.Scanner;

public class HexStringHandlerClient
{
  public static void main( String [] args )
  {
    Scanner scan = new Scanner( System.in );
    System.out.print( "Enter a hexadecimal number > " );
    String hex = scan.next( );
  
    HexStringHandler hsh = new HexStringHandler( );
    hsh.parse( hex );
    
    if ( hsh.isValid( ) )
      System.out.println( hex + " = " + hsh.getNumber( ) );
    else
      System.out.println( hex + " is not a valid hex number." );
  }
}
