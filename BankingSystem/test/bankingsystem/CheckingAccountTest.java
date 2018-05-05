
package bankingsystem;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jamun
 */
public class CheckingAccountTest {
    
    public CheckingAccountTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
     /**
     * Test of deposit method, of class CheckingAccount.
     */
    @Test
    public void testDeposit() {
        System.out.println("deposit");
        CheckingAccount acc = new CheckingAccount();
        acc.deposit(5.0);
        double expResult = 5.0;
        double result = acc.getBalance();;
        assertEquals(expResult, result, .001);
    }

    /**
     * Test of withdraw method, of class CheckingAccount.
     */
    @Test
    public void testWithdraw() {
        System.out.println("withdraw");
        CheckingAccount acc = new CheckingAccount();
        acc.deposit(20.0);
        acc.withdraw(15.0);
        double expResult = 4.9;
        double result = acc.getBalance();
        assertEquals(expResult, result, .001);
    }
    
        /**
     * Test of withdraw method, of class CheckingAccount.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        CheckingAccount acc = new CheckingAccount();
        acc.deposit(15.0);
        double expResult = 15.0;
        double result = acc.getBalance();
        assertEquals(expResult, result, .001);
    }
    
}
