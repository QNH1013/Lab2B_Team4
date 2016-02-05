
import java.util.Scanner;


public class ATM {
    
    private Currency currency;
    
    public void newUser(){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Welcome to Rimland Banking, new user.");
        System.out.println("We will help you make a new account now.");
        System.out.println("What type of account do you want?");
        System.out.println("Press '1' for savings and press '2' for checking.");
        
        int accountType = in.nextInt();
        
        Account account = null;
        Customer customer = null;
        
        if(accountType == 1){
            account = new Savings(01234567, 0);
        }else{
            account = new Checking(01234567, 0);
        }
        
        System.out.println("What type of user are you?");
        System.out.println("Press '1' for personal and press '2' for commercial.");
        
        int customerType = in.nextInt();
        
        if(customerType == 1){
            
            System.out.print("First name: ");
            String firstName = in.next();
            
            System.out.print("Last name: ");
            String lastName = in.next();
            System.out.println();
            
            customer = new Personal(account, firstName, lastName);
        }else{
            
            System.out.print("Name of business: ");
            String business = in.next();
            System.out.println();
            
            customer = new Commercial(account, business);
        }
        
        currency = new Currency(customer.returnAccount());
    }
    
    public void DepositeMoney(int deposite) {
        System.out.println("-------------------------");
        System.out.println("Balance: $" + currency.getAccount().getBalance());
        System.out.println("Deposite: $" + deposite);
        currency.getAccount().setBalance(currency.getAccount().getBalance() + deposite);
        System.out.println("New Balance: $" + currency.getAccount().getBalance());
        System.out.println();
     }
     
    public void WithdrawMoney(int withdrawl) {
        System.out.println("-------------------------");
        System.out.println("Balance: $" + currency.getAccount().getBalance());
        System.out.println("Withdrawl: $" + withdrawl);
        currency.getAccount().setBalance(currency.getAccount().getBalance() - withdrawl);
        System.out.println("New Balance: $" + currency.getAccount().getBalance());
        System.out.println();
        //account.setBalance(account.getBalance() - withdrawl);
    }
    
}
