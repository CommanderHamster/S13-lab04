package edu.ucsb.cs56.S13.lab04.austinphillips;

/** Roommate class represents my annoying roommate, Martin

@author Austin Phillips
@version 04/24/2013
*/


public class Roommate {

    private String name="Martin B";;
    private int levelOfAnnoyance=10000;
   

    /**
       no arg constructor for roommate class
    */
    public Roommate(){};


 
    /**
       Constructor with arguments
       @param name is the roommate's name
       @param levelofAnnoyance is his current degree of being annoying
    */
    
    public Roommate(String name, int levelOfAnnoyance) {
	this.name=name;
	this.levelOfAnnoyance=levelOfAnnoyance;
    }
    
    
    /**
       Get method for name
    */
    public String getName(){
	return this.name;
    }
    /**
       Get method for levelOfAnnoyance
    */    
    public int getLevelOfAnnoyance(){
	return this.levelOfAnnoyance;
	}
    /**
       Set method for name
    */
    public void setName(String name){
	
	this.name=name;
	}
    /**
       Set method for levelOfAnnoyance
    */
    public void setLevelOfAnnoyance(int levelOfAnnoyance){
	
	this.levelOfAnnoyance=levelOfAnnoyance;
	}
    
    
    /**
	   toString method combining the two attributes into one string
    */
    public String toString(){
	String sentence ="";
	    int loa=this.getLevelOfAnnoyance();
	    String name=this.getName();
	    sentence+="My roommate is "+name+" and my current level of annoyance with him is "+loa;
	    return sentence;	
    }
    /**
       simple main method
    */
    public static void main(String [] args) {	
	Roommate Martin = new Roommate("Martin B", 10000);
	Roommate Martin2 = new Roommate();
    }
    /**
	   equals method that tests for equality in object identity
	*/
    public boolean equals(Object o){
	if(o==null)
		return false;
	    else if(!(o instanceof Roommate))
		return false;
	    else{
		Roommate Martin=(Roommate) o;
		return(this.getName().equals(Martin.getName())) & (this.getLevelOfAnnoyance()==Martin.getLevelOfAnnoyance());
		}
	}
    
    /**
	   main method that smacks the roommate class to make it temporarily less annoying
	*/
    public void smack(){
	    System.out.println("ow.");
	    levelOfAnnoyance=0;
	}
}

