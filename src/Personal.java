/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jon
 */
public class Personal extends Customer{
    
    private int accountNumber;
    private String firstName;
    private String lastName;
    
    public Personal(int accountNumber, String firstName, String lastName){
        super(accountNumber);
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
}
