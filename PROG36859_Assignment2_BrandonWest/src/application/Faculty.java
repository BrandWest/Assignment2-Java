package application;
/**
 * @author Brandon West
 * File: Faculty.java
 * This class is a subclass and extends Employee
 *	Other Files:
 * 	- Bird.java
 * 	- Wolf.java
 * 	- Omnivore.java
 * 	- Cat.java
 * 	- Deaths.java
 * 	- Employee.java
 * 	- Faculty.java
 *  - Fish.java
 *  - Game.java
 *  - GameTeamMember.java
 *  - Herbivore.java
 *  - Robot.java
 *  - Scorable.java
 *  - Staff.java
 *  - Student.java
 *  - Animal.java
 *  Main:
 *  - Game.java
 */
public class Faculty extends Employee
{
	/**
	 * Non-Default Constructor for Faculty
	 * @param newName sets the name for the object
	 * @param newWeight sets the weight for the object
	 * @param newScore sets the score for the object
	 * @param newSpeed sets the speed for the object
	 */
	public Faculty(String newName, int newAge, String newGender, int newHealth ) 
	{
		super(newName, newAge, newGender, newHealth);
	}

	/**
	 * Overrides the play method, states that the Student class is up.
	 */
	@Override
	protected String play() 
	{
		return  "The " + this.getClass().getSimpleName() + " Class." + "\n" + this.getName() + " is up!";
//		System.out.println( "The " + this.getClass().getSimpleName() + " Class.");
//		System.out.println( this.getName() + " is up!" );	
	}
}
