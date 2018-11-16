package application;
/**
 * @author Brandon West
 * File: Robot.java
 * subclass of GameTeamMember
 * This class extends the Superclass GameTeamMember
 * 	Other Files:
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
public class Robot extends GameTeamMember
{
	public Robot ( String newName, int newAge, String newRace, int newHealth )
	{
		super( newName, newAge, newRace, newHealth );
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

	/**
	 * returns the name of this object
	 */
	@Override
	public String getName() 
	{
		return this._name;
	}

	/**
	 * sets the name of this object
	 */
	@Override
	public void setName(String newName) 
	{
		_name = newName;
	}
	
	/**
	 * returns age of this object
	 */
	@Override
	public int getAge() 
	{
		return this._age;
	}
	
	/**
	 * sets age of this object
	 */
	@Override
	public void setAge(int newAge) 
	{
		this._age = newAge;
	}

	/**
	 * returns the race of this object
	 */
	@Override
	public String getRace() 
	{
		return this._race;
	}
	
	/**
	 * sets the race of this object
	 */
	@Override
	public void setRace(String newRace) 
	{
		this._race = newRace;
	}

	/**
	 * gets the score of this object
	 */
	@Override
	public double getScore() 
	{
		return this._totalScore;
	}

	/**
	 * returns the health of this object
	 */
	@Override
	protected double getHealth() 
	{
		return this._health;
	}

	/**
	 * sets the health of this object
	 */
	@Override
	protected void setHealth( double newHealth ) 
	{
		this._health = this._health - newHealth;
	}
}
