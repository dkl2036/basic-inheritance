/**
 * ---------------------------------------------------------------------------
 * File name: Person.java

 * Project name: HW2
 * ---------------------------------------------------------------------------
 * Creator's name and email: Danielle Lamb, dkl2036@email.vccs.edu
 * Course:  CSCI 1260
 * Creation Date: Sep 28, 2018
 * ---------------------------------------------------------------------------
 */

/**
 * Purpose: Super class that obtains first and last name and prints to screen
 *
 * <hr>
 * Date created: Sep 28, 2018
 * <hr>
 * @author Danielle Lamb
 */
public class Person
{
		private String firstName; // private variable for first name
		private String lastName;  // private variable for last name


		/**
		 * Constructor        
		 *
		 * <hr>
		 * Date created: Sep 28, 2018 
		 *
		 * 
		 * @param firstName
		 * @param lastName
		 */
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName; 
		
	}
	/**
	 *Method involves retrieving and printing first and last name to screen
	 * <hr>
	 * Date created: Sep 28, 2018
	 *
	 * <hr>
	 * @param gradYear
	 * @param gpa
	 */
	public void print ( ){
		System.out.println ("\t" + firstName + " " + lastName); // similar to tab key, \t is used to add 6 more spaces before variable is stated
	}

}
