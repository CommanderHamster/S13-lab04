package edu.ucsb.cs56.S13.lab04.sdowell;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/** Test class for Car
 @author Sam Dowell
 @version 05/03/2013 for lab04, cs56, S13
 @see Car
*/
public class CarTest{

    /** Test case for default constructor as well as Car.getName() and Car.getYear()
	@see Car
    */
    @Test
    public void test_DefaultConstructor_and_getters(){
	Car c = new Car();
	assertEquals("Dodge Challenger",c.getName());
	assertEquals(2010,c.getYear());
    }
    /** Test case for two-arg constructor as well as Car.getName() and Car.getYear()
	@see Car
    */
    @Test
    public void test_TwoArgConstructor_and_getters_HondaCRV_2004(){
	Car c = new Car("Honda CRV", 2004);
	assertEquals("Honda CRV", c.getName());
	assertEquals(2004, c.getYear());
    }
    /** Test case for two-arg constructor as well as Car.getName() and Car.getYear()
	@see Car
    */
    @Test
    public void test_TwoArgConstructor_and_getters_ToyotaCorolla_2006(){
	Car c = new Car("Toyota Corolla", 2006);
	assertEquals("Toyota Corolla", c.getName());
	assertEquals(2006, c.getYear());
    }
    /** Test case for Car.setName()
	@see Car
    */
    @Test
    public void test_setName(){
	Car c = new Car();
	c.setName("Mustang");
	assertEquals("Mustang", c.getName());
    }
    /** Test case for Car.setYear()
	@see Car
    */
    @Test
    public void test_setYear(){
	Car c = new Car();
	c.setYear(1974);
	assertEquals(1974, c.getYear());
    }
    /** Test case for Car.toString()
	@see Car
    */
    @Test
    public void test_toString(){
	Car c = new Car();
	assertEquals("2010 Dodge Challenger", c.toString());

    }
    /** Test case for Car.toString()
	@see Car
    */
    @Test
    public void test_toString_HondaCRV_2004(){
	Car c = new Car("Honda CRV", 2004);
	assertEquals("2004 Honda CRV", c.toString());
    }
    /** Test case for Car.toString()
	@see Car
    */
    @Test
    public void test_toString_ToyotaCorolla_2006(){
	Car c = new Car("Toyota Corolla", 2006);
	assertEquals("2006 Toyota Corolla", c.toString());
    }
    /** Test case for Car.equals()
	@see Car
    */
    @Test
    public void test_equals_equal1(){
	Car c1 = new Car("Honda CRV", 2004);
	Car c2 = new Car("Honda CRV", 2004);
	assertTrue(c1.equals(c2));
    }
    /** Test case for Car.equals()
	@see Car
    */
    @Test
    public void test_equals_equal2(){
	Car c1 = new Car();
	Car c2 = new Car();
	assertTrue(c1.equals(c2));
    }
    /** Test case for Car.equals()
	@see Car
    */
    @Test
    public void test_equals_notequal(){
	Car c1 = new Car();
	Car c2 = new Car("Honda CRV", 2004);
	assertFalse(c1.equals(c2));

    }

}
