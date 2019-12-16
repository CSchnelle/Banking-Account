
/**
 * class SavingsAccount - derived class.
 *
 * Catherine Schnelle
 * 11/03/19
 */
public class SavingsAccount extends Account
{
    private double interestRate;
    
    public SavingsAccount(int id, double balance, double interestRate){
        super(id, balance);
        this.interestRate = interestRate;
    }
    
    public SavingsAccount(){
        this(1000, 0.0, 0.2);
    }
    
    public SavingsAccount(int id, double balance){
        this(id, balance, 0.02);
    }
    
    public void addInterest(){
        //double interest = getBalance() * interestRate;
        //setBalance(getBalance() + interest);
        setBalance(getBalance()*(1*interestRate));
    }
    
    public void withdraw(double amount){
        if(amount > 0 && amount <= getBalance() -500.00)
            setBalance(getBalance() - amount);
    }
    
    public String toString(){
        return super.toString() + "\nInterest Rate: " + interestRate;
    }
}
