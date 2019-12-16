/**
 * Write a description of class IllegalAmountException here.
 *
 * Catherine Schnelle
 * @version (11/21/19)
 */
public class IllegalAmountException extends Exception
{
    /**
     * write desctiption of the constructor
     */
    public IllegalAmountException(){
        super("The amount is not legal");
    }
    
    /*
     * w@param message The error message for this exception
     */
    public IllegalAmountException(String message){
        super(message);
    }
}