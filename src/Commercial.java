/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jon
 */
public class Commercial extends Customer{
    private int accountNumber;
    private String businessName;
    
    public Commercial(int accountNumber, String businessName){
        super(accountNumber);
        this.businessName = businessName;
    }
}
