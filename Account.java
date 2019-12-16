
/**
 * Abstract class Account - base class.
 *
 * Catherine Schnelle
 * 11/03/19
 */
public abstract class Account
{
    private int id;
    private double balance;
    
    public Account(){
        //id = 1000;
        //balance = 0.0;
        this(1000,0.0); //
    }
    
    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
    }
    
    public void setId(int id){
        this.id = id;
    }    
    
    public int getId(){
        return id;
    }
    
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void deposit(double amount) throws IllegalAmountException{
        if(amount <= 0)
            throw new IllegalAmountException("The deposit amount must be positive");
        balance = balance + amount;
    }
    
    public abstract void withdraw(double amount) 
            throws IllegalAmountException, NoSufficientFundsException;
    
    public String toString(){
        return "ID:" + id + "\nBalance: $" + balance;
    }
}
