// WinCommandParser.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Parses the WIN command.

package inf122.horses.console.parsers;

import inf122.horses.console.commands.Command;
import inf122.horses.console.commands.WinCommand;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


class WinCommandParser extends BaseKnownCommandParser
{
	public WinCommandParser()
	{
		raceNumberWordParser = new RaceNumberWordParser();
		amountWordParser = new AmountWordParser();
		horseNumbersParser = new HorseNumbersParser();
	}
	
	
	protected Command parseWords(String[] commandWords)
	{
		if (commandWords.length < 4)
		{
			return parseFailure();
		}
		
		int raceNumber = raceNumberWordParser.parse(commandWords[1]);
		int amountPerHorse = amountWordParser.parse(commandWords[2]);

		Set<String> horseNumbers = horseNumbersParser.parse(
			Arrays.copyOfRange(commandWords, 3, commandWords.length));
		
		return new WinCommand(raceNumber, amountPerHorse, horseNumbers);
	}
	
	
	protected String[] getFormatMessages()
	{
		return new String[] {
			"WIN <race#> <amountPerHorse> <horse#> [<horse#> ...]",
			"     race#          - Race number for which to place a win bet",
			"     amountPerHorse - The amount, as a whole number (at least 1), to bet on each horse",
			"     horse#         - The number of each horse to place a win bet on"
		};
	}
	
	
	private RaceNumberWordParser raceNumberWordParser;
	private AmountWordParser amountWordParser;
	private HorseNumbersParser horseNumbersParser;
}
