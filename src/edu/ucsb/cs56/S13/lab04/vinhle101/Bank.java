package edu.ucsb.cs56.S13.lab04.vinhle101;


public class Bank {
    
    private String bankingAccount = "Savings Account";
    private int AccountBalance = 10000;

    /**
       Default constructor that sets Account to "Savings Account" and Balance to "10000"
     */
    public Bank() {
    }
    /**
       @param enteredAccount bank account name, (e.g. Checking Account, Savings Account)
       @param enteredBalance Account balance, (e.g. 10000, 20000, 99999, 100000)
    */
    public Bank(String enteredAccount, int enteredBalance){
	this.bankingAccount = enteredAccount;
	this.AccountBalance = enteredBalance;
    }

    // Setters
    /**
       @param enteredAccount Account Name Input (e.g. Checking Account, Savings Account)
     */
    public void setBankAccount(String enteredAccount){
	this.bankingAccount = enteredAccount;
    }
    /**
       @param enteredBalance Account Balance Input, (e.g. 10000, 20000, 99999, 100000)
     */
    public void setAccountBalance(int enteredBalance)
    {
	this.AccountBalance = enteredBalance;
    }

    // Getters
    /**
       @return bank account name (e.g. Checking Account, Savings Account)
    */
    public String getBankAccount(){
	return (this.bankingAccount);
    }
    /**
       @return Account balance (e.g. 10000, 20000, 99999, 100000)
    */
    public int getAccountBalance(){
	return (this.AccountBalance);
    }

    /** toString method, returns string rep. "The Banking Account is: "[Checking Account, Savings Account]", The Balance is "[10000, 20000]"
	@return String representation of the Bank Account name and balance
     */
    public String toString(){
	return ("The Banking Account is: " + this.bankingAccount + ", The Balance is " + this.AccountBalance);
	 
    }
    
    // equals method
    /**
       Checks to see if two objects are equal or not
       @param o is another object that is being compared
       @return true if this object is the same banking account as object o
     */
    public boolean equals(Object o){
	if ( o == null)
	    return false;
	if (!(o instanceof Bank))
	    return false;
	Bank p = (Bank) o;
	
	if(this.getBankAccount().equals(p.getBankAccount()) & this.getAccountBalance() == p.getAccountBalance()){
	    return true;
	}
	return false;
	
    }


    // main to test methods
    public static void main (String[] args){
	Bank newAccount = new Bank("Checking Account", 20000);
	newAccount.toString();
	System.out.println(newAccount);
	
    }
    

}
