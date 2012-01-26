// CommandParser.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Here, we isolate the decision about how commands in the console-mode user
// interface are parsed and become command objects.
//
// Rather than having one giant if/else ladder or switch statement here,
// though, we instead build a map of KnownCommandParsers, each one of which
// can parse a particular kind of command once we know what it is.  So we
// simply split the given command into words, look up the appropriate parser
// associated with the first word, and then ask that parser to parse the
// command words.

package inf122.horses.console.parsers;

import inf122.horses.console.commands.Command;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class CommandParser
{
	public Command parse(String commandString)
	{
		String[] commandWords = commandString.toUpperCase().split("\\s+");
		
		if (commandWords.length == 0)
		{
			throw new InvalidCommandException("Empty command");
		}
		
		KnownCommandParser parser = knownCommandParsers.get(commandWords[0]);
		
		if (parser == null)
		{
			throw new InvalidCommandException("Unknown command: " + commandWords[0]);
		}
		
		return parser.parse(commandWords);
	}
	
	
	static
	{
		Map<String, KnownCommandParser> parsers = new HashMap<String, KnownCommandParser>();
		
		parsers.put("TAKE", new TakeCommandParser());
		parsers.put("RACE", new RaceCommandParser());
		parsers.put("RESULTS", new ResultsCommandParser());
		parsers.put("WIN", new WinCommandParser());
		parsers.put("PLACE", new PlaceCommandParser());
		parsers.put("SHOW", new ShowCommandParser());
		parsers.put("EX", new ExCommandParser());
		parsers.put("EXBOX", new ExBoxCommandParser());
		parsers.put("TRI", new TriCommandParser());
		parsers.put("TRIBOX", new TriBoxCommandParser());
		parsers.put("CLAIM", new ClaimCommandParser());
		parsers.put("CANCEL", new CancelCommandParser());
		parsers.put("POOL", new PoolCommandParser());
		parsers.put("PAY", new PayCommandParser());
		parsers.put("STOP", new StopCommandParser());
		
		knownCommandParsers = Collections.unmodifiableMap(parsers);
	}
	
	
	private static Map<String, KnownCommandParser> knownCommandParsers;
}
