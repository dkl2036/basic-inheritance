/**
 * ---------------------------------------------------------------------------
 * File name: Professor.java
 * Project name: HW2
 * ---------------------------------------------------------------------------
 * Creator's name and email: Danielle Lamb, dkl2036@email.vccs.edu
 * Course:  CSCI 1260
 * Creation Date: Sep 28, 2018
 * ---------------------------------------------------------------------------
 */

/**
 * Subclass Professor extending from parent class Person and printing 
 *
 * <hr>
 * Date created: Sep 28, 2018
 * <hr>
 * @author Danielle Lamb
 */
// 
public class Professor extends Person
{
		
	
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
	public Professor (String firstName, String lastName)
	{
		super (firstName, lastName);
	}

	/**
	 * Method involves printing professor details (first and last name) by overwriting super class Person    
	 *
	 * <hr>
	 * Date created: Sep 28, 2018
	 *
	 * <hr>
	 * @param args
	 */
	public void print() {
		System.out.println ("Professor Details: ");
		super.print();

	}

}
