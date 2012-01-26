// RacetrackConsole.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Implementation of a console-mode racetrack user interface.

package inf122.horses.console;

import inf122.horses.console.commands.StopCommand;
import inf122.horses.console.commands.WelcomeCommand;
import inf122.horses.console.parsers.CommandParser;
import inf122.horses.console.parsers.InvalidCommandException;
import java.util.Scanner;


public class RacetrackConsole
{
	public RacetrackConsole(RacetrackState state)
	{
		this.state = state;
	}
	
	
	public void run()
	{
		new WelcomeCommand().execute(state);
		
		consoleIn = new Scanner(System.in);
		CommandParser commandParser = new CommandParser();
		
		while (true)
		{
			String commandString = consoleIn.nextLine();
			
			if (commandString == null)
			{
				new StopCommand().execute(state);
				break;
			}
			else
			{
				try
				{
					commandParser.parse(commandString).execute(state);
				}
				catch (InvalidCommandException e)
				{
					System.out.println(e.getMessage());
				}
			}
		}
	}
	
	
	private RacetrackState state;
	private Scanner consoleIn;
}
