package application;
/**
 * @author Brandon West
 * File: Deaths.java
 * 
 * 	subclass
 * 	This class holds the stats and scores of
 *  the dead player when they run out of health
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
public class Deaths extends GameTeamMember
{
	/**
	 * 
	 * @param newName holds the name of the dead player
	 * @param newAge holds the age of the dead player
	 * @param newRace holds the race of the dead player
	 * @param newScore holds the score of the dead player
	 */
	public Deaths( String newName, int newAge, String newRace, double newScore )
	{
		this._name = newName;
		this._age = newAge;
		this._race = newRace;
		this._totalScore = newScore;
	}
	/**
	 * returns the total score of the object
	 */
	@Override
	public double getScore() 
	{
		return this._totalScore;
	}
	/**
	 * unused due to not playing but extended from abstract class
	 */
	@Override
	protected String play() 
	{		
		return "";
	}	
	/**
	 * returns the name of this object
	 */
	@Override
	protected String getName() 
	{
		return this._name;
	}
	/**
	 * Sets the name of this object
	 */
	@Override
	protected void setName( String newName ) 
	{		
		this._name = newName;
	}
	
	/**
	 * returns the age of this object
	 */
	@Override
	protected int getAge() 
	{
		return this._age;
	}
	
	/**
	 * sets the age of this object
	 */
	@Override
	protected void setAge(int newAge) 
	{
		this._age = newAge;
	}
	
	/**
	 * returns the race of this object
	 */
	@Override
	protected String getRace()
	{
		return this._race;
	}
	
	/**
	 * sets the race of this object
	 */
	@Override
	protected void setRace (String newRace) {
		this._race = newRace;
	}
	// no health of a dead object, is extending abstract class
	@Override
	protected double getHealth() {
		return 0;
	}
	// no health of a dead object, is extending abstract class
	@Override
	protected void setHealth(double newHealth) {
		// TODO Auto-generated method stub
		
	}
}
