/**   BankAccount class, version 2
*     Constructors and toString method only
*     Anderson, Franceschi
*     Represents a generic bank account
*/

import java.text.DecimalFormat;

public class BankAccount
{
   public final DecimalFormat MONEY
                  = new DecimalFormat( "$#,##0.00" );
   private double balance;

   /** default constructor
   *   sets balance to 0.0
   */
   public BankAccount( )
   {
     balance = 0.0;
     System.out.println( "In BankAccount default constructor" );
   }

   /** overloaded constructor
   *   @param balance  beginning balance
   */
   public BankAccount( double balance )
   {
     if ( balance >= 0.0 )
         this.balance = balance;
     else
         this.balance = 0.0;
     System.out.println( "In BankAccount overloaded constructor" );
   }

   /** toString
   *  @return  the balance formatted as money
   */
   @Override
   public String toString( )
   {
     return "balance is " + MONEY.format( balance );
   }
}
