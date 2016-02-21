package cse360assign3;

/**
 * Class that creates a calculator that keeps a running total of
 * calculations done.
 * 
 * @author Caleb D
 * @version 1 Feb 20, 2016
 */

public class Calculator {

	private int total;
	
	/**
	 * constructor that makes a new calculator object and initializes 
	 * the total to 0
	 */
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * getTotal - accesser method to get the total for the calculator
	 * object
	 * 
	 * @return int that is the running total for the calculator
	 */
	
	public int getTotal () {
		return 0;
	}
	
	/**
	 * add - adds the given int to the total for the calculator
	 * 
	 * @param value int that is to be added to the calculator's total
	 */
	
	public void add (int value) {
		
	}
	
	/**
	 * subtract - subtracts the given int from the total for the 
	 * calculator
	 * 
	 * @param value int that is subtracted from the calculator's
	 * total
	 */
	
	public void subtract (int value) {
		
	}
	
	/**
	 * multiply - multiplies the calculator's total by the given
	 * int
	 * 
	 * @param value int value that the calculator's total is
	 * multiplied by
	 */
	
	public void multiply (int value) {
		
	}
	
	/**
	 * divide - divides the calculator's total by the given
	 * int, will set total to 0 if parameter given is 0
	 * 
	 * @param value int value that the calculator's total is
	 * divided by 
	 */
	
	public void divide (int value) {
		
	}
	
	/**
	 * getHistory - method to return a string that contains
	 * all the actions done on the calculator object
	 * 
	 * @return string that is the entire history of operations 
	 * done on the calculator object
	 */
	
	public String getHistory () {
		return "";
	}
}