
public class app {

   
    public static void main(String[] args) {
        
        //(accountNumber, balance);
        Savings savings = new Savings(24000, 100);
        //(Account account, String firstName, String lastName)
        Personal bob = new Personal(savings, "Bob", "Smith");
        //(Account account)
        ATM atm = new ATM(bob.returnAccount());
        
        atm.DepositedMoney(600);
        atm.WithdrawMoney(30);
        
        
    }
    
}

