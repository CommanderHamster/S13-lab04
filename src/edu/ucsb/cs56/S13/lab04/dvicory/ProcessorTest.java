package edu.ucsb.cs56.S13.lab04.dvicory;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
   Test class for Processor

   @author Daniel Vicory
   @version CS56, S13, lab04
   @see Processor
 */

public class ProcessorTest {
    /**
       Tests default constructor and getters of the processor

       @see Processor#Processor
    */
    @Test
    public void test_defaultConstructor_and_getters() {
	Processor p = new Processor();
	assertEquals("Generic x86", p.getFamily());
	assertEquals(16, p.getCoreSpeed());
    }

    /**
       Tests two-arg constructor and getters of the processor

       @see Processor#Processor
    */
    @Test
    public void test_twoArgConstructor_and_getters() {
	Processor p = new Processor("Ivy Bridge", 3100);
	assertEquals("Ivy Bridge", p.getFamily());
	assertEquals(3100, p.getCoreSpeed());
    }

    /**
       Tests getting the family name of the processor

       @see Processor#getFamily
     */
    @Test
    public void test_getFamily() {
	Processor ivyBridge = new Processor("Ivy Bridge", 3100);
	assertEquals("Ivy Bridge", ivyBridge.getFamily());
    }

    /**
       Tests setting the family name of the processor

       @see Processor#setFamily
    */
    @Test
    public void test_setFamily() {
	Processor dothan = new Processor("Dothan", 1600);
	dothan.setFamily("Dothan 533");
	assertEquals("Dothan 533", dothan.getFamily());
    }

    /**
       Tests getting the core speed of the processor

       @see Processor#getCoreSpeed
     */
    @Test
    public void test_getCoreSpeed() {
	Processor wolfdale = new Processor("Wolfdale", 3000);
	assertEquals(3000, wolfdale.getCoreSpeed());
    }

    /**
       Tests setting the core speed of the processor

       @see Procesor#setCoreSpeed
     */
    @Test
    public void test_setCoreSpeed() {
	Processor cedarMill = new Processor("Cedar Mill", 3600);
	cedarMill.setCoreSpeed(1200);
	assertEquals(1200, cedarMill.getCoreSpeed());
    }

    /**
       Tests toString's ability to return the appropriate descriptive information about the processor

       @see Processor#toString
    */
    @Test
    public void test_toString() {
	Processor ivyBridge = new Processor("Ivy Bridge", 3100);
	String expected = "[Ivy Bridge, 3100 MHz]";
	assertEquals(expected, ivyBridge.toString());
    }

    /**
       Tests equals method, should return true if both processors are the same, otherwise false

       @see Processor#equals
    */
    @Test
    public void test_equals() {
	Processor ivyBridge1 = new Processor("Ivy Bridge", 3100);
	Processor ivyBridge2 = new Processor("Ivy Bridge", 3100);
	assertEquals(true, ivyBridge1.equals(ivyBridge2));
    }

    /**
       Tests equals method, should return true if both processors are the same, otherwise false

       @see Processor#equals
    */
    @Test
    public void test_equals_notEqual() {
	Processor ivyBridge1 = new Processor();
	Processor ivyBridge2 = new Processor("Ivy Bridge", 3100);
	assertEquals(false, ivyBridge1.equals(ivyBridge2));
    }
}
