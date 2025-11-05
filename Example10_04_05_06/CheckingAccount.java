/* CheckingAccount class, version 2
   Anderson, Franceschi
*/

public class CheckingAccount extends BankAccount
{
   /** default constructor
   *   explicitly calls the BankAccount default constructor
   */
   public CheckingAccount( )
   {
       super( ); // optional, call BankAccount constructor
       System.out.println( "In CheckingAccount "
                            + "default constructor" );
   }

   /** overloaded constructor
   *   calls BankAccount overloaded constructor
   *   @param  balance  starting balance
   */
   public CheckingAccount( double balance )
   {
       super( balance ); // call BankAccount constructor
       System.out.println( "In CheckingAccount "
                           + "overloaded constructor" );
   }
}
