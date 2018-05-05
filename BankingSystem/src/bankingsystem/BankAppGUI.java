
package bankingsystem;

import java.awt.*; 
import java.awt.event.*;
import java.text.NumberFormat;
import java.util.Iterator;
import javax.swing.*;

/**
 *
 * @author jamun
 */
public class BankAppGUI extends javax.swing.JFrame {
    
    /**
     * The constructor instantiates a ListOfAccounts object 
     * and calls initComponents to build the main menu page 
     */
    public BankAppGUI(ListOfAccounts a) {
        accountList = a; 
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    /**
    * Builds the first screen, the main menu 
    */                        
    private void initComponents() {
        //visibility declarations 
        createAccountBut.setVisible(true);
        findAccountBut.setVisible(true);
        showCheckingBut.setVisible(true);
        showSavingsBut.setVisible(true);
        menuBut.setVisible(false);
        withdrawStatementLab.setVisible(false);
        depositStatementLab.setVisible(false);
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        //button to create a new account 
        createAccountBut.setText("Create New Account");
        createAccountBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccountButActionPerformed(evt);
            }
        });

        //button to find an account 
        findAccountBut.setText("Find Account");
        findAccountBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findAccountButActionPerformed(evt);
            }
        });
        
        //button to display all the checking accounts 
        showCheckingBut.setText("Show all checking accounts");
        showCheckingBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showCheckingButActionPerformed(evt);
            }
        });
        
        //button to display all the savings accounts 
        showSavingsBut.setText("Show all savings accounts");
        showSavingsBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showSavingsButActionPerformed(evt);
            }
        });

        // <editor-fold defaultstate="collapsed" desc=" Layout Code collapsed for space">          
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(143, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(showSavingsBut, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showCheckingBut, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(findAccountBut, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createAccountBut, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(136, 136, 136))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(createAccountBut, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(findAccountBut, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(showCheckingBut, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(showSavingsBut, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(60, 60, 60))
        ); // </editor-fold>

        pack();
    }                      

    /**
     * When the "create account" button is clicked, 
     * the user will be prompted to enter a name to create the account under 
     * and to choose either a checking or savings account 
     * @param evt 
     */
    private void createAccountButActionPerformed(java.awt.event.ActionEvent evt) {                                         
        //visiblity declarations 
        createAccountBut.setVisible(false);
        findAccountBut.setVisible(false);
        showCheckingBut.setVisible(false);
        showSavingsBut.setVisible(false);
        withdrawStatementLab.setVisible(false);
        depositStatementLab.setVisible(false);
        nameTextField.setVisible(true);
        createSavingsBut.setVisible(true);
        jLabel2.setVisible(true);
        
        //variable declarations 
        createSavingsBut = new javax.swing.JButton();
        createCheckingBut = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
               
        nameTextField.setText("");
        
        //button to create a new savings account 
        createSavingsBut.setText("Create Savings Account");
        createSavingsBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createSavingsButActionPerformed(evt);
            }
        });
        
        //button to create a new checking account 
        createCheckingBut.setText("Create Checking Account");
        createCheckingBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCheckingButActionPerformed(evt);
            }
        });
        
        // <editor-fold defaultstate="collapsed" desc=" Layout Code collapsed for space">          
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(53, 53, 53)
                            .addComponent(nameLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(66, 66, 66)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(createCheckingBut, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(createSavingsBut, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(249, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(createCheckingBut, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(createSavingsBut, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        ); //</editor-fold>    
    }
    
    /**
     * When the "find account" button is clicked, the user is prompted to 
     * enter a name to find the account 
     * @param evt 
     */
    private void findAccountButActionPerformed(java.awt.event.ActionEvent evt) {
        //visibility declarations 
        createAccountBut.setVisible(false);
        findAccountBut.setVisible(false);
        showCheckingBut.setVisible(false);
        showSavingsBut.setVisible(false);
        withdrawStatementLab.setVisible(false);
        depositStatementLab.setVisible(false);
        menuBut.setVisible(false);
        
        //variable declarations 
        searchBut = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nameTextField2 = new javax.swing.JTextField();
        
        //label to prompt the user to enter his/her name 
        jLabel2.setText("Enter your name:");
        
        //field for the user to enter the name 
        nameTextField2.setText("");
        
        //button to search for the inputted user name 
        searchBut.setText("Search");
        searchBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findButActionPerformed(evt);
            }
        });
        
        // <editor-fold defaultstate="collapsed" desc=" Layout Code collapsed for space">   
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel3)
                        .addGap(101, 101, 101)
                        .addComponent(searchBut, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(202, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(searchBut, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(97, Short.MAX_VALUE))
        ); //</editor-fold>     
    }
                                            
    /**
     * When the user has entered a name and has clicked the button to create a
     * savings account, the user will be informed that a savings account has 
     * been created under the inputted name. The user can then perform 
     * account operations, such as deposit and withdraw 
     * @param evt 
     */
    private void createSavingsButActionPerformed(java.awt.event.ActionEvent evt) {                                         
        //variable declarations 
        nameLabel.setVisible(false);
        nameTextField.setVisible(false);
        createSavingsBut.setVisible(false);
        createCheckingBut.setVisible(false);
        withdrawStatementLab.setVisible(false);
        depositStatementLab.setVisible(false);
        menuBut.setVisible(true);
        newAccountMsg.setVisible(true);
        printNameLabel.setVisible(true);
        depositBut.setVisible(true);
        withdrawBut.setVisible(true);
        optionsLabel.setVisible(true);
        
        //gets the inputted name from the text field and stores it in a variable
        String userName = nameTextField.getText();
        
        //if the user did not input a name, nothing happens 
        if(userName == null || userName.isEmpty()) {
            nameLabel.setVisible(true);
            nameTextField.setVisible(true);
            createSavingsBut.setVisible(true);
            createCheckingBut.setVisible(true);
        }
        // else, a savings account under the inputted name is created 
        else{ 
            //new savings account created and added to the account list 
            Account savingsAcc = new SavingsAccount(userName); 
            myAccount = savingsAcc; 
            accountList.addAccount(savingsAcc);
            
            //message informing user of account creation 
            newAccountMsg.setText("A savings account has been created under: ");   
            printNameLabel.setText("\"" + userName + "\"");
            
            //button to deposit money 
            depositBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositButActionPerformed(evt);
            }
            });
                     
            //button to withdraw money 
            withdrawBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawButActionPerformed(evt);
            }
            });
            
            //button to return to the menu 
            menuBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButActionPerformed(evt);
            }
            });
            
            // <editor-fold defaultstate="collapsed" desc=" Layout Code collapsed for space">          
            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(optionsLabel)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(depositBut, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(withdrawBut, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(menuBut))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(printNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(newAccountMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
            )));
            layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(newAccountMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(printNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(optionsLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depositBut, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(withdrawBut, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(menuBut)
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addContainerGap(60, Short.MAX_VALUE))
        ); // </editor-fold>            
        }
    }     
    
    /**
     * When the user has entered a name and has clicked the button to create a
     * checking account, the user will be informed that a checking account has 
     * been created under the inputted name. The user can then perform 
     * account operations, such as deposit and withdraw 
     * @param evt 
     */
    public void createCheckingButActionPerformed(java.awt.event.ActionEvent evt) {
        //variable declarations 
        nameLabel.setVisible(false);
        nameTextField.setVisible(false);
        createSavingsBut.setVisible(false);
        createCheckingBut.setVisible(false);
        withdrawStatementLab.setVisible(false);
        depositStatementLab.setVisible(false);
        newAccountMsg.setVisible(true);
        printNameLabel.setVisible(true);
        depositBut.setVisible(true);
        withdrawBut.setVisible(true);
        menuBut.setVisible(true);
        optionsLabel.setVisible(true);
        
        //gets the inputted name from the text field and stores it in a variable
        String userName = nameTextField.getText();
        
        //if the user did not input a name, nothing happens
        if(userName == null || userName.isEmpty()) {
            nameLabel.setVisible(true);
            nameTextField.setVisible(true);
            createSavingsBut.setVisible(true);
            createCheckingBut.setVisible(true);
        }
        //else, a checking account under the inputted name is created
        else{ 
            //new savings account created and added to the account list
            Account checkingAcc = new CheckingAccount(userName);
            myAccount = checkingAcc;
            accountList.addAccount(checkingAcc);
            
            //message informing user of account creation 
            newAccountMsg.setText("A checking account has been created under: "); 
            printNameLabel.setText("\'" + userName + "\'");
            
            //button to deposit money 
            depositBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositButActionPerformed(evt);
            }
            });
              
            //button to withdraw money 
            withdrawBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawButActionPerformed(evt);
            }
            });
            
            //button to return to the menu 
            menuBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButActionPerformed(evt);
            }
            });
            
            // <editor-fold defaultstate="collapsed" desc="Layout Code collapsed for space">   
            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(optionsLabel)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(depositBut, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(withdrawBut, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(menuBut))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(printNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(newAccountMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
            )));
            layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(newAccountMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(printNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(optionsLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depositBut, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(withdrawBut, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(menuBut)
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addContainerGap(60, Short.MAX_VALUE))
        ); // </editor-fold>
        }   
    }
    
    /**
     * When the user has inputted a name to search for an account and clicked 
     * the search button, the account will be searched for. The user will be 
     * informed if the account was found or not. 
     * @param evt 
     */
    private void findButActionPerformed(java.awt.event.ActionEvent evt) {
        //visibility declarations 
        searchBut.setVisible(false);
        jLabel2.setVisible(false);
        nameTextField2.setVisible(false);
        withdrawStatementLab.setVisible(false);
        depositStatementLab.setVisible(false);
        menuBut.setVisible(false);        
        
        //gets the inputted name from the text field and stores in a variable 
        String userName = nameTextField2.getText();
        //searches for the account in the account list (using the inputted name) 
        myAccount = accountList.findAccount(userName);
        
        //if the user did not input a name, nothing happens 
        if(userName == null || userName.isEmpty()) {
            searchBut.setVisible(true);
            jLabel2.setVisible(true);
            nameTextField2.setVisible(true);
            if(errorMsg!=null) errorMsg.setVisible(false);
        }
        //if the account was not found, an error message is displayed and 
        //the user is prompted to try again 
        else if(myAccount == null) {
            searchBut.setVisible(true);
            jLabel2.setVisible(true);
            nameTextField2.setVisible(true);
            
            errorMsg.setText("Your account was not found. Please try again.");
            errorMsg.setVisible(true);    
            
            // <editor-fold defaultstate="collapsed" desc="Layout Code collapsed for space">   
            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(66, 66, 66)
                            .addComponent(jLabel2)
                            .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(errorMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(68, 68, 68))))));
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(55, 55, 55)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap()
                    .addComponent(errorMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(40, 40, 40)));
            // </editor-fold>
        }
        //if the account is found, the user is informed that the account has 
        //been found and the balance is displayed 
        else {
            if(errorMsg!=null) errorMsg.setVisible(false);
            
            //displays if the account is either checking or savings 
            if(myAccount.getClass() == CheckingAccount.class)
                accountFoundLabel.setText("Checking Account for \'" + userName + "\' found.");
            else
                accountFoundLabel.setText("Savings Account for \'" + userName + "\' found.");

            //displays current balance of the found account 
            currentBalanceLab.setText("Current Balance: $" + myAccount.getBalance());

            //visibility declarations (user has option to perform account 
            //operations with found account or return to menu) 
            accountFoundLabel.setVisible(true);
            currentBalanceLab.setVisible(true); 
            depositBut.setVisible(true);
            withdrawBut.setVisible(true);
            deleteAccountBut.setVisible(true);
            menuBut.setVisible(true);
            
            //button to deposit money 
            depositBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositButActionPerformed(evt);
            }
            });

            //button to withdraw money 
            withdrawBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawButActionPerformed(evt);
            }
            });

            //button to delete the account 
            deleteAccountBut.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    deleteAccountButActionPerformed(evt);
                }
            });
            
            //button to return tothe menu 
            menuBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButActionPerformed(evt);
            }
            });

            // <editor-fold defaultstate="collapsed" desc="Layout Code collapsed for space">   
            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(66, 66, 66)
                            .addComponent(jLabel2))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(currentBalanceLab, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(accountFoundLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(depositBut, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(68, 68, 68)
                                    .addComponent(withdrawBut, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(152, 152, 152)
                            .addComponent(optionsLabel))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(133, 133, 133)
                            .addComponent(deleteAccountBut, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(145, 145, 145)
                            .addComponent(menuBut)))
                    .addGap(205, 441, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(accountFoundLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(currentBalanceLab, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                    .addComponent(optionsLabel)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(depositBut, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(withdrawBut, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(deleteAccountBut, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)
                    .addComponent(menuBut)
                    .addGap(44, 44, 44)
                    .addComponent(jLabel2)
                    .addGap(60, 60, 60))
            ); //</editor-fold>
        }
    }
    
    /**
     * When the user has clicked the "show all checking accounts" button, all
     * checking accounts in the list of accounts will be displayed 
     * @param evt 
     */
    private void showCheckingButActionPerformed(java.awt.event.ActionEvent evt) {
        //visiblity declarations 
        createAccountBut.setVisible(false);
        findAccountBut.setVisible(false);
        showCheckingBut.setVisible(false);
        showSavingsBut.setVisible(false);
        withdrawStatementLab.setVisible(false);
        depositStatementLab.setVisible(false);
        menuBut.setVisible(true);
        
        checkingListLab = new javax.swing.JLabel();
        
        //String that gets and stores the string representation of all the 
        //checking accounts in the account list 
        String checkingList = "<html> Checking accounts: <br>";
        for(int i=0; i < accountList.getSize() ; i++) {
            if(accountList.getAccount(i).getClass() == CheckingAccount.class)
                checkingList += accountList.getAccount(i).toString() + "<br>";
        }
        checkingList += "</html>";
        checkingListLab.setText(checkingList);
        
        //button to return to the menu 
        menuBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButActionPerformed(evt);
            }
        });
        
        // <editor-fold defaultstate="collapsed" desc="Layout Code collapsed for space">       
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(menuBut, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(checkingListLab, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(checkingListLab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menuBut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(60, 60, 60))
        );// </editor-fold>
    }
    
    /**
     * When the user has clicked the "show all savings accounts" button, all
     * savings accounts in the list of accounts will be displayed  
     * @param evt 
     */
    private void showSavingsButActionPerformed(java.awt.event.ActionEvent evt) {
        //visibility declaratinos 
        createAccountBut.setVisible(false);
        findAccountBut.setVisible(false);
        showCheckingBut.setVisible(false);
        showSavingsBut.setVisible(false);
        withdrawStatementLab.setVisible(false);
        depositStatementLab.setVisible(false);
        menuBut.setVisible(true);
        
        savingsListLab = new javax.swing.JLabel();
        
        //String that gets and stores the string representation of all the 
        //savings accounts in the account list
        String savingsList = "<html> Savings accounts: <br>";
        for(int i=0; i < accountList.getSize() ; i++) {
            if(accountList.getAccount(i).getClass() == SavingsAccount.class)
                savingsList += accountList.getAccount(i).toString() + "<br>";
        }
        savingsList += "</html>";
        savingsListLab.setText(savingsList);
        
        //button to return to the menu
        menuBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButActionPerformed(evt);
            }
        });
        
        // <editor-fold defaultstate="collapsed" desc="Layout Code collapsed for space">   
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(menuBut, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(savingsListLab, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(savingsListLab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menuBut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(60, 60, 60))
        ); // </editor-fold>
    }
    
    /**
     * When the user has clicked the "deposit" button, the user will be prompted
     * to enter an amount to deposit into his/her account and click submit 
     * @param evt 
     */
    private void depositButActionPerformed(java.awt.event.ActionEvent evt) {
        //visibility declarations 
        count1++;
        newAccountMsg.setVisible(false);
        printNameLabel.setVisible(false);
        depositBut.setVisible(false);
        optionsLabel.setVisible(false);
        withdrawBut.setVisible(false);
        accountFoundLabel.setVisible(false);
        deleteAccountBut.setVisible(false);
        currentBalanceLab.setVisible(false);
        currentBalanceLab3.setVisible(false);
        nameLabel.setVisible(false);
        depositStatementLab.setVisible(false);
        withdrawStatementLab.setVisible(false);
        depositAmtLab.setVisible(true);
        depositTextField.setVisible(true);
        currentBalanceLab2.setVisible(true);
        submitDepositBut.setVisible(true);
        
        //message informing user to enter an amount to deposit 
        depositAmtLab.setText("Enter amount to deposit: ");
        
        //text field that the user inputs their desired amount into 
        depositTextField.setText("0");
        
        //message informing user of their current balance 
        currentBalanceLab2.setText("Current Balance: $ " 
                + myAccount.getBalance());
        
        //button to submit desired amount and deposit 
        submitDepositBut.setText("Submit");
        submitDepositBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitDepositButActionPerformed(evt);
            }
        });
        
        // <editor-fold defaultstate="collapsed" desc="Layout Code collapsed for space">   
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(currentBalanceLab2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(depositAmtLab, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(submitDepositBut)
                            .addComponent(depositTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(currentBalanceLab2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depositAmtLab, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(depositTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(submitDepositBut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(60, 60, 60))
        ); //</editor-fold>
    }
    
    /**
     * When the user has clicked the "withdraw" button, the user will be 
     * prompted to enter an amount to withdraw from their account and 
     * click submit 
     * @param evt 
     */
    private void withdrawButActionPerformed(java.awt.event.ActionEvent evt) {
        //visibility declarations 
        count2++;
        newAccountMsg.setVisible(false);
        depositStatementLab.setVisible(false);
        withdrawStatementLab.setVisible(false);
        printNameLabel.setVisible(false);
        depositBut.setVisible(false);
        optionsLabel.setVisible(false);
        withdrawBut.setVisible(false);
        accountFoundLabel.setVisible(false);
        deleteAccountBut.setVisible(false);
        currentBalanceLab.setVisible(false);
        currentBalanceLab3.setVisible(false);
        withdrawAmtLab.setVisible(true);
        withdrawTextField.setVisible(true);
        currentBalanceLab2.setVisible(true);
        submitWithdrawBut.setVisible(true);

        //message informing user to enter amount to withdraw 
        withdrawAmtLab.setText("Enter amount to withdraw: ");
        
        //text field that the user inputs their desired amount into 
        withdrawTextField.setText("0");

        //message informing user of current balance 
        currentBalanceLab2.setText("Current Balance: $ " 
                + myAccount.getBalance());
        
        //button to submit desired amount and withdraw 
        submitWithdrawBut.setText("Submit");
        submitWithdrawBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitWithdrawButActionPerformed(evt);
            }
        });

        // <editor-fold defaultstate="collapsed" desc="Layout Code collapsed for space">   
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(currentBalanceLab2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(withdrawAmtLab, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(submitWithdrawBut)
                            .addComponent(withdrawTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(currentBalanceLab2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(withdrawAmtLab, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(withdrawTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(submitWithdrawBut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(60, 60, 60))
        ); 
        pack(); //</editor-fold>
    }
    
    /**
     * When the user has submitted their desired amount to deposit into their 
     * account, the account will be updated and the user will be informed of 
     * the transaction that took place
     * @param evt 
     */
    public void submitDepositButActionPerformed(java.awt.event.ActionEvent evt) {
        //visibility declarations 
        withdrawStatementLab.setVisible(false);
        currentBalanceLab3.setVisible(false);
        depositTextField.setVisible(false);
        currentBalanceLab2.setVisible(false);
        submitDepositBut.setVisible(false);
        depositAmtLab.setVisible(false);
        depositBut.setVisible(true);
        withdrawBut.setVisible(true);
        deleteAccountBut.setVisible(true);
        optionsLabel.setVisible(true);
        menuBut.setVisible(true);
        currentBalanceLab.setVisible(true);
        depositStatementLab.setVisible(true);
        printNameLabel.setVisible(true);
        
        //the amount the user inputted is converted to a double and stored in a 
        //variable 
        try{
            depositAmt = Double.parseDouble(depositTextField.getText());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        
        //deposits the money in the user's account 
        //a counter is used to adjust for an unavoidable loop error 
        if(count1 > 1) 
            myAccount.deposit(depositAmt/count1);
        else 
            myAccount.deposit(depositAmt);
        
        //button to delete the account 
        deleteAccountBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAccountButActionPerformed(evt);
            }
        });
        
        //message informing the user of their current balance 
        currentBalanceLab.setText("Current Balance: $ " 
                + myAccount.getBalance());
      
        //message informing the user of the transaction 
        depositStatementLab.setText("Transaction: $ " + depositAmt 
                + " deposited.");

        //message that prints the name of the account that underwent 
        //the transaction 
        printNameLabel.setText("Name: " + myAccount.getName());
        
        // <editor-fold defaultstate="collapsed" desc="Layout Code collapsed for space"> 
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(depositStatementLab, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(currentBalanceLab, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(depositBut, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(withdrawBut, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(printNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menuBut, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteAccountBut, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(131, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(optionsLabel)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(depositStatementLab, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(printNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(currentBalanceLab, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(optionsLabel)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(depositBut, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(withdrawBut, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)))
                        .addGap(18, 18, 18)
                        .addComponent(deleteAccountBut, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(menuBut)
                        .addContainerGap(237, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(60, 60, 60))))
        ); 
        pack(); //</editor-fold>
    }
    
    /**
     * When the user has submitted their desired amount to withdraw from their 
     * account, the account will be updated and the user will be informed of 
     * the transaction that took place
     * @param evt 
     */
    public void submitWithdrawButActionPerformed(java.awt.event.ActionEvent evt) {
        //variable declarations 
        submitWithdrawBut.setVisible(false);
        withdrawAmtLab.setVisible(false);
        withdrawTextField.setVisible(false);
        depositTextField.setVisible(false);
        currentBalanceLab2.setVisible(false);
        currentBalanceLab.setVisible(false);
        depositAmtLab.setVisible(false);
        depositBut.setVisible(true);
        withdrawBut.setVisible(true);
        deleteAccountBut.setVisible(true);
        optionsLabel.setVisible(true);
        menuBut.setVisible(true);
        withdrawStatementLab.setVisible(true);
        currentBalanceLab3.setVisible(true);
        printNameLabel.setVisible(true);
        
        //the amount the user inputted is converted to a double and stored in a 
        //variable 
        try{
        withdrawAmt = Double.parseDouble(withdrawTextField.getText());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        
        //withdraws the money in the user's account 
        //a counter is used to adjust for an unavoidable loop error
        if(count2>1) 
            myAccount.withdraw(withdrawAmt/count2);
        else 
            myAccount.withdraw(withdrawAmt); 
        
        //button to delete the account 
        deleteAccountBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               deleteAccountButActionPerformed(evt);
            }
        });
        
        //checks if the account is either a checking or savings account 
        //if the account is a checking account, the user is notified 
        //of the $0.10 withdrawal fee 
        if(myAccount.getClass() == CheckingAccount.class) {
            withdrawStatementLab.setText("Transaction: $ " + withdrawAmt + " "
                    + "+ $0.10 fee withdrawn.");
        }
        //otherwise, a regular transaction message is displayed 
        else{
            withdrawStatementLab.setText("Transaction: $ " + withdrawAmt 
                    + " withdrawn.");
        }
                
        //message that informs the user of their current balance 
        currentBalanceLab3.setText("Current Balance: $ " 
                + myAccount.getBalance());

        //message that prints the name of the account that underwent 
        //the transaction 
        printNameLabel.setText("Name: " + myAccount.getName());
        
        // <editor-fold defaultstate="collapsed" desc="Layout Code collapsed for space"> 
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(printNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(depositBut, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(withdrawBut, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(withdrawStatementLab, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(menuBut, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteAccountBut, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(optionsLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(currentBalanceLab3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(165, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(withdrawStatementLab, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(printNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(currentBalanceLab3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(optionsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(withdrawBut, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(depositBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(deleteAccountBut, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(menuBut)
                .addContainerGap(55, Short.MAX_VALUE))
        ); // </editor-fold>
    }
    
    /**
     * when the user has clicked the "delete account" button, the account will 
     * be removed from the account list and the user will be informed that 
     * the account has been deleted 
     * @param evt 
     */
    public void deleteAccountButActionPerformed(java.awt.event.ActionEvent evt) {
        //visibility declarations 
        depositBut.setVisible(false);
        withdrawBut.setVisible(false);
        accountFoundLabel.setVisible(false);
        deleteAccountBut.setVisible(false);
        optionsLabel.setVisible(false);
        currentBalanceLab.setVisible(false);
        currentBalanceLab2.setVisible(false);
        currentBalanceLab3.setVisible(false);
        withdrawStatementLab.setVisible(false);
        depositStatementLab.setVisible(false);
        printNameLabel.setVisible(false);
        deletedStatementLab.setVisible(true);
        menuBut.setVisible(true);
        
        //removes the account fromt the account list 
        accountList.removeAccount(myAccount.getName());

        //message display informing the user of the account deletion, 
        //depending on the type of the account 
        if(myAccount.getClass() == CheckingAccount.class)
            deletedStatementLab.setText("The Checking Account under \"" 
                    + myAccount.getName() +"\" has been deleted. ");

         else
            deletedStatementLab.setText("The Savings Account under \"" 
                    + myAccount.getName() +"\" has been deleted. ");

        // <editor-fold defaultstate="collapsed" desc="Layout Code collapsed for space"> 
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(deletedStatementLab, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(menuBut, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(deletedStatementLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(menuBut)
                .addContainerGap(126, Short.MAX_VALUE))
        ); //</editor-fold>
    }
    
    /**
     * When the "return to menu" button is clicked, the user will be returned
     * to the initial/menu screen, which gives the option to create an account,
     * find an account, print all savings accts., or print all checking accts. 
     * @param evt 
     */
    public void menuButActionPerformed(java.awt.event.ActionEvent evt) {
        //visibility declarations 
        depositBut.setVisible(false);
        withdrawBut.setVisible(false);
        printNameLabel.setVisible(false);
        optionsLabel.setVisible(false);
        newAccountMsg.setVisible(false);
        currentBalanceLab.setVisible(false);
        currentBalanceLab2.setVisible(false);
        accountFoundLabel.setVisible(false);
        checkingListLab.setVisible(false);
        currentBalanceLab3.setVisible(false);
        savingsListLab.setVisible(false);
        checkingListLab.setVisible(false);
        deleteAccountBut.setVisible(false);
        deletedStatementLab.setVisible(false);
        
        //calls initComponents, which creates the initial menu screen 
        initComponents();
    }

    // Variables declaration  
    private Account myAccount; 
    private ListOfAccounts accountList;
    private double depositAmt;
    private double withdrawAmt;
    private javax.swing.GroupLayout layout;
    private javax.swing.JButton createAccountBut = new javax.swing.JButton();
    private javax.swing.JButton deleteAccountBut = new javax.swing.JButton("Delete Account");
    private javax.swing.JButton findAccountBut = new javax.swing.JButton();
    private javax.swing.JButton showSavingsBut = new javax.swing.JButton();
    private javax.swing.JButton showCheckingBut = new javax.swing.JButton();
    private javax.swing.JButton createSavingsBut = new javax.swing.JButton();
    private javax.swing.JButton createCheckingBut = new javax.swing.JButton(); 
    private javax.swing.JButton searchBut = new javax.swing.JButton();
    private javax.swing.JButton depositBut = new javax.swing.JButton("Deposit");
    private javax.swing.JButton withdrawBut = new javax.swing.JButton("Withdraw");
    private javax.swing.JButton menuBut = new javax.swing.JButton("Back to Menu");
    private javax.swing.JButton submitDepositBut = new javax.swing.JButton();
    private javax.swing.JButton submitWithdrawBut = new javax.swing.JButton();
    private javax.swing.JLabel nameLabel = new javax.swing.JLabel("Enter your name: ");
    private javax.swing.JLabel printNameLabel = new javax.swing.JLabel();
    private javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
    private javax.swing.JLabel jLabel3 = new javax.swing.JLabel(); 
    private javax.swing.JLabel errorMsg = new javax.swing.JLabel();
    private javax.swing.JLabel newAccountMsg = new javax.swing.JLabel();
    private javax.swing.JLabel optionsLabel = new javax.swing.JLabel("Account options");
    private javax.swing.JLabel accountFoundLabel = new javax.swing.JLabel();
    private javax.swing.JLabel currentBalanceLab = new javax.swing.JLabel();
    private javax.swing.JLabel currentBalanceLab2 = new javax.swing.JLabel();
    private javax.swing.JLabel currentBalanceLab3 = new javax.swing.JLabel();
    private javax.swing.JLabel checkingListLab = new javax.swing.JLabel();
    private javax.swing.JLabel savingsListLab = new javax.swing.JLabel();
    private javax.swing.JLabel depositAmtLab = new javax.swing.JLabel();
    private javax.swing.JLabel withdrawAmtLab = new javax.swing.JLabel();
    private javax.swing.JLabel depositStatementLab = new javax.swing.JLabel();
    private javax.swing.JLabel withdrawStatementLab = new javax.swing.JLabel(); 
    private javax.swing.JLabel deletedStatementLab = new javax.swing.JLabel(); 
    private javax.swing.JTextField nameTextField = new javax.swing.JTextField(); 
    private javax.swing.JTextField nameTextField2 = new javax.swing.JTextField();
    private javax.swing.JTextField depositTextField = new javax.swing.JTextField();
    private javax.swing.JTextField withdrawTextField = new javax.swing.JTextField();
    private double count1 = 0.0; 
    private double count2 = 0.0; 
    
    // End of variables declaration                   
}


