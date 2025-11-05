/* CheckingAccount Client, version 1
   Anderson, Franceschi
*/

public class CheckingAccountClient
{
  public static void main( String [] args )
  {
    CheckingAccount c1 = new CheckingAccount( );
    System.out.println( "New checking account: " + c1 );

    c1.deposit( 350.75 );
    System.out.println( "\nAfter depositing $350.75: " + c1 );

    c1.withdraw( 200.25 );
    System.out.println( "\nAfter withdrawing $200.25: " + c1 );
  }
}
