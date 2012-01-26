// RaceCommandParser.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Parses the RACE command.

package inf122.horses.console.parsers;

import inf122.horses.console.commands.Command;
import inf122.horses.console.commands.RaceCommand;
import java.util.HashSet;
import java.util.Set;


class RaceCommandParser extends BaseKnownCommandParser
{
	public Command parse(String[] commandWords)
	{
		if (commandWords.length < 3)
		{
			return parseFailure();
		}
		
		int raceNumber = parseIntInRange(commandWords[1], 0, Integer.MAX_VALUE);

		Set<String> horseNumbers = new HashSet<String>();
		
		for (int i = 2; i < commandWords.length; i++)
		{
			if (horseNumbers.contains(commandWords[i]))
			{
				return parseFailure();
			}
			else
			{
				horseNumbers.add(commandWords[i]);
			}
		}
		
		return new RaceCommand(raceNumber, horseNumbers);
	}
	
	
	protected String[] getFormatMessages()
	{
		return new String[] {
			"RACE <race#> <horse#> [<horse#> ...]",
			"     race#  - race number to create, which must be a whole number 0..",
			"     horse# - horse number of each horse in the race"
		};
	}
}
