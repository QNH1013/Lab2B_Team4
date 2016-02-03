
public class Commercial extends Customer{
    private int accountNumber;
    private String businessName;
    
    public Commercial(int accountNumber, String businessName){
        super(accountNumber);
        this.businessName = businessName;
    }
}
