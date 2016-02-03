
public class Commercial extends Customer{
    private int accountNumber;
    private String businessName;
    
    public Commercial(Account account, String businessName){
        super(account);
        this.businessName = businessName;
    }
}
