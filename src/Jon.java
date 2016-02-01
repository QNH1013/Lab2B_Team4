/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jon
 */
public class Jon {
    
    private int age;
    private String greeting;
    
    public Jon(int age, String greeting){
        this.age = age;
        this.greeting = greeting;
    }
    
    public void intro(){
        System.out.println("I'm Jon, " + this.greeting + " I am " + this.age + " years old");
    }
    
}
