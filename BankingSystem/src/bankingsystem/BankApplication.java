/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingsystem;

import java.awt.EventQueue;

/**
 *
 * @author jamun
 */
public class BankApplication {

    public static void main(String[] args) {
        //Creates an empty ListOfAccounts object, myAccounts  
        ListOfAccounts myAccounts = new ListOfAccounts();
        
        //Creates various accounts of different types 
        SavingsAccount a1 = new SavingsAccount("Jane Doe"); 
        a1.deposit(500);
        SavingsAccount a2 = new SavingsAccount("Bill Smith");
        SavingsAccount a3 = new SavingsAccount("Tom Hanks");
        a3.deposit(100);
        CheckingAccount a4 = new CheckingAccount("Steve Martin");
        CheckingAccount a5 = new CheckingAccount("Jimmy Kimmel");
        a5.deposit(4000);
        CheckingAccount a6 = new CheckingAccount("Paul Bunyan");
        a6.deposit(10);
        
        //Fills the ListOfACcounts, myAccounts, with the accounts 
        myAccounts.addAccount(a1); 
        myAccounts.addAccount(a2);
        myAccounts.addAccount(a3);
        myAccounts.addAccount(a4);
        myAccounts.addAccount(a5);
        myAccounts.addAccount(a6);
        
        //starts the GUI 
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BankAppGUI(myAccounts).setVisible(true);
            }
        });
    }
      
    
    
}
