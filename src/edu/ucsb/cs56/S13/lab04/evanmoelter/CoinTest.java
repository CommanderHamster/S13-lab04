package edu.ucsb.cs56.S13.lab04.evanmoelter;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
   Test class for Coin

@author Evan Moelter
@version $TIME , CS56, S13, lab04
@see Coin
*/

public class CoinTest {

    @Test
    public void test_DefaultConstructor_and_getters() {
	Coin c = new Coin();
	assertEquals(0, c.getValue());
	assertEquals("", c.getName());
    }

    @Test
    public void test_TwoArgConstructor_and_getters_1() {
        Coin c = new Coin(25, "Quarter");
	assertEquals(25,c.getValue());
	assertEquals("Quarter", c.getName());
    }

    @Test
    public void test_TwoArgConstructor_and_getters_2() {
        Coin c = new Coin(10, "dime");
        assertEquals(10,c.getValue());
        assertEquals("dime", c.getName());
    }

    @Test
    public void test_Setters_and_getters_1() {
        Coin c = new Coin();
	c.setValue(50);
	c.setName("half-dollar");
        assertEquals(50,c.getValue());
        assertEquals("half-dollar", c.getName());
    }

    @Test
    public void test_toString_and_TwoArgConstructor() {
	Coin c = new Coin(50, "half-dollar");
	assertEquals("half-dollar, 50 cents", c.toString());
    }

    @Test
    public void test_toString_and_Setters() {
	Coin c = new Coin();
	c.setValue(50);
	c.setName("half-dollar");
	assertEquals("half-dollar, 50 cents", c.toString());
    }
    
    @Test
    public void test_Equals_0a() {
	Coin c1= new Coin();
	assertTrue(c1.equals(c1));
    }

    @Test
    public void test_Equals_0b() {
	Coin c1 = new Coin();
	Coin c2 = new Coin();
	assertTrue(c1.equals(c2));
	assertEquals(c1.equals(c2), c2.equals(c1));
    }
    
    @Test
    public void test_Equals_1a() {
	Coin c1= new Coin(10, "dime");
	Coin c2= new Coin(10, "dime");
	assertTrue(c1.equals(c2));
        assertEquals(c1.equals(c2), c2.equals(c1));
    }
    
    @Test
    public void test_Equals_1b() {
	Coin c1= new Coin(10, "dime");
	Coin c2= new Coin();
	c2.setValue(10);
	c2.setName("dime");
	assertTrue(c1.equals(c2));
	assertEquals(c1.equals(c2), c2.equals(c1));
    }
    
    @Test
    public void test_Equals_2a() {
	Coin c1= new Coin(10, "dime");
	Coin c2= new Coin(5, "nickel");
	assertFalse(c1.equals(c2));
	assertEquals(c1.equals(c2), c2.equals(c1));
    }
    
    @Test
    public void test_Equals_2b() {
        Coin c1= new Coin(10, "dime");
        Coin c2= new Coin();
	c2.setValue(5);
        c2.setName("nickel");
        assertFalse(c1.equals(c2));
        assertEquals(c1.equals(c2), c2.equals(c1));
    }
    
    @Test
    public void test_Equals_2c() {
	Coin c1= new Coin(10, "dime");
	Coin c2= new Coin(10, "nickel");
	assertFalse(c1.equals(c2));
	assertEquals(c1.equals(c2), c2.equals(c1));
    }
    
    @Test
    public void test_Equals_2d() {
        Coin c1= new Coin(10, "dime");
        Coin c2= new Coin();
        c2.setValue(10);
        c2.setName("nickel");
        assertFalse(c1.equals(c2));
        assertEquals(c1.equals(c2), c2.equals(c1));
    }
    
    @Test
    public void test_Equals_2e() {
	Coin c1= new Coin(10, "dime");
	Coin c2= new Coin(5, "dime");
	assertFalse(c1.equals(c2));
	assertEquals(c1.equals(c2), c2.equals(c1));
    }
    
    @Test
    public void test_Equals_2f() {
        Coin c1= new Coin(10, "dime");
        Coin c2= new Coin();
        c2.setValue(5);
        c2.setName("dime");
        assertFalse(c1.equals(c2));
        assertEquals(c1.equals(c2), c2.equals(c1));
    }



}// class CoinTest
