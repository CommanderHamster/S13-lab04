package edu.ucsb.cs56.S13.lab04.pconrad;

/**

 RadioStation represents a RadioStation. A radio station in the US has
 "call letters" (a code for the station of 3 or 4 letters), and a
 frequency (a decimal number between 87.8 to 108.0 for FM stations,
 and a number between 520.0 and 1610.0 for AM stations.)  This class
 appeared on the Spring 2011 UCSB CS56 first midterm (Exam E01).


 @see <a href="http://www.cs.ucsb.edu/~pconrad/cs56/11S/exams/E01/actualExam/">http://www.cs.ucsb.edu/~pconrad/cs56/11S/exams/E01/actualExam/</a>
 @see <a href="http://www.cs.ucsb.edu/~pconrad/cs56/11S/exams/E01/code/RadioStation.java">http://www.cs.ucsb.edu/~pconrad/cs56/11S/exams/E01/code/RadioStation.java</a>

*/

public class RadioStation {

    private String callSign = "KCSB"; 
    private double freq = 91.9; 

    /** Default Constructor creates a Radio Station KCSB, 99.9 */

    public RadioStation() {} ; 

    /** 
	@param callSign call sign, (e.g. KCSB, KTYD, KDB, KTMS)
	@param freq frequency  (e.g. 91.9, 99.9, 93.7, 990.0.  kHz for AM, mHz for FM)
     */
    public RadioStation(String callSign, double freq) { 
	this.callSign = callSign;
	this.freq = freq;
    }

    /**
       @return call sign  (e.g. KCSB, KTYD, KDB, KTMS)       
    */
    public String getCallSign() { 
	return callSign; 
    }
    /**
       @return frequency (e.g. 91.9, 99.9, 93.7, 990.0)
     */
    public double getFrequency() { 
	return freq; 
    } 
    
    /**
isFM() that returns a true or false value. It should return true when frequency is less than or equal to 108.0—this indicates an FM station. If isFM() returns false, the station is assumed to be an AM station.
       @return true if this is an FM station (false implies AM)
     */
    public boolean isFM() {
	return this.freq <= 108.0;
    }

    /**
       Convert to a string representation.  Examples: "[KCSB, FM 91.9]", "[KTYD, AM 990]"
       @return String represntation of station.
     */
    public String toString() {
	java.text.DecimalFormat amFormat = new java.text.DecimalFormat("0");
	java.text.DecimalFormat fmFormat = new java.text.DecimalFormat("0.0");
	return "[" + this.callSign + ", " 
	    + (this.isFM() ? "FM " + fmFormat.format(this.freq) :  "AM " + amFormat.format(this.freq))
	    + "]"; 
    }

    /** 
	A sample main that uses the class.
     */
    public static void main(String [] args) { 
	RadioStation KJEE = new RadioStation("KJEE",92.9);
	RadioStation KCSB = new RadioStation();
	System.out.println(KJEE);
    }

    /**
       Are the stations equal?
       @param o another object to compare 
       @return true if this object is the same radio station as o
     */
    public boolean  equals(Object o) { 

	double tol = 0.01; 
	if (! (o instanceof RadioStation) )
	    return false;
	RadioStation other = (RadioStation) o;
	return (other.getCallSign().equals(this.getCallSign()) &
	Math.abs(other.getFrequency() - this.getFrequency()) < tol ); 
    }
}
