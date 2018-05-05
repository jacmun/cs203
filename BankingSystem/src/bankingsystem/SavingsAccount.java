
package bankingsystem;

/**
 *
 * @author jamun
 */
public class SavingsAccount extends Account {

    /**
     * Default constructor 
     * Calls the superclass default constructor 
     */
    public SavingsAccount() {
        super();
    }
    
    /**
     * Constructor that creates a savings account of a given name
     * Calls the superclass constructor 
     * @param n name that the savings account is created under 
     */
    public SavingsAccount(String n) {
        super(n); 
        balance = 0;
    }
    
    // private instance fields 
    private String name; 
    private double balance;  
    
}
