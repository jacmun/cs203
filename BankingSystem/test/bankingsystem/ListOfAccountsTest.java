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
public class ListOfAccountsTest {
    
    public ListOfAccountsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of addAccount method, of class ListOfAccounts.
     */
    @Test
    public void testAddAccount() {
        System.out.println("addAccount");
        Account a = new SavingsAccount("Tom Hanks");
        ListOfAccounts instance = new ListOfAccounts();
        instance.addAccount(a);
        Account b = instance.findAccount("Tom Hanks");
        boolean expResult = true;
        boolean result = a.equals(b);
        assertEquals(expResult, result);
    }

    /**
     * Test of removeAccount method, of class ListOfAccounts.
     */
    @Test
    public void testRemoveAccount() {
        System.out.println("removeAccount");
        Account acc1 = new CheckingAccount("Tom Hanks");
        Account acc2 = new SavingsAccount("Tom Cruise");
        ListOfAccounts instance = new ListOfAccounts();
        instance.addAccount(acc1);
        instance.addAccount(acc2);
        instance.removeAccount(acc1);
        Account expResult = null;
        Account result = instance.findAccount("Tom Hanks");
        assertEquals(expResult, result);
    }

    /**
     * Test of getAccount method, of class ListOfAccounts.
     */
    @Test
    public void testGetAccount() {
        System.out.println("getAccount");
        int i = 0;
        ListOfAccounts instance = new ListOfAccounts();
        Account acc1 = new CheckingAccount("Tom Hanks");
        Account acc2 = new CheckingAccount("Tom Cruise");
        instance.addAccount(acc1);
        instance.addAccount(acc2);
        Account expResult = acc1;
        Account result = instance.getAccount(i);
        assertEquals(expResult, result);
    }

    /**
     * Test of findAccount method, of class ListOfAccounts.
     */
    @Test
    public void testFindAccount() {
        System.out.println("findAccount");
        String name = "Tom Hanks";
        ListOfAccounts instance = new ListOfAccounts();
        Account acc = new SavingsAccount("Tom Hanks");
        instance.addAccount(acc);
        Account expResult = acc;
        Account result = instance.findAccount("Tom Hanks");
        assertEquals(expResult, result);
    }

    /**
     * Test of getSize method, of class ListOfAccounts.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        ListOfAccounts instance = new ListOfAccounts();
        Account acc1 = new CheckingAccount("Tom Hanks");
        Account acc2 = new CheckingAccount("Tom Cruise");
        Account acc3 = new CheckingAccount("Tom Hardy");
        instance.addAccount(acc1);
        instance.addAccount(acc2);
        instance.addAccount(acc3);
        int expResult = 3;
        int result = instance.getSize();
        assertEquals(expResult, result);
    }
    
}
