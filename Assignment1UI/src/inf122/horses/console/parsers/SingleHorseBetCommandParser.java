// SingleHorseBetCommandParser.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Abstract class for parsing single-horse bet commands (e.g., WIN, PLACE, SHOW)

package inf122.horses.console.parsers;

import inf122.horses.console.commands.Command;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


abstract class SingleHorseBetCommandParser extends BaseKnownCommandParser
{
	public SingleHorseBetCommandParser()
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

		List<String> horseNumbers = horseNumbersParser.parse(
			Arrays.copyOfRange(commandWords, 3, commandWords.length));
		
		return createCommand(
			raceNumber, amountPerHorse,
			new HashSet<String>(horseNumbers));
	}
	
	
	protected String[] getFormatMessages()
	{
		return new String[] {
			getBetType() + " <race#> <amountPerHorse> <horse#> [<horse#> ...]",
			"     race#          - Race number for which to place a win bet",
			"     amountPerHorse - The amount, as a whole number (at least 1), to bet on each horse",
			"     horse#         - The number of each horse to place a win bet on"
		};
	}
	
	
	protected abstract String getBetType();
	
	protected abstract Command createCommand(
		int raceNumber, int amountPerHorse, Set<String> horseNumbers);
	
	
	private RaceNumberWordParser raceNumberWordParser;
	private AmountWordParser amountWordParser;
	private HorseNumbersParser horseNumbersParser;
}
