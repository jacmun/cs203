
package bankingsystem;

import java.util.ArrayList;

/**
 *
 * @author jamun
 */
public class ListOfAccounts extends Account {
    
    /**
     * Instantiates a list of accounts, an ArrayList of type Account 
     */
    public ListOfAccounts() {
        accountList = new ArrayList<Account>(); 
    }
    
    /**
     * Adds an account to the list of accounts 
     * @param a an Account object to be added to accountList 
     */
    public void addAccount(Account a) {
        accountList.add(a); 
    }
    
    /**
     * Removes a given account from the list of accounts 
     * @param acc the Account object to be removed from accountList
     */
    public void removeAccount(Account acc) {
        for (Account a : accountList) {
            if(a.equals(acc))
                accountList.remove(a);
        }
    }
    
    public void removeAccount(String name) {
        Account a = findAccount(name);
        accountList.remove(a);
    }
    
    /**
     * Gets an account from the list in position i 
     * @param i the position, in the arraylist, of the account being returned 
     * @return the account at position i of the arraylist of account objects 
     */
    public Account getAccount(int i) {
        return accountList.get(i);
    }
    
    /**
     * Finds an account by name 
     * @param name name of the Account being looked for 
     * @return the Account object associated with the given name 
     */
    public Account findAccount(String name) {
        for (Account a : accountList){
            if (a.getName().equals(name))
                    return a;  
            }
        return null; 
    }  
    
    /**
     * Returns how many accounts are in the list  
     * @return the size of accountlist 
     */
    public int getSize() {
        return accountList.size();
    }
    
    private ArrayList<Account> accountList;
}
