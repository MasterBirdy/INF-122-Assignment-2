package inf122.bitly.console.parsers;

import inf122.bitly.console.commands.Command;
import inf122.bitly.console.commands.ShortenCommand;

public class ShortenCommandParser extends BaseKnownCommandParser{

	@Override
	protected Command parseWords(String[] commandWords) {
		if (commandWords.length != 2)
		{
			return parseFailure();
		}
		String longURL = commandWords[1];
		return new ShortenCommand(longURL);
	}

	@Override
	protected String[] getFormatMessages() {
		// TODO Auto-generated method stub
		return new String[] {
				"SHORTEN <url>",
				"     url - an URL for the bit.ly service to shorten",
			};
	}

}
