/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingsystem;

import java.text.DecimalFormat;

/**
 *
 * @author jamun
 */
public class CheckingAccount extends Account {
    
    /**
     * Default constructor 
     * Calls the superclass default constructor 
     */
    public CheckingAccount() {
        super(); 
    }
    
    /**
     * Constructor that creates a checking account of a given name
     * Calls the superclass constructor 
     * @param n name that the checking account is created under 
     */
    public CheckingAccount(String n) {
        super(n);
        balance = 0;
    }
    
    @Override 
    /**
     * Overrides the superclass deposit method so the overridden getBalance
     * method retrieves the accurate balance 
     */
    public void deposit(double amount) {
        balance += amount; 
    }
            
    @Override
    /**
     * Overrides the superclass withdraw method to reflect the 
     * withdrawal transaction fee for checking accounts 
     * @param amount amount to deposit
     */
    public void withdraw(double amount) {
        balance -= (amount + FEE);
    }
    
    @Override 
    /**
     * Overrides the superclass getBalance method to get the updated balance 
     * @return balance associated with the checking account  
     */
    public double getBalance() {
        String roundedBal = df.format((balance));
        return Double.parseDouble(roundedBal);    
    }
    
    @Override 
    /**
     * Overrides the superclass toString method to reflect the updated balance 
     * @return returns the name the checking account is under and the 
     * balance, in string format 
     */
    public String toString() {
        return "Name: " + super.getName() + ", Balance: $" + balance;
    }
    
    // private instance fiels 
    private String name; 
    private double balance; 
    private final double FEE = 0.10; 
    private final DecimalFormat df = new DecimalFormat("#.##");
}
