// RacetrackConsole.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Implementation of a console-mode racetrack user interface.

package inf122.bitly.console;

import inf122.bitly.console.commands.Command;
import inf122.bitly.console.commands.StopCommand;
import inf122.bitly.console.io.CommandInputStream;
import inf122.bitly.console.io.CommandOutputStream;
import inf122.bitly.console.io.CommandStreamsFactory;
import inf122.bitly.console.parsers.CommandParser;
import inf122.bitly.console.parsers.InvalidCommandException;
import inf122.bitly.console.results.CommandResult;
import inf122.bitly.console.state.BitlyContext;
import inf122.bitly.console.state.BitlyContextFactory;


public class BitlyConsole
{
	public BitlyConsole(
		BitlyContextFactory stateFactory,
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
				for (String message : e.getMessages())
				{
					commandOutputStream.writeOutput(message);
				}
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
	
	
	private BitlyContext state;
	private CommandInputStream commandInputStream;
	private CommandOutputStream commandOutputStream;
}
