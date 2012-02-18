// ResultsCommandParser.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Parses the RESULTS command.

package inf122.bitly.console.parsers;

import inf122.bitly.console.commands.Command;
import inf122.bitly.console.commands.ResultsCommand;

import java.util.Arrays;
import java.util.List;


class ResultsCommandParser extends BaseKnownCommandParser
{
	public ResultsCommandParser()
	{
		raceNumberWordParser = new RaceNumberWordParser();
		horseNumbersParser = new HorseNumbersParser();
	}
	
	
	protected Command parseWords(String[] commandWords)
	{
		if (commandWords.length != 5)
		{
			return parseFailure();
		}
		
		int raceNumber = raceNumberWordParser.parse(commandWords[1]);
		
		List<String> horseNumbers = horseNumbersParser.parse(
			Arrays.copyOfRange(commandWords, 2, commandWords.length));
		
		if (horseNumbers.size() != 3)
		{
			return parseFailure();
		}
		
		return new ResultsCommand(
			raceNumber, horseNumbers.get(0),
			horseNumbers.get(1), horseNumbers.get(2));
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
	
	
	private RaceNumberWordParser raceNumberWordParser;
	private HorseNumbersParser horseNumbersParser;
}
