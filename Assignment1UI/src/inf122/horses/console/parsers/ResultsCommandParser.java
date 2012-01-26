// ResultsCommandParser.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Parses the RESULTS command.

package inf122.horses.console.parsers;

import inf122.horses.console.commands.Command;
import inf122.horses.console.commands.ResultsCommand;


class ResultsCommandParser extends BaseKnownCommandParser
{
	public Command parse(String[] commandWords)
	{
		if (commandWords.length != 5)
		{
			return parseFailure();
		}
		
		int raceNumber = parseIntInRange(commandWords[1], 0, Integer.MAX_VALUE);
		
		return new ResultsCommand(
			raceNumber, commandWords[2],
			commandWords[3], commandWords[4]);
	}
	
	
	protected String[] getFormatMessages()
	{
		return new String[] {
			"RESULTS <race#> <firstHorse> <secondHorse> <thirdHorse>",
			"     race#       - Race number for which to record results",
			"     firstHorse  - The number of the horse that finished first",
			"     secondHorse - The number of the horse that finished second",
			"     thirdHorse  - The number of the horse that finished third"
		};
	}
}
