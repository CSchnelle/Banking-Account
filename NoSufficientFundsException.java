
/**
 * Write a description of class NoSufficientFundsException here.
 *
 * Catherine Schnelle
 * @version (11/21/19)
 */
public class NoSufficientFundsException extends Exception
{
    public NoSufficientFundsException(){
        super("You don't have enough money");
    }
    public NoSufficientFundsException(String message){
        super(message);
    }
}