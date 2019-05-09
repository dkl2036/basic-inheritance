/**
 * ---------------------------------------------------------------------------
 * File name: TestInheritance.java
 * Project name: HW2
 * ---------------------------------------------------------------------------
 * Creator's name and email: Danielle Lamb, dkl2036@email.vccs.edu
 * Course:  CSCI 1260
 * Creation Date: Sep 28, 2018
 * ---------------------------------------------------------------------------
 */

/**
 * Purpose: To inherit state and behavior from subclass Student which extends from super class Person
 *
 * <hr>
 * Date created: Sep 28, 2018
 * <hr>
 * @author Danielle Lamb
 */
public class TestInheritance
{

	/**
	 * Method which creates new student for Student subclass and prints to screen; inherits state and behavior from both Student and Person
	 *
	 * <hr>
	 * Date created: Sep 28, 2018
	 *
	 * <hr>
	 * @param args
	 */
	public static void main (String [ ] args) {
		Student danielle = new Student("Danielle", "Lamb", 2020, 4.0);
		danielle.print ( ); 

	}

}
