// StopCommand.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Implements the STOP command

package inf122.bitly.console.commands;

import inf122.bitly.console.results.CommandResult;
import inf122.bitly.console.results.StopCommandResult;
import inf122.bitly.console.state.BitlyContext;


public class StopCommand implements Command
{
	public CommandResult execute(BitlyContext state)
	{
		return new StopCommandResult();
	}
}
