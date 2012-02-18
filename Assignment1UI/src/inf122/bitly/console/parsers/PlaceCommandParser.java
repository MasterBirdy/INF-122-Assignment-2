// PlaceCommandParser.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Parses the PLACE command.

package inf122.bitly.console.parsers;

import inf122.bitly.console.commands.Command;
import inf122.bitly.console.commands.PlaceCommand;

import java.util.Set;


class PlaceCommandParser extends SingleHorseBetCommandParser
{
	protected String getBetType()
	{
		return "PLACE";
	}
	
	
	protected Command createCommand(
		int raceNumber, int amountPerHorse, Set<String> horseNumbers)
	{
		return new PlaceCommand(raceNumber, amountPerHorse, horseNumbers);
	}
}
