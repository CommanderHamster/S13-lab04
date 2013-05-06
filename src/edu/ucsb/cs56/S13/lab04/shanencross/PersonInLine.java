package edu.ucsb.cs56.S13.lab04.shanencross;

/**

@author Shanen Cross
@version CS56, S13, lab04

   Represents a person who is standing in a line (such as a line at the grocery story, for example). 
   Holds that preson's name, and their place in line.
   So if they are first in line, their number is 1. If they are 5th in line, their number is 5.
 */

public class PersonInLine  {
    private String name;
    private int numberInLine;


    /**
       No arg constructor. Initializes name to an empty string, and numberInLine to 1,
       so that the person is first in line by default (0th in line is meaningless).
     */
    public PersonInLine() {
	this.name = "";
	this.numberInLine = 1;
    }


    /** Two arg constructor with String and int for initializing name and place in line.
	@param name Name of the person
	@param numberInLine Number representing the person's place in line (e.g. 1 for 1st place, 7 for 7th place)
       
     */
    public PersonInLine(String name, int numberInLine) {
	this.name = name;
	this.numberInLine = numberInLine;
    }


    /** @return Name of the person
     */
    public String getName() { 
	return this.name; 
    }

    /** @return Number representing the person's place in line (e.g. 1 for 1st place, 7 for 7th place)
     */
    public int getNumberInLine() { 
	return this.numberInLine;
    }

    /** @param name Name of the person
     */
    public void setName(String name) { 
	this.name = name;
    }

    /** @param numberInLine representing the person's place in line (e.g. 1 for 1st place, 7 for 7th place)
     */
    public void setNumberInLine(int numberInLine) {
	this.numberInLine = numberInLine;
    }

    /** Convert to a string representation that includes name and place in line.
	Example: John Smith, 7th place

	@return String representation of person containing both name and place in line
     */
    public String toString() {

	int onesDigit = numberInLine % 10; // Final, ones' place digit of number in line, to choose between "st", "nd", "rd", and "th" suffixes
	String suffix = "th"; // Will be "st", "nd", "rd", or "th" (as in 1st, 2nd, 3rd, 8th, etc.)
	                     // "th" by default"
	if (onesDigit == 1) { // different if 1, 2, or 3
	    suffix = "st";
	}
	if (onesDigit == 2) {
	    suffix = "nd";
	}
	if (onesDigit == 3) {
	    suffix = "rd";
	}
	

	return this.name+", "+this.numberInLine+suffix+" in line";
    }

    /** Tests if another object is equal to this person
	@param Object o Another object
	@return true or false value indicating equality of object to the person in line
     */
    public boolean equals(Object o) {
	// Necessary Boiler Plate code
	// Makes sure o is not null and is of the same datatype
	if (o == null)
            return false;
        if (!(o instanceof PersonInLine))
            return false;

	PersonInLine other = (PersonInLine) o;

	// true if both name and line number match
	if (this.name == other.getName() && this.numberInLine == other.getNumberInLine()) {
	    return true;
	}
	
	// otherwise, false
	return false;
    }

    /** A sample main() method which tests the PersonInLine class.
     */

    public static void main(String args[]) {

	System.out.println("First we try initializing a new PersonInLine with the String \"John Sheridan\" and the int 1.");
	PersonInLine person1 = new PersonInLine("John Sheridan", 1);
	System.out.println("Then we try the toString() method on it and print it out.");
	System.out.println(person1.toString());

	System.out.println("Let's use the set methods to change Sheridan to \"Jean-Luc Picard\" and his place in line to 2.");
	person1.setName("Jean-Luc Picard");
	person1.setNumberInLine(2);
	System.out.println("And use the toString() method again:");
	System.out.println(person1.toString());

	System.out.println("Now let's put Benjamin Sisko in place number three as a new object/reference...");
	PersonInLine person2 = new PersonInLine("Benjamin Sisko", 3);
	System.out.println("...but print it out using the get methods instead of toString().");
	System.out.println(person2.getName() + " is in place #"+person2.getNumberInLine());
	
	System.out.println("Let's see if Sisko and Picard are the same person.");
	if (person1.equals(person2)) {
	    System.out.println(person1.getName() + " is "+ person2.getName()); 	  
	}
	else {
	    System.out.println(person1.getName() + " is not "+ person2.getName()); 
	}
	System.out.println("Hopefully, said they were not..");

	System.out.println("But is Picard himself?");
	System.out.println("Let's point another reference to Picard, and compare the references.");
	PersonInLine person3 = person1;
	if (person3.equals(person1)) {
	    System.out.println(person3.getName() + " is "+ person1.getName()); 	  
	}
	else {
	    System.out.println(person3.getName() + " is not "+ person1.getName()); 
	}

    }
}
