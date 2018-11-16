/**

 * @author Brandon West
 * Name: Brandon West
 * Assignment: Animal Game
 * Program: Honours Bachelor of Applied Information Sciences (Information Systems Security)
 * 
 * This program generates players and animals, using certain animals as defense and offense
 * calculates the score, damage taken, and deaths of the players until there is 1 left standing.
 */
package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Game 
{
	@SuppressWarnings("unused")
	public static void main ( String[] args )
	{
		Scanner input = new Scanner( System.in );
		String location = null;
		boolean success = false;
		String choice;		
		StringBuffer sBuffer = new StringBuffer();

		// while success is not true make the file successfully		
		while ( success != true )
		{
			System.out.println ( "Would you like to give you're own file location? [Y/N]" );
			choice = input.next();
			
			if ( choice.charAt(0) == 'y' || choice.charAt(0) == 'Y') 
			{
				location = location ( choice, input );
				System.out.println ( location );
				
				if ( location.charAt(0) == 'N' )
				{
					System.out.println ( "File location does not exist, please try again.");
					success = false;
				}				
				else if ( Files.exists( Paths.get( location ) ) )
				{
					location = location + "Actions.txt";
					success = true;					
				}
			}
			else if ( choice.charAt(0) == 'n' || choice.charAt(0) == 'N' )
			{
				location = "C:\\Windows\\Temp\\Actions.txt";
				File file = new File ( "C:\\Windows\\Temp\\Actions.txt" );
				
				// create the file to make it work....
				try 
				{
					file.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
				success = true;
			}
			else 
				System.out.println ( "Uninteded input, try again. ");
			
		}
		
		// file writer, buffered and print for the writing to documents
		try ( FileWriter fileWriter = new FileWriter ( location.toString(), true ); 
			  BufferedWriter bufferedWriter = new BufferedWriter( fileWriter ); 
			  PrintWriter out = new PrintWriter( bufferedWriter ) )
		{
			// random object
			SecureRandom random = new SecureRandom();
			
			// add a queue to a linked list
			Queue <GameTeamMember> teamA = new LinkedList<>();
			Queue <GameTeamMember> teamB = new LinkedList<>();
			Queue <GameTeamMember> mixedTeams = new LinkedList<>();
			Queue <GameTeamMember> deaths = new LinkedList<>();
					
			// Stack for the animal class
			Stack <Animal> animals = new Stack<>();
			
			// different animal types
			Wolf arctic, tundra, rocky;
			Cat cheeta, jaguar, leopard;
			Bird eagle, hawk, owl;
			Fish shark, piranha, bullFrog;
			Herbivore deer, moose, rabbit, beaver;
			Omnivore fox, pig, chicken, bear;
			
			// player team members
			Student player1, player2, player3;
			Employee player4, player5, player6;
			Robot player7, player8;
			Staff player9;
			Faculty player10;
			
			// variables
			int counter = 0, randomNumber = 0, selectionNumber = 0;
			double damage = 0.0, teamAtotalScore = 0, teamBtotalScore = 0;
			
			//Add players to queue TeamA and TeamB
			teamA.offer( player1 = new Student( "Maiev Shadowsong", 70, "Night Elf", 200 ) );
			teamA.offer( player3 = new Student ( "Gelbin Mekkatorque", 33, "Gnome", 200 ) );
			teamA.offer( player4 = new Employee ( "Varian Wrynn", 25 , "Human", 200 ) );
			teamA.offer( player6 = new Employee ( "Falstad Wildhammer", 68 , "Wildhammer Dwarf", 200 ) );
			teamA.offer( player9 = new Staff ( "Medivh", 80, "Human", 200 ) );
			
			teamB.offer( player2 = new Student ( "Baine Bloodhoof", 29, "Tauren", 200 ) );
			teamB.offer( player5 = new Employee ( "Thrall", 33 , "Orc", 200 ) );
			teamB.offer( player7 = new Robot ( "Sylvannas Windrunner", 120, "Undead", 200 ) );
			teamB.offer( player8 = new Robot ( "Gul'dan", 45, "Orc", 200 ) );
			teamB.offer( player10 = new Faculty ( "Garona Halforcen", 30, "Orc", 200 ) );
			
		
			// create a stack of animals
			animals.push( arctic = new Wolf ( "Arctic Wolf" , 15 , 5, 10) );
			animals.push( tundra = new Wolf ( "Tundra Wolf", 15 , 6, 9 ) );
			animals.push( rocky = new Wolf( "Rocky Mountain Wolf" , 15, 5, 9 ) );
			animals.push( cheeta = new Cat ( "Cheeta", 15, 10, 25 ) );
			animals.push( jaguar = new Cat ( "Jaguar", 25 , 7, 10 ) );
			animals.push( leopard = new Cat ( "Leopard", 20, 9, 12 ) );
			animals.push( eagle = new Bird ( "White Tailed Egale", 10, 3, 11 ) );
			animals.push( hawk = new Bird ( "Japanese Sparrow Hawk", 5, 4, 11 ) );
			animals.push( owl = new Bird ( "Snowy Owl", 5 , 12, 11 ) );
			animals.push( shark = new Fish ( "Great White Shark", 100, 75, 5 ) );
			animals.push( piranha = new Fish ( "African Piranha", 2, 5, 10 ) );
			animals.push( bullFrog = new Fish( "Bull Frog", 1, 1, 2 ) );
			animals.push( deer = new Herbivore ( "White-Tailed Deer", 75, 5, 11 ) );
			animals.push( moose = new Herbivore ( "Bull Moose", 175, 5, 10 ) );
			animals.push( rabbit = new Herbivore ( "Peter Cotton Tail", 2.5, 2, 15) );
			animals.push( beaver = new Herbivore ( "Canadian Beaver", 15, 4, 5 ) );
			animals.push( fox = new Omnivore( "Red Tailed Fox", 15, 10, 10 ) );
			animals.push( pig = new Omnivore ( "Pig", 95, 2, 2 ) );
			animals.push( chicken = new Omnivore( "Chicken", 10, 2, 3 ) );
			animals.push( bear = new Omnivore ( "Grizzly Bear", 250, 55, 15 ) );
			
			// add all team memebers to mixedTeams
			mixedTeams.addAll( teamA );
			mixedTeams.addAll ( teamB );
			
			System.out.println( "Game Start!" );
			
			// while loop to shuffle animals
			out.println("The animals will now be randomly shuffled a number of times between 1 and 10." );
			randomNumber = random.nextInt( 10 ) + 1;
			while ( counter != randomNumber )
			{
				Collections.shuffle( animals );
				counter++;
			}
			
			out.println ( "The players order is: " );
			for (int index = 0; index < mixedTeams.size(); index++ ) 
			{
				out.println( (index + 1 ) + ": " + mixedTeams.peek().getName() );
				mixedTeams.offer( mixedTeams.remove() );
				
			}
			
			//while loop to control how many animals are populated decided through mod
			randomNumber = random.nextInt( 20 ) + 1;
			// this try/catch while loop controls the number of animals populated depending on the list, randomized before removing
			out.println( "\nThe animals are being populated..... " );
			try 
			{
				while ( counter != randomNumber )
				{
					if ( randomNumber % 4 == 0 )
					{
						animals.pop();
						if ( animals.size() == 15 )
							break;
						else
							counter++;
					}
					else if ( randomNumber % 3 == 0 )
					{
						animals.pop();
						if ( animals.size() == 10 )
							break;					
						else
							counter++;
					}
					else if ( randomNumber % 5 == 0 )
					{
						break;
					}
					else 
					{
						animals.pop();
						if (animals.size() == 5 )
							break;
						else
							counter++;	
					}
				}
			}catch ( IndexOutOfBoundsException error ) {}
			
			counter =0;
			// prints out the animals that are going to be participating.
			out.println( "\nThe going order of the animals: " );
			for ( Animal obj : animals)
			{
				counter++;
				out.println( counter + ": " + obj.getName() );
			}
			
			// control loop, once only one player is left, game is over.
			while ( mixedTeams.size() != 1 )
			{			
				out.println("");
				// time slow down/speed up
	//			try {
	//				TimeUnit.SECONDS.sleep(1);
	//			} catch (InterruptedException e) {
	//				// TODO Auto-generated catch block
	//				e.printStackTrace();
	//			}			
	
				out.print ( mixedTeams.peek( ).play() );
				out.println( mixedTeams.peek().getName() + "'s animal companion is: " + animals.peek().getName() );
	
				/**
				 * Maybe add the animals weight to deal damage.
				 */
				// control the animal who is protecting and the animal who is attacking
				randomNumber = random.nextInt( animals.size() );
				if ( animals.peek().getWeight() < animals.get(randomNumber).getWeight() )
				{
					damage = animals.peek().attack() - animals.get( randomNumber ).attack();
					damage = damage + animals.peek().getWeight() - animals.get(randomNumber).getWeight();
				}
				else
				{
					damage = animals.peek().attack() - animals.get( randomNumber ).attack();
					damage = damage - animals.peek().getWeight() + animals.get(randomNumber).getWeight();

				}

	
				// if the damage from the random number is greater than 0, we do the damage, if not, we skip.
				if ( damage > 0 )
				{
					// if the health of the team member is below 0, they are removed and added to the death list.
					if ( mixedTeams.peek().equals( player1 ) || mixedTeams.peek().equals( player2 ) || 
						 mixedTeams.peek().equals( player3 ) || mixedTeams.peek().equals( player4 ) || 
						 mixedTeams.peek().equals( player5 ) )
					{
						mixedTeams.peek().setScore(damage);
						out.println( "Team A " + mixedTeams.peek().getName() + " score is: " + mixedTeams.peek().getScore() );
					}
					else
					{
						mixedTeams.peek().setScore(damage);
						out.println( "Team B " + mixedTeams.peek().getName() + " score is: " + mixedTeams.peek().getScore() );
					}
					
					if ( mixedTeams.peek( ).getHealth() <= 0 )
					{
						// adds member
						deaths.add( new Deaths ( mixedTeams.peek().getName(), mixedTeams.peek().getAge(),
												 mixedTeams.peek().getRace(), mixedTeams.peek().getScore() ) );
						out.println( mixedTeams.peek().getName() + " has died." );
						// removes member the mixedTeams List
						mixedTeams.remove( );
					}
					else
					{
						mixedTeams.peek( ).setHealth( damage );
						out.println( mixedTeams.peek( ).getName() + " took: " + damage + " damage.\nHealth remaining for " +
								mixedTeams.peek().getName() + ": " + mixedTeams.peek(  ).getHealth() );					
					}
				}
				else
				{
					// 15 points for getting saved.
					out.println( "Companion saved " + mixedTeams.peek().getName() );
					mixedTeams.peek().setScore( 15 );
				}
		
				// shuffle stack each time to provide some randomness
				Collections.shuffle( animals );
				//mixed teams has their first memeber removed and added to end of the queue
				mixedTeams.offer( mixedTeams.remove() );
			}// end of while loop
			
			// file writer, buffered, and print for the output of the winners
			FileWriter winnerOutput = new FileWriter ( "C:\\Windows\\Temp\\Winners.txt", true );
			BufferedWriter bufferedWinnerWriter = new BufferedWriter ( ( winnerOutput ) );
			PrintWriter winOut = new PrintWriter( winnerOutput );
		
			
			//extra points for winning
			mixedTeams.peek().setScore( 200 );
			winOut.write("\nThe overall winner is: \n" + mixedTeams.peek().getName() + " and is awarded 200 points!"
								+ " Score: " + mixedTeams.peek().getScore() + "\n" );
			
			winOut.write( " ________________________________\n" );
			winOut.write( "| Team A Players        | Score  |\n" );
			winOut.write( "|-----------------------|--------|\n");
			// add total score of team A
			for (int index = 5; index   > 0; index-- )
			{	
				winOut.printf ("| %-22s| %.1f |\n", teamA.peek().getName(), teamA.peek().getScore() );
				teamAtotalScore = teamA.peek().getScore() + teamAtotalScore;
				teamA.remove();
			}
			
			winOut.println( " --------------------------------" );
			winOut.printf( "Team A total score = %.1f\n", teamAtotalScore );
	
			winOut.println( " ________________________________" );
			// add total score for team B
			winOut.println( "| Team B Players        | Score  |" );
			winOut.println( "|-----------------------|--------|");
			// add total score of team A
			for (int index = 5; index > 0; index-- )
			{	
				winOut.printf ("| %-22s| %.1f |\n", teamB.peek().getName(), teamB.peek().getScore() );
				teamBtotalScore = teamB.peek().getScore() + teamBtotalScore;
				teamB.remove();
			}
			winOut.println( " ---------------------------------" );
			winOut.printf( "Team B total score = %.1f\n", teamBtotalScore );
			
			winOut.println( "\nAnimals who got to play: \n" );
			//print out animal objects
			for ( int index  = 0; index < animals.size(); index++ ) 
			{
				winOut.printf( animals.get( index ).getName() + "\n" );
			}
			
			
			// prints the scores specifying the winning team
			if ( teamAtotalScore > teamBtotalScore )
			{
				winOut.printf( "\nTeam A wins! With a score of %.1f", teamAtotalScore );
				winOut.printf( " to %.1f", teamBtotalScore );
			}
			else
			{
				winOut.printf( "\nTeam B wins! With a score of %.1f", teamBtotalScore );
				winOut.printf( " to %.1f", teamAtotalScore );
			}
			winnerOutput.close();
		}catch (IOException error )
		{}
		System.out.println( "Game Finished. \nTwo files created in: " + location + " and Winners.txt." );
	}// end of main
	
	/**
	 * This method is used to create the files in the proper locations
	 * @param choice users input 
	 * @param input input for the file system
	 * @return returns the string the user created
	 */
	public static String location (String choice, Scanner input )
	{
		String location = null;
		System.out.println ( "Please insert the directory [C:\\Windows\\Temp\\]: " );
		location = input.next();
		
		if ( Files.exists( Paths.get( location ) ) == true )
		{
			System.out.println( "Path location: " + Paths.get(location));
			File file = new File ( location.toString() );
			
			// create the file to make it work....
			try 
			{
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
	
			return location;
		}
			// logic here is wrong, it doesn't work how I want it to.
		
		else
			return "Not a valid file location.";
	}
}// end of class