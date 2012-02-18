// WelcomeCommand.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Implements the WELCOME command

package inf122.bitly.console.commands;

import inf122.bitly.console.results.CommandResult;
import inf122.bitly.console.results.WelcomeCommandResult;
import inf122.bitly.console.state.BitlyContext;


public class WelcomeCommand implements Command
{
	public CommandResult execute(BitlyContext state)
	{
		return new WelcomeCommandResult();
	}
}
