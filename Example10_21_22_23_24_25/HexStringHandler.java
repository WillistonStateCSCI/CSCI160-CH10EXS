/* HexStringHandler class
*  Implements the StringHandler interface
*  to parse a String that contains a hex number
*  into its decimal equivalent
*  Implements the Validator interface to determine 
*  validity of String
*  Anderson, Franceschi
*/

public class HexStringHandler 
                implements StringHandler, Validator
{
  private boolean validHex;
  private int number;

  /** default constructor
  *  initializes number to 0
  *  and validHex to true
  */
  public HexStringHandler( )
  {
    validHex = true;
    number = 0;
  }

  /** processLetter method
  * @param c  the character to process
  * if c is between 10 and 15 (hex A through F),
  * uses its value to update the decimal number
  * otherwise, character is invalid letter
  */
  @Override
  public void processLetter( char c )
  { 
    int n = Character.getNumericValue( c );
    if ( n >= 10 && n <= 15 ) // valid hex character?
      number = 16 * number + n; // update number
    else // invalid hex character
      validHex = false;
  }
  
  /** processDigit method
  * @param c  the character to process
  * uses numeric value to update the decimal value
  */
  @Override
  public void processDigit( char c )
  { 
    int n = Character.getNumericValue( c );
    number = 16 * number + n; // update number
  }

  /** processOther method
  * @param c  the character to process
  * character is not a valid hex digit
  */
  @Override
  public void processOther( char c )
  { 
    // c is an invalid hex character
    validHex = false;
  }

  /** isValid method
  * @return true if all characters
  * in String are valid hex characters,
  * else returns false
  */
  public boolean isValid( )
  {
    return validHex;
  }
  
  /** getNumber method
  * @return if valid, returns the calculated decimal value
  * else, returns -1
  */
  public int getNumber( )
  {
    if ( isValid( ) )
      return number;
    else
      return -1;
  }
}
