package application;
/**
 * @author Brandon West
 * File: Animal.java
 * This class is an abstract SuperClass that 
 * implements the scorable interface
 * Other Files:
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
public abstract class Animal implements Scorable
{
	/**
	 * Field variables
	 * @param _name stores the name of the Animal Object
	 * @param _weight stores the weight of the Animal Object
	 * @param _score stores the score of the Animal Object
	 * @param _speed stores the speed of the Animal Object
	 */
	protected String _name;
	protected double _weight;
	protected double _score;
	protected double _speed;
	
	/**
	 * Abstract methods
	 */
	protected abstract String getName();
	protected abstract void setName ( String newName );
	protected abstract double getWeight();
	protected abstract void setWeight( double newWeight );
	public abstract double getScore();
	protected abstract void setScore( double newScore );
	protected abstract void setSpeed( double newSpeed );
	protected abstract double getSpeed();
	// uses the animals speed to base the attack
	protected abstract double attack();

	/**
	 * Animal Constructor
	 * @param newName sets the name of the Object
	 * @param newWeight sets the weight of the object
	 * @param newScore sets the score of the object
	 * @param newSpeed sets the speed of the object
	 */
	protected Animal ( String newName, double newWeight, int newScore, double newSpeed )
	{
		this._name = newName;
		this._weight = newWeight;
		this._score = newScore;
		this._speed = newSpeed;
	}
}
