// ShowCommandParser.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Parses the SHOW command.

package inf122.bitly.console.parsers;

import inf122.bitly.console.commands.Command;
import inf122.bitly.console.commands.ShowCommand;

import java.util.Set;


class ShowCommandParser extends SingleHorseBetCommandParser
{
	protected String getBetType()
	{
		return "SHOW";
	}
	
	
	protected Command createCommand(
		int raceNumber, int amountPerHorse, Set<String> horseNumbers)
	{
		return new ShowCommand(raceNumber, amountPerHorse, horseNumbers);
	}
}
