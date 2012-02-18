// ResultsCommand.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Implements the RESULTS command

package inf122.bitly.console.commands;

import inf122.bitly.console.results.CommandResult;
import inf122.bitly.console.results.UnimplementedCommandResult;
import inf122.bitly.console.state.BitlyContext;


public class ResultsCommand implements Command
{
	public ResultsCommand(
		int raceNumber, String firstHorse,
		String secondHorse, String thirdHorse)
	{
		this.raceNumber = raceNumber;
		this.firstHorse = firstHorse;
		this.secondHorse = secondHorse;
		this.thirdHorse = thirdHorse;
	}
	
	
	public CommandResult execute(BitlyContext state)
	{
		// Inf122TBD: Return an actual result
		return new UnimplementedCommandResult();
	}
	
	
	private int raceNumber;
	private String firstHorse;
	private String secondHorse;
	private String thirdHorse;
}
