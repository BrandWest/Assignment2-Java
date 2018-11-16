package application;
/**
 * @author Brandon West
 * File: Cat.java
 * This class is subclass of Animal, extends 
 * Animal
 *  Other Files:
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
public class Cat extends Animal
{
	/**
	 * Non-Default Constructor for Cat
	 * @param newName sets the name for the object
	 * @param newWeight sets the weight for the object
	 * @param newScore sets the score for the object
	 * @param newSpeed sets the speed for the object
	 */
	public Cat ( String newName, double newWeight, int newScore, double newSpeed )
	{
		super(newName, newWeight, newScore, newSpeed );
	}

	
	/**
	 * @return the name of the object
	 */
	@Override
	protected String getName() 
	{
		return this._name;
	}

	/**
	 * @param newName sets the name of name
	 */
	@Override
	protected void setName(String newName) 
	{
		this._name = newName;
		
	}
	
	/**
	 * @return _weight reutrns the weight of this object
	 */
	@Override
	protected double getWeight() 
	{
		return this._weight;
	}

	/**
	 * @param newWeight sets the weight of the object
	 */
	@Override
	protected void setWeight(double newWeight) 
	{
		this._weight = newWeight;
	}

	/**
	 * @return _score returns the score of the object
	 */
	@Override
	public double getScore() 
	{
		return this._score;
	}

	/**
	 * @param newScore sets the score of the object
	 */
	@Override
	protected void setScore( double newScore) 
	{
		this._score = newScore;	
	}

	/**
	 * @return the attack of the speed * 2
	 */
	@Override
	protected double attack() 
	{
		return this.getSpeed() * 2;
	}

	/**
	 * @param newSpeed sets the speed of the object
	 */
	@Override
	protected void setSpeed( double newSpeed ) 
	{
		this._speed = newSpeed;
	}
	
	/**
	 * @return _speed returns the speed of the object
	 */
	@Override
	protected double getSpeed() 
	{
		return this._speed;
	}
}
