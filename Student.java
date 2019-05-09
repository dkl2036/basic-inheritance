/**
 * ---------------------------------------------------------------------------
 * File name: Student.java
 * Project name: HW2
 * ---------------------------------------------------------------------------
 * Creator's name and email: Danielle Lamb, dkl2036@email.vccs.edu
 * Course:  CSCI 1260
 * Creation Date: Sep 28, 2018
 * ---------------------------------------------------------------------------
 */

/**
 * Purpose: To retrieve new parameters from user and override Person to display new information apart from first and last name
 * <hr>
 * Date created: Sep 28, 2018
 * <hr>
 * @author Danielle Lamb
 */
public class Student extends Person {
	private int gradYear; // private variable for graduation year
	private double gpa; // private variable for grade point average
	
	/**
	 * Constructor        
	 *
	 * <hr>
	 * Date created: Sep 28, 2018 
	 *
	 * 
	 * @param firstName
	 * @param lastName
	 * @param gradYear
	 * @param gpa
	 */
	public Student(String firstName, String lastName, int gradYear, double gpa) {
			super(firstName, lastName);
			this.gradYear = gradYear;
			this.gpa = gpa; 
	}

	/**
	 * Method involves printing student details (first and last name, graduation year, and GPA) by overwriting super class Person
	 * <hr>
	 * Date created: Sep 28, 2018
	 *
	 * <hr>
	 * @param gradYear
	 * @param gpa
	 */
	public void print() {
		System.out.println("Student Details: ");
		super.print();
		System.out.println("\t" + gradYear); 
		System.out.println("\t" + gpa); 
	}

}
