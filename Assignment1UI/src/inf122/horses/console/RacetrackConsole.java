// RacetrackConsole.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Implementation of a console-mode racetrack user interface.

package inf122.horses.console;

import inf122.horses.console.commands.Command;
import inf122.horses.console.commands.StopCommand;
import inf122.horses.console.io.CommandInputStream;
import inf122.horses.console.io.CommandOutputStream;
import inf122.horses.console.io.CommandStreamsFactory;
import inf122.horses.console.parsers.CommandParser;
import inf122.horses.console.parsers.InvalidCommandException;
import inf122.horses.console.results.CommandResult;
import inf122.horses.console.state.RacetrackState;
import inf122.horses.console.state.RacetrackStateFactory;


public class RacetrackConsole
{
	public RacetrackConsole(
		RacetrackStateFactory stateFactory,
		CommandStreamsFactory commandStreamsFactory)
	{
		this.state = stateFactory.create();
		this.commandInputStream = commandStreamsFactory.createCommandInputStream();
		this.commandOutputStream = commandStreamsFactory.createCommandOutputStream();
	}
	
	
	public void run()
	{
		while (true)
		{
			try
			{
				String commandString = commandInputStream.nextCommandString();

				CommandResult result = parseCommandString(commandString).execute(state);
				
				for (String outputLine : result.getConsoleOutput())
				{
					commandOutputStream.writeOutput(outputLine);
				}
				
				if (result.stopConsole())
				{
					break;
				}
			}
			catch (InvalidCommandException e)
			{
				commandOutputStream.writeOutput(e.getMessage());
			}
			catch (Exception e)
			{
				commandOutputStream.writeOutput("EXCEPTION: " + e.getMessage());
				e.printStackTrace();
			}
		}
	}
	
	
	private Command parseCommandString(String commandString)
	{
		if (commandString == null)
		{
			return new StopCommand(); 
		}
		else
		{
			return new CommandParser().parse(commandString);
		}
	}
	
	
	private RacetrackState state;
	private CommandInputStream commandInputStream;
	private CommandOutputStream commandOutputStream;
}
