
/**
 * class CheckingAccount - derived class.
 *
 * Catherine Schnelle
 * 11/03/19
 */
public class CheckingAccount extends Account
{
    public CheckingAccount()
    {
        super(); //call parent class no argument constructor
    }
    
    public CheckingAccount(int id, double balance){
        super(id, balance); //call parent class two argument constructor
    }
    
    public void withdraw(double amount) 
                throws IllegalAmountException, NoSufficientFundsException{
            if(amount <= 0)
                throw new IllegalAmountException("The withdraw amount must be positive");
            if(amount > getBalance())
                throw new NoSufficientFundsException("The balance in account is too low");
        //balance = balance - amount
        setBalance(getBalance()-amount);
    }
}
