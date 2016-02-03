
public class ATM extends Currency 
{
    int moneyDeposit;
    
    public ATM(int money,int conversion)
    {
        super(money, conversion);
        this.moneyDeposit= moneyDeposit;
    }
     public int WithrawalMoney()
     {
         return money = DepositMoney() + money;
     }
    public int DepositMoney()
    {
        return moneyDeposit;
        //test
    }
}
