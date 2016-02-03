
public abstract class Account {
    
    private int accountNumber;
    private int balance;
    
    public Account(int accountNumber, int balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    public int getAccountNumber(){
        return accountNumber;
    }
    
    public int getBalance(){
        return balance;
    }
    
}
