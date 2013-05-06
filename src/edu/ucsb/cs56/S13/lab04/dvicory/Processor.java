package edu.ucsb.cs56.S13.lab04.dvicory;

/**
   Processor represents a CPU. Two key identifiers for a CPU are its family name and the core speed.

   @author Daniel Vicory
   @version CS56, S13, lab04
*/

public class Processor {
    /**
       Stores the common family name of the processor
     */
    private String family;

    /**
       Stores the core speed of the processor, in MHz
     */
    private int coreSpeed;

    /**
       No-arg constructor for Processor, creates a generic processor with family name "Generic x86" and a core speed of 16 MHz
     */
    public Processor() {
	// make it default to a generic x86 cpu with a 16 MHz clock
	this.family = "Generic x86";
	this.coreSpeed = 16;
    }

    /**
       Two-arg constructor for Processor, initializing it with the family name and core speed given

       @param family the common family name of the processor
       @param coreSpeed the core speed of the processor, in MHz
    */
    public Processor(String family, int coreSpeed) {
	this.family = family;
	this.coreSpeed = coreSpeed;
    }

    /**
       @return the common family name of the processor
    */
    public String getFamily() { return this.family; }

    /**
       Sets the common family name of the processor

       @param family the common family name to be set
    */
    public void setFamily(String family) { this.family = family; }

    /**
       @return the core speed of the processor, in MHz
    */
    public int getCoreSpeed() { return this.coreSpeed; }

    /**
       Sets the core speed of the processor

       @param coreSpeed the core speed to be set
    */
    public void setCoreSpeed(int coreSpeed) { this.coreSpeed = coreSpeed; }

    /**
       Convert processor to a string representation. Examples: "[Ivy Bridge, 3100 MHz]"

       @return String representation of processor
    */
    public String toString() {
	return "[" + this.family + ", " + this.coreSpeed + " MHz]";
    }

    /**
       Are the processors equal?

       @param o another object to compare
       @return true if this object is the same processor as o
    */
    public boolean equals(Object o) {
	if (o == null)
	    return false;

	if (!(o instanceof Processor))
	    return false;

	Processor p = (Processor)o;
	return this.getFamily().equals(p.getFamily()) & this.getCoreSpeed() == p.getCoreSpeed();
    }

    /**
       A sample main that uses the class
    */
    public static void main(String[] args) {
	Processor ivyBridge = new Processor("Ivy Bridge", 3100);
	Processor genericx86 = new Processor();
	System.out.println(ivyBridge);
    }
}
