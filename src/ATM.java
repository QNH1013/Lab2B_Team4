
public class ATM extends Currency 
{
    int moneyDeposit;
    int moneyWithdraw;
    
    public ATM(int money,int conversion,int moneyDeposit, int moneyWithdraw)
    {
        super(money, conversion);
        this.moneyDeposit= moneyDeposit;
        this.moneyWithdraw=moneyWithdraw;
    }
     public int DepositedMoney()
     {
         return money = DepositMoney() + money;
     }
    public int DepositMoney()
    {
        return moneyDeposit;
    }
    public int WithdrawMoney()        
    {
        return money = WithdrawalAmount() - money;
    }
    public int WithdrawalAmount()
    {
        return moneyDeposit;
    }
    
}
