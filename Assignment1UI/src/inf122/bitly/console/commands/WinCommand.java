// WinCommand.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Implements the WIN command

package inf122.bitly.console.commands;

import inf122.bitly.console.results.CommandResult;
import inf122.bitly.console.results.UnimplementedCommandResult;
import inf122.bitly.console.state.BitlyContext;

import java.util.Set;


public class WinCommand extends SingleHorseBetCommand
{
	public WinCommand(int horseNumber, int amountPerHorse, Set<String> horseNumbers)
	{
		super(horseNumber, amountPerHorse, horseNumbers);
	}
	
	
	public CommandResult execute(BitlyContext state)
	{
		// Inf122TBD: Return an actual result
		return new UnimplementedCommandResult();
	}
}
