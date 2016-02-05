
public class Personal extends Customer{
    
    private String firstName;
    private String lastName;
    
    public Personal(Account account, String firstName, String lastName){
        super(account);
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
}
