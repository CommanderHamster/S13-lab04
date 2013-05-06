package edu.ucsb.cs56.S13.lab04.vinhle101;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
@author Vinh Le
@version CS56, S13, lab04
@see Bank
*/

public class BankTest{

    @Test
    public void test_DefaultConstructor_and_getters(){
	Bank b = new Bank();
	assertEquals("Savings Account", b.getBankAccount());
	assertEquals(10000, b.getAccountBalance());
    }

    @Test
    public void test_TwoArgConstructor_and_getters(){
	Bank b = new Bank("Checking Account", 20000);
	assertEquals("Checking Account", b.getBankAccount());
	assertEquals(20000, b.getAccountBalance());
    }

    @Test
    public void test_BankAccount_setter(){
	Bank b = new Bank();
	b.setBankAccount("Checking Account 2");
	assertEquals("Checking Account 2", b.getBankAccount());
    }

    @Test
    public void test_BankAccountBalance_setter(){
	Bank b = new Bank();
	b.setAccountBalance(99999);
	assertEquals(99999, b.getAccountBalance());
    }
    
    @Test
    public void test_toString(){
	Bank b = new Bank();
	assertEquals("The Banking Account is: Savings Account, The Balance is 10000", b.toString());
    }
    
    @Test
    public void test_equalsMethod(){
	Bank a = new Bank("Checking Account", 20000);
	Bank b = new Bank("Checking Account", 20000);
	assertTrue(a.equals(b));
    }
    
    @Test
    public void test_equalsMethod2(){
	Bank a = new Bank();
	Bank b = new Bank();
	assertTrue(a.equals(b));
    }

    @Test
    public void test_equalsMethod_notEqual(){
	Bank a = new Bank();
	Bank b = new Bank("Checking Account", 20000);
	assertFalse(a.equals(b));
    }

}
