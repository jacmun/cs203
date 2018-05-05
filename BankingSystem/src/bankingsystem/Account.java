
package bankingsystem;

import java.text.DecimalFormat;

/**
 *
 * @author jamun
 */
public class Account {
    
    /**
     * Default constructor 
     * Creates an account with empty string name and empty balance
     */
    public Account() {
        name = ""; 
        balance = 0; 
    }
    
    /**
     * Creates an account of a given name 
     * @param n name 
     * @param bal balance 
     */
    public Account(String n) {
        name = n; 
        balance = 0;
    }
    
    /**
     * Deposits a given amount of money into an account
     * @param amount amount to deposit 
     */
    public void deposit(double amount) {
        balance += amount; 
    }
    
    /**
     * Withdraws a given amount of money from an account 
     * @param amount amount to withdraw 
     */
    public void withdraw(double amount) {
        balance -= amount; 
    }
    
    /**
     * Gets the name of the account 
     * @return name associated with this account 
     */
    public String getName() {
        return name; 
    }
    
    /**
     * Gets the current (rounded) balance of the account 
     * @return balance associated with this account 
     */
    public double getBalance() {
        String roundedBal = df.format((balance));
        return Double.parseDouble(roundedBal);
    }
    
    /**
     * Returns whether or not this account object equals the account object 
     * passed in 
     * @param other the other account being compared to this account 
     * @return true if the name matches 
     */
    public boolean equals(Account other) {
        return (this.getName().equals(other.getName()));
    }
    
    /**
     * Returns a string representation of the account 
     * @return Returns the name the account is under and the balance of the 
     * account as a string 
     */
    public String toString() {
        return "Name: " + name + ", Balance: $" + balance;
    }
    
    //private instance fields 
    private String name; 
    private double balance; 
    private final DecimalFormat df = new DecimalFormat("#.##");
}
