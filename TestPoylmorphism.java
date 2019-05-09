/**
 * ---------------------------------------------------------------------------
 * File name: TestPoylmorphism.java
 * Project name: HW2
 * ---------------------------------------------------------------------------
 * Creator's name and email: Danielle Lamb, dkl2036@email.vccs.edu
 * Course:  CSCI 1260
 * Creation Date: Sep 28, 2018
 * ---------------------------------------------------------------------------
 */

/**
 * Enter type purpose here
 *
 * <hr>
 * Date created: Sep 28, 2018
 * <hr>
 * @author Danielle Lamb
 */
public class TestPoylmorphism
{

	/**
	 * Method involving taking in three new persons, passing them through constructors in subclasses Student and Professor, and passing them through for loop     
	 *
	 * <hr>
	 * Date created: Sep 28, 2018
	 *
	 * <hr>
	 * @param args
	 */
	public static void main (String [ ] args) {
		Person persons[] = new Person[3];
		persons[0] = new Student ("Danielle", "Lamb", 2020, 4.0);
		persons[1] = new Student ("Sponge", "Bob", 2018, 3.4);
		persons[2] = new Professor ("Nasser", "Maksoud");
		
		// for loop which passes each new persons through to super class Person and prints to screen
		for (Person person : persons) {
			person.print ( );
		}

	}

}
