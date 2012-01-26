// ExBoxCommandParser.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Parses the EXBOX command.

package inf122.horses.console.parsers;

import inf122.horses.console.commands.Command;
import inf122.horses.console.commands.ExBoxCommand;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;


class ExBoxCommandParser extends ExCommandParser
{
	public ExBoxCommandParser()
	{
		raceNumberWordParser = new RaceNumberWordParser();
		amountWordParser = new AmountWordParser();
		horseNumbersParser = new HorseNumbersParser();
	}
	
	
	protected Command parseWords(String[] commandWords)
	{
		if (commandWords.length < 5)
		{
			return parseFailure();
		}
		
		int raceNumber = raceNumberWordParser.parse(commandWords[1]);
		int amount = amountWordParser.parse(commandWords[2]);
		
		List<String> horseNumbers = horseNumbersParser.parse(
			Arrays.copyOfRange(commandWords, 3, commandWords.length));
		
		if (horseNumbers.size() < 2)
		{
			return parseFailure();
		}

		return new ExBoxCommand(
			raceNumber, amount,
			new HashSet<String>(horseNumbers));
	}


	protected String[] getFormatMessages()
	{
		return new String[] {
			"EXBOX <race#> <amountPerHorse> <horse#> <horse#> [<horse#> ...]",
			"    race#          - Race # on which to place a bet",
			"    amountPerHorse - Amount, a whole number at least 1, to bet",
			"    horse#         - The horse numbers to include in the box"
		};
	}

	
	private RaceNumberWordParser raceNumberWordParser;
	private AmountWordParser amountWordParser;
	private HorseNumbersParser horseNumbersParser;
}
