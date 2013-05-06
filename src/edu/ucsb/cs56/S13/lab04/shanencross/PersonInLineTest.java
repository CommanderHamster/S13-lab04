package edu.ucsb.cs56.S13.lab04.shanencross;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/** test class for PersonInLine

@author Shanen Cross
@version CS56, S13, lab04
@see PersonInLine

*/


public class PersonInLineTest {

    /**
       Test case for constructor with no argument.
     */
    @Test public void testNoArgConstructor() {
        PersonInLine linePerson = new PersonInLine();
        assertEquals("", linePerson.getName());
        assertEquals(1, linePerson.getNumberInLine());
    }
    
    /**
       Test case for constructor with two arguments, String and int.
     */
    @Test public void testStringAndIntConstructor() {
        PersonInLine linePerson = new PersonInLine("Bob Miller", 8);
        assertEquals("Bob Miller", linePerson.getName());
        assertEquals(8, linePerson.getNumberInLine());
    }
    
    /**
       Test case for name getter method
     */
    @Test public void testGetName() {
	PersonInLine linePerson = new PersonInLine("Bob Miller", 8);
	assertEquals("Bob Miller", linePerson.getName());
    }  

    /**
       Test case for number-in-line getter method
    */
    @Test public void testGetNumberInLine() {
	PersonInLine linePerson = new PersonInLine("Bob Miller", 8);
	assertEquals(8, linePerson.getNumberInLine());
    }

    /**
       Test case for name setter method
    */
    @Test public void testSetName() {
 	PersonInLine linePerson = new PersonInLine();
	linePerson.setName("Bob Miller");
	assertEquals("Bob Miller", linePerson.getName());
    }  

    /**
       Test case for number-in-line setter method
    */
    @Test public void testSetNumberInLine() {
	PersonInLine linePerson = new PersonInLine();
	linePerson.setNumberInLine(8);
	assertEquals(8, linePerson.getNumberInLine());
    }  

    /**
       Test case for equals method
    */
    @Test public void testEquals1() {
	PersonInLine linePerson = new PersonInLine("Bob Miller", 8);
	PersonInLine otherLinePerson = new PersonInLine("Bob Miller", 8);
	assertTrue(linePerson.equals(otherLinePerson));
    }  

    /**
       Test case for equals method
    */
    @Test public void testEquals2() {
	PersonInLine linePerson = new PersonInLine("Bob Miller", 8);
	PersonInLine otherLinePerson = new PersonInLine("Frank Miller", 8);
	assertFalse(linePerson.equals(otherLinePerson));
    } 
 
    /**
       Test case for equals method
    */
    @Test public void testEquals3() {
	PersonInLine linePerson = new PersonInLine("Bob Miller", 8);
	PersonInLine otherLinePerson = new PersonInLine("Bob Miller", 3);
	assertFalse(linePerson.equals(otherLinePerson));
    }  

    /**
       Test case for equals method
    */
    @Test public void testEquals4() {
	PersonInLine linePerson = new PersonInLine("Bob Miller", 8);
	PersonInLine otherLinePerson = new PersonInLine("Frank Miller", 3);
	assertFalse(linePerson.equals(otherLinePerson));
    }  

    /**
       Test case for equals method
    */
    @Test public void testEquals5() {
	PersonInLine linePerson = new PersonInLine("Bob Miller", 8);
	String notPerson = "Hello World";
	assertFalse(linePerson.equals(notPerson));
    }  

    /**
       Test case for toString method
    */
    @Test public void testToString1() {
	PersonInLine linePerson = new PersonInLine("Bob Miller", 8);
	String expected = "Bob Miller, 8th in line";
	assertEquals(expected, linePerson.toString());
    }

    /**
       Test case for toString method
    */
    @Test public void testToString2() {
	PersonInLine linePerson = new PersonInLine("Bob Miller", 3);
	String expected = "Bob Miller, 3rd in line";
	assertEquals(expected, linePerson.toString());
    }


    /**
       Test case for toString method
    */
    @Test public void testToString3() {
	PersonInLine linePerson = new PersonInLine("Bob Miller", 1);
	String expected = "Bob Miller, 1st in line";
	assertEquals(expected, linePerson.toString());
    }

    /**
       Test case for toString method
    */
    @Test public void testToString4() {
	PersonInLine linePerson = new PersonInLine("Bob Miller", 2);
	String expected = "Bob Miller, 2nd in line";
	assertEquals(expected, linePerson.toString());
    }

    /**
       Test case for toString method
    */
    @Test public void testToString5() {
	PersonInLine linePerson = new PersonInLine("Bob Miller", 38);
	String expected = "Bob Miller, 38th in line";
	assertEquals(expected, linePerson.toString());
    }

    /**
       Test case for toString method
    */
    @Test public void testToString6() {
	PersonInLine linePerson = new PersonInLine("Bob Miller", 1013);
	String expected = "Bob Miller, 1013rd in line";
	assertEquals(expected, linePerson.toString());
    }

    /**
       Test case for toString method
    */
    @Test public void testToString7() {
	PersonInLine linePerson = new PersonInLine("Bob Miller", 101);
	String expected = "Bob Miller, 101st in line";
	assertEquals(expected, linePerson.toString());
    }

    /**
       Test case for toString method
    */
    @Test public void testToString8() {
	PersonInLine linePerson = new PersonInLine("Bob Miller", 322);
	String expected = "Bob Miller, 322nd in line";
	assertEquals(expected, linePerson.toString());
    }

}
