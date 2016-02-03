/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jon
 */
public abstract class Currency {
    
    int money;
    private Account account;
    
    public Currency(Account account){
        this.money = money;
        this.account = account;
    }
    
    public int getMoney(){
        return money;
    }
    
    public int getBalance(){
        return account.getBalance();
    }
    
}
