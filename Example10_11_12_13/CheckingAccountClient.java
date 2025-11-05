/* CheckingAccount Client, version 5
    Anderson, Franceschi
*/

public class CheckingAccountClient
{
   public static void main( String [] args )
   {
     CheckingAccount c5 = new CheckingAccount( 100.00, 7.50 );
     System.out.println( "New checking account:\n" + c5 );

     c5.withdraw( 95 );
     System.out.println( "\nAfter withdrawing $95:\n" + c5 );

     System.out.println( "\nApplying the monthly fee:" );
     c5.applyMonthlyFee( );
     if ( c5.getBalance( ) < 0.0 )
        System.out.println( "Warning: account is overdrawn!" );
     System.out.println( c5 );
   }
}
