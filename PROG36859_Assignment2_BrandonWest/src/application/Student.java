package application;
/**
 * @author Brandon West
 * File: Student.java
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
public class Student extends GameTeamMember 
{
	
	/**
	 * Student constructor
	 * 
	 * @param newName holds the name of the Student
	 * @param newAge holds the age of the Student
	 * @param newGender	holds the gender of the Student
	 * 
	 */
	public Student ( String newName, int newAge, String newRace, int newHealth )
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
	 * this method returns this objects name
	 */
	@Override
	public String getName() 
	{
		return this._name;
	}

	/**
	 * this method sets the name of this object
	 */
	@Override
	public void setName(String newName) 
	{
		this._name = newName;
	}

	/**
	 * this method returns the age of this object
	 */
	@Override
	public int getAge() 
	{
		return this._age;
	}

	/**
	 * this method sets the age of this object
	 */
	@Override
	public void setAge(int newAge) 
	{
		this._age = newAge;
	}
	
	/**
	 * this method returns the race of the object
	 */
	@Override
	public String getRace() 
	{
		return this._race;
	}
	
	/**
	 * this method sets the race of the object
	 */
	@Override
	public void setRace(String newRace) 
	{
		this._race = newRace;
	}

	/**
	 * this method retuns the score of this object
	 */
	@Override
	public double getScore() 
	{
		return this._totalScore;
	}


	/**
	 * this method gets the health of the object
	 */
	@Override
	protected double getHealth() 
	{
		return this._health;
	}

	/**
	 *  this method sets the health of the object
	 */
	@Override
	protected void setHealth( double newHealth ) 
	{
		this._health = this._health - newHealth;
	}
}
