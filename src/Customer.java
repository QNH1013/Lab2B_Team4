
public class Customer {
    
    private Account account;
    
    public Customer(Account account){
        this.account = account;
    }
    
    public long getAccount(){
        return account.getAccountNumber();
    }
    
    public Account returnAccount(){
        return this.account;
    }
    
}
