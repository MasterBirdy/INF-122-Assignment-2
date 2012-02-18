// TriCommandParser.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Parses the TRI command.

package inf122.bitly.console.parsers;

import inf122.bitly.console.commands.Command;
import inf122.bitly.console.commands.TriCommand;

import java.util.Arrays;
import java.util.List;


class TriCommandParser extends BaseKnownCommandParser
{
	public TriCommandParser()
	{
		raceNumberWordParser = new RaceNumberWordParser();
		amountWordParser = new AmountWordParser();
		horseNumbersParser = new HorseNumbersParser();
	}
	
	
	protected Command parseWords(String[] commandWords)
	{
		if (commandWords.length != 6)
		{
			return parseFailure();
		}
		
		int raceNumber = raceNumberWordParser.parse(commandWords[1]);
		int amount = amountWordParser.parse(commandWords[2]);
		
		List<String> horseNumbers = horseNumbersParser.parse(
			Arrays.copyOfRange(commandWords, 3, commandWords.length));
		
		if (horseNumbers.size() != 3)
		{
			return parseFailure();
		}

		return new TriCommand(
			raceNumber, amount,
			horseNumbers.get(0), horseNumbers.get(1),
			horseNumbers.get(2));
	}


	protected String[] getFormatMessages()
	{
		return new String[] {
			"TRI <race#> <amountPerHorse> <firstHorse#> <secondHorse#> <thirdHorse#>",
			"    race#          - Race # on which to place a bet",
			"    amountPerHorse - Amount, a whole number at least 1, to bet",
			"    firstHorse#    - Horse expected to finish first",
			"    secondHorse#   - Horse expected to finish second",
			"    thirdHorse#    - Horse expected to finish third"
		};
	}
	
	
	private RaceNumberWordParser raceNumberWordParser;
	private AmountWordParser amountWordParser;
	private HorseNumbersParser horseNumbersParser;
}
