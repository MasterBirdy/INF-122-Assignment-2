// TriCommand.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Implements the TRI command

package inf122.bitly.console.commands;

import inf122.bitly.console.results.CommandResult;
import inf122.bitly.console.results.UnimplementedCommandResult;
import inf122.bitly.console.state.BitlyContext;


public class TriCommand implements Command
{
	public TriCommand(
		int raceNumber, int amount,
		String firstHorseNumber, String secondHorseNumber,
		String thirdHorseNumber)
	{
		this.raceNumber = raceNumber;
		this.amount = amount;
		this.firstHorseNumber = firstHorseNumber;
		this.secondHorseNumber = secondHorseNumber;
		this.thirdHorseNumber = thirdHorseNumber;
	}
	
	
	public CommandResult execute(BitlyContext state)
	{
		// Inf122TBD: Return an actual result
		return new UnimplementedCommandResult();
	}
	
	
	private int raceNumber;
	private int amount;
	private String firstHorseNumber;
	private String secondHorseNumber;
	private String thirdHorseNumber;
}
