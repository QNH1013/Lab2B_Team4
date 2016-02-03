
public class ATM extends Currency 
{
    
    private Account account;
    
    public ATM(Account account)
    {
        super(account);

    }
     public void DepositedMoney(int deposite)
     {
         System.out.println(deposite);
         account.setBalance(account.getBalance() + deposite);
     }
     
    public void WithdrawMoney(int withdrawl)        
    {
        account.setBalance(account.getBalance() - withdrawl);
    }
    
}
