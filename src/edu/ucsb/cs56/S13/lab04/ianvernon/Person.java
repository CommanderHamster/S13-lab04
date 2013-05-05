package edu.ucsb.cs56.S13.lab04.ianvernon;

/**

Person represents a Person. A person has a name, as well as an age. This class was made for lab04 for Spring 2013 CS56 at UCSB.

*/

public class Person
{
    private String name;
    private int ageInYears;
  
    /** default constructor creates a person with name "John" and age of 25 years */
  
    public Person()
    {
	name = "John";
	ageInYears = 25;
    }

    /**
       @param name name (e.g., Bob, John, Jason)
       @param ageInYears age of person in years (e.g. 12, 13, 14
    */
    public Person(String name, int ageInYears)
    {
	this.name = name;
	this.ageInYears = ageInYears;
    }

    /** @return name (e.g., Bob, John, Jason) */

    public String getName()
    {
	return this.name;
    }

    /** @return age in years (e.g., 25, 30, 40) */

    public int getAgeInYears()
    {
	return this.ageInYears;
    }
    
    /** @param name changes this.name to name */

    public void setName(String name)
    {
	this.name = name;
    }
    
    /** @param ageInYears changes this.ageInYears to ageInYears */

    public void setAgeInYears(int ageInYears)
    {
	this.ageInYears = ageInYears;
    }

    /** Creates a string representation of a person. Examples: "Name: Ian, Age: 20", "Name John:, Age: 21"
	@return String representation of a person
    */

    public String toString()
    {
	return "Name: " + this.name + ", Age: " + this.ageInYears ;
    }
    /** are two people equal? that is, do they have the same age in years and the same name?
	@param o another object to compare
	@return true if person is of the same age in years and the same name as this 
    */
    public boolean equals(Object o)
    {
	if(o == null)
	    return false;
	if (! (o instanceof Person) )
	    return false;
	Person p  = (Person) o;     
	return (this.ageInYears == p.ageInYears & (this.name).equals(p.name));
    }
    public static void main(String[] args)
    {
	Person bob = new Person("Bob", 33);
	System.out.println(bob.toString());
    }
}
