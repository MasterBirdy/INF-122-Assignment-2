// PoolCommand.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Implements the POOL command

package inf122.bitly.console.commands;

import inf122.bitly.console.results.CommandResult;
import inf122.bitly.console.results.UnimplementedCommandResult;
import inf122.bitly.console.state.BitlyContext;


public class PoolCommand implements Command
{
	public PoolCommand(BetType betType, int raceNumber)
	{
		this.betType = betType;
		this.raceNumber = raceNumber;
	}
	
	
	public CommandResult execute(BitlyContext state)
	{
		// Inf122TBD: Return an actual result
		return new UnimplementedCommandResult();
	}
	
	
	private BetType betType;
	private int raceNumber;
}
