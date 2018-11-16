package application;
/**
 * @author Brandon West
 * File: Staff.java
 * Subclass
 * This class extends GameTeamMember
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
public class Staff extends Employee
{
	/**
	 * Staff non-default constructor
	 * @param newName sets the name of the object
	 * @param newAge sets the age of the object
	 * @param newRace sets the race of the object
	 * @param newHealth sets the health of the object
	 */
	public Staff(String newName, int newAge, String newRace, int newHealth) {
		super(newName, newAge, newRace, newHealth);
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
