// ShowCommand.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Implements the SHOW command

package inf122.bitly.console.commands;

import inf122.bitly.console.results.CommandResult;
import inf122.bitly.console.results.UnimplementedCommandResult;
import inf122.bitly.console.state.BitlyContext;

import java.util.Set;


public class ShowCommand extends SingleHorseBetCommand
{
	public ShowCommand(int horseNumber, int amountPerHorse, Set<String> horseNumbers)
	{
		super(horseNumber, amountPerHorse, horseNumbers);
	}
	
	
	public CommandResult execute(BitlyContext state)
	{
		// Inf122TBD: Return an actual result
		return new UnimplementedCommandResult();
	}
}
