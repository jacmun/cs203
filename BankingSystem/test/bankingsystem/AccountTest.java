/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingsystem;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jamun
 */
public class AccountTest {
    
    public AccountTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of deposit method, of class Account.
     */
    @Test
    public void testDeposit() {
        System.out.println("deposit");
        double amount = 10.0;
        Account acc = new Account();
        acc.deposit(amount);
        double expResult = 10.0;
        double result = acc.getBalance();
        assertEquals(expResult, result, .001);
    }

    /**
     * Test of withdraw method, of class Account.
     */
    @Test
    public void testWithdraw() {
        System.out.println("withdraw");
        double amount = 10.0;
        Account acc = new Account();
        acc.deposit(20.0);
        acc.withdraw(amount);
        double expResult = 10.0;
        double result = acc.getBalance();
        assertEquals(expResult, result, 0.001);
    }

    /**
     * Test of getName method, of class Account.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Account acc = new Account("Tom Hanks");
        String expResult = "Tom Hanks";
        String result = acc.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getBalance method, of class Account.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        Account acc = new Account();
        acc.deposit(35.0);
        double expResult = 35.0;
        double result = acc.getBalance();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of equals method, of class Account.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Account other = new Account("Tom Hanks");
        Account acc = new Account("Tom Hanks");
        boolean expResult = true;
        boolean result = acc.equals(other);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Account.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Account instance = new Account("Tom Hanks");
        String expResult = "Name: Tom Hanks, Balance: $0.0";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
