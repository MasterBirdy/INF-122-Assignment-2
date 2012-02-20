package inf122.bitly.console.parsers;

import inf122.bitly.console.commands.Command;
import inf122.bitly.console.commands.ExpandCommand;

public class ExpandCommandParser extends BaseKnownCommandParser {

	@Override
	protected Command parseWords(String[] commandWords) {
		if (commandWords.length != 2)
		{
			return parseFailure();
		}
		String shortURL = commandWords[1];
		return new ExpandCommand(shortURL);
	}

	@Override
	protected String[] getFormatMessages() {
		// TODO Auto-generated method stub
		return new String[] {
				"EXPAND <shortened_url>",
				"     shortened_url - an URL that has been shortened by bit.ly",
			};
	}

}
