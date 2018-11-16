package application;
/**
 * @author Brandon West
 * File: GameTeamMember.java
 * SuperClass
 * This class is an abstract class and is
 * used as the building block for all the 
 * other classes
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
public abstract class GameTeamMember implements Scorable
{
	/**
	 * variables used for the object
	 */
	protected String _name;
	protected int _age;
	protected String _race;
	protected double _totalScore;
	protected double _health;
	
	/**
	 * Abstract methods 
	 */
	protected abstract String play();
	protected abstract String getName();
	protected abstract void setName(String _name);
	protected abstract int getAge();
	protected abstract void setAge(int _age);
	protected abstract String getRace();
	protected abstract void setRace(String _gender);
	protected abstract double getHealth();
	protected abstract void setHealth( double newHealth);

	/**
	 * default constructor
	 */
	public GameTeamMember() {}
	/**
	 * Non-Default constructor
	 * @param newName sets the name variable for the object
	 * @param newAge sets the age variable for the object
	 * @param newRace sets the race variable for the object
	 * @param newHealth sets the health of the object
	 */
	public GameTeamMember( String newName, int newAge, String newRace, int newHealth )
	{
		this._name = newName;
		this._age = newAge;
		this._race = newRace;
		this._health = newHealth;
	}
	
	/**
	 * sets the score of the object through the interface
	 * @param damage is used to calculate the score of the object
	 */
	public void setScore( double damage )
	{
		this._totalScore = damage + this.getScore();
	}
	
	/**
	 * returns the score of the object
	 */
	public double getScore()
	{
		return this._totalScore;
	}
}