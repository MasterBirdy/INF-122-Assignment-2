// RaceCommandParser.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Parses the RACE command.

package inf122.horses.console.parsers;

import inf122.horses.console.commands.Command;
import inf122.horses.console.commands.RaceCommand;
import java.util.Arrays;
import java.util.Set;


class RaceCommandParser extends BaseKnownCommandParser
{
	public RaceCommandParser()
	{
		raceNumberWordParser = new RaceNumberWordParser();
		horseNumbersParser = new HorseNumbersParser();
	}
	
	
	protected Command parseWords(String[] commandWords)
	{
		if (commandWords.length < 3)
		{
			return parseFailure();
		}
		
		int raceNumber = raceNumberWordParser.parse(commandWords[1]);
		
		Set<String> horseNumbers = horseNumbersParser.parse(
			Arrays.copyOfRange(commandWords, 2, commandWords.length));
		
		return new RaceCommand(raceNumber, horseNumbers);
	}
	
	
	protected String[] getFormatMessages()
	{
		return new String[] {
			"RACE <race#> <horse#> [<horse#> ...]",
			"     race#  - race number to create, which must be a whole number",
			"     horse# - horse number of each horse in the race"
		};
	}
	
	
	private RaceNumberWordParser raceNumberWordParser;
	private HorseNumbersParser horseNumbersParser;
}
