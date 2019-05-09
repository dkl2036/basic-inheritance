/**
 * ---------------------------------------------------------------------------
 * File name: TestOverride.java
 * Project name: HW2
 * ---------------------------------------------------------------------------
 * Creator's name and email: Danielle Lamb, dkl2036@email.vccs.edu
 * Course:  CSCI 1260
 * Creation Date: Sep 28, 2018
 * ---------------------------------------------------------------------------
 */

/**
 * Purpose: To test override of Person with Professor subclass when passing through parent class
 *
 * <hr>
 * Date created: Sep 28, 2018
 * <hr>
 * @author Danielle Lamb
 */
public class TestOverride
{

	/**
	 * Method involves creating new professor information for variables and printing to screen     
	 *
	 * <hr>
	 * Date created: Sep 28, 2018
	 *
	 * <hr>
	 * @param args
	 */
	public static void main (String [ ] args) {
		Professor nasser = new Professor("Nasser", "Maksoud");
		nasser.print(); 

	}

}
