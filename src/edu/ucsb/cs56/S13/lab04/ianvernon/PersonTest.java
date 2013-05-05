package edu.ucsb.cs56.S13.lab04.ianvernon;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/** test class for Person

@author Ian Vernon
@version CS56, S13, lab04
@see Person

*/

public class PersonTest {

    @Test
    public void test_DefaultConstructor_and_getters()
    {
	Person p = new Person();
	assertEquals("John", p.getName());
	assertEquals(25, p.getAgeInYears());
    }

    @Test
    public void test_TwoArgConstructor_and_getters()
    {
	Person p = new Person("Ansel", 20);
	assertEquals("Ansel", p.getName());
	assertEquals(20, p.getAgeInYears());
    }
    
    @Test
    public void test_setName()
    {
	Person p = new Person();
	p.setName("George");
	assertEquals("George", p.getName());
    }
    @Test
    public void test_setAgeInYears()
    {
	Person p = new Person();
	p.setAgeInYears(60);
	assertEquals(60, p.getAgeInYears());
    }
    
    @Test
    public void test_toString_default()
    {
	Person defaultP = new Person();
	assertEquals("Name: John, Age: 25", defaultP.toString());
    }

    @Test
    public void test_toString_twoArgConstructor()
    {
	Person p = new Person("Ansel", 20);
	assertEquals("Name: Ansel, Age: 20", p.toString()); 
    }
    
    @Test
    public void test_equals_equal1()
    {
	Person p1 = new Person();
	Person p2 = new Person();
	assertTrue(p1.equals(p2));
    }
    @Test
    public void test_equals_equal2()
    {
	Person p1 = new Person("Ansel", 20);
	Person p2 = new Person("Ansel", 20);
	assertTrue(p1.equals(p2));
    }
    
    @Test
    public void test_equals_notEqual()
    {
	Person p1 = new Person("Bob", 21);
	Person p2 = new Person("Betty", 22);
	assertFalse(p1.equals(p2));
    }

}
