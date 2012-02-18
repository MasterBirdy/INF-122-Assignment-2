// TakeCommand.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Implements the TAKE command

package inf122.bitly.console.commands;

import inf122.bitly.console.results.CommandResult;
import inf122.bitly.console.results.UnimplementedCommandResult;
import inf122.bitly.console.state.BitlyContext;


public class TakeCommand implements Command
{
	public TakeCommand(int takePercentage)
	{
		if (takePercentage < 0 || takePercentage > 100)
		{
			throw new IllegalArgumentException("takePercentage must be between 0 and 100");
		}
		
		this.takePercentage = takePercentage;
	}
	
	
	public CommandResult execute(BitlyContext state)
	{
		// Inf122TBD: Return an actual result
		return new UnimplementedCommandResult();
	}
	
	
	private int takePercentage;
}
