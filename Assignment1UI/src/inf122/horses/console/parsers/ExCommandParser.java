// ExCommandParser.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Parses the EX command.

package inf122.horses.console.parsers;

import inf122.horses.console.commands.Command;
import inf122.horses.console.commands.ExCommand;
import java.util.Arrays;
import java.util.List;


class ExCommandParser extends BaseKnownCommandParser
{
	public ExCommandParser()
	{
		raceNumberWordParser = new RaceNumberWordParser();
		amountWordParser = new AmountWordParser();
		horseNumbersParser = new HorseNumbersParser();
	}
	
	
	protected Command parseWords(String[] commandWords)
	{
		if (commandWords.length != 5)
		{
			return parseFailure();
		}
		
		int raceNumber = raceNumberWordParser.parse(commandWords[1]);
		int amount = amountWordParser.parse(commandWords[2]);
		
		List<String> horseNumbers = horseNumbersParser.parse(
			Arrays.copyOfRange(commandWords, 3, commandWords.length));
		
		if (horseNumbers.size() != 2)
		{
			return parseFailure();
		}
		
		return new ExCommand(
			raceNumber, amount,
			horseNumbers.get(0), horseNumbers.get(1));
	}


	protected String[] getFormatMessages()
	{
		return new String[] {
			"EX <race#> <amountPerHorse> <firstHorse#> <secondHorse#>",
			"    race#          - Race # on which to place a bet",
			"    amountPerHorse - Amount, a whole number at least 1, to bet",
			"    firstHorse#    - Horse expected to finish first",
			"    secondHorse#   - Horse expected to finish second"
		};
	}
	
	
	private RaceNumberWordParser raceNumberWordParser;
	private AmountWordParser amountWordParser;
	private HorseNumbersParser horseNumbersParser;
}
