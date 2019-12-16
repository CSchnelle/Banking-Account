
/**
 * Project 11
 * class Application - main function
* 
* 1. Declare an array of Account, named accounts, of size 4
* 2. Initialize every element in accounts array. Make accounts[0]and 
* accounts[1] be CheckingAccount and accounts[2] and accounts[3] be SavingsAccount
* 3. Makedepositand withdraw for each account and print out the account 
* information to see the result.
* 4. If the account is SavingsAccount, call addInterest function to update  the 
* account balance. Then print out the account information.
 * 
 * Catherine Schnelle
 * 11/03/19
 */
public class Application
{
    public static void main(String [] args){
        //declare an Account array with 4 elements
        Account [] accts = new Account[4];
        //initialize two accounts to be CheckingAccounts and two to be SavingsAccounts
        accts[0] = new CheckingAccount();
        accts[1] = new CheckingAccount(1001, 5670.00);
        accts[2] = new SavingsAccount(2001, 60000, 0.3);
        accts[3] = new SavingsAccount(2002, 42000, 0.02);
        //print all 4 accounts
        for(int i = 0; i < accts.length; i++)
            System.out.println("Account #: " + (i+1) + " information: \n" + accts[i].toString());
        //do some deposit and withdraw from each acct
       
        try{
            accts[0].withdraw(3000);
            accts[1].deposit(10000); 
            ((SavingsAccount) accts[2]).addInterest();
            accts[3].withdraw(60000);
        }
        catch(IllegalAmountException iaex){
            System.out.println(iaex);
        }
        catch(NoSufficientFundsException nsfex){
            System.out.println(nsfex);
        }
        
        for(int i = 0; i < accts.length; i ++){
            if(accts[i] instanceof SavingsAccount) //if acct savings, add interest
                ((SavingsAccount) accts[i]).addInterest();
        }    
        //re-print all 4 accounts
        for(int i = 0; i < accts.length; i++)
            System.out.println("Now Account # " + (i+1) + " information: \n" +accts[i]);            
    }
}

