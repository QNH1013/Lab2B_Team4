
public class Checking extends Account{
    
    boolean canTakeChecks;
    
    public Checking(int accountNumber, int balance){
        super(accountNumber, balance);
        canTakeChecks = true;
    }
    
}
