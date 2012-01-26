// ExBoxCommandParser.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Parses the EXBOX command.

package inf122.horses.console.parsers;

import inf122.horses.console.commands.Command;
import inf122.horses.console.commands.ExBoxCommand;


class ExBoxCommandParser extends ExCommandParser
{
	protected Command createCommand(
		int raceNumber, int amount,
		String firstHorseNumber, String secondHorseNumber)
	{
		return new ExBoxCommand(
			raceNumber, amount,
			firstHorseNumber, secondHorseNumber);
	}
}
