/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jon
 */
public class Currency {
    
    private Account account;
    
    public Currency(Account account){
        
        this.account = account;
        
    }
    
    public Account getAccount(){
        return account;
    }
    
}
