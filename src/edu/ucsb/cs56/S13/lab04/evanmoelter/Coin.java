package edu.ucsb.cs56.S13.lab04.evanmoelter;

/**
   Coin is a simple class that represents a US coin. It has a common name (e.g. "quarter" or "dime") and a value in cents (e.g. 25 or 10).
 */

public class Coin {
    
    //instance variables:
    int valueInCents;
    String name;

    /** Default constructor initializes coin values to 0 or empty */
    public Coin(){
	//valueInCents = -42;//@@@ STUB
	//name = "STUB";//@@@ STUB	
	valueInCents = 0;
		name = "";
    }
    /**
@param valueInCents value in cents of the coin (e.g. 25 or 10)
@param name common name for the coin (e.g. quarter or dime)
    */
    public Coin(int valueInCents, String name) {
	//this.valueInCents = -420; //@@@ STUB
	//this.name = "STUBB"; //@@@ STUB
	this.valueInCents = valueInCents;
	this.name = name;
    }

    /** @return value of the coin in cents (e.g. 5 or 10) */
    public int getValue() { return valueInCents; }

    /** @return common name (e.g. "nickel" or "dime") */
    public String getName() { return name; }

    /** set the value in cents of the coin
	@param valueInCents value in cents of the coin (e.g. 5 or 10) */
    public void setValue(int valueInCents) {
	this.valueInCents = valueInCents;
    }
    
    /** set the name of the coin
        @param name name of the coin (e.g. "nickel" or "dime") */
    public void setName(String name) {
        this.name = name;
    }

    /** @return string output of the coin (e.g. "Nickel, 5 cents") */
    public String toString() {
	return String.format("%s, %d cents", name, valueInCents);
    }

    /** @return true if the coin arg is equal in value and name */
    public boolean equals(Object o) {
	if (o == null)
	    return false;
	if (!(o instanceof Coin))
	    return false;
	Coin c = (Coin) o;
	return this.toString().equals(c.toString());
	//return false;
    }

}// class Coin
