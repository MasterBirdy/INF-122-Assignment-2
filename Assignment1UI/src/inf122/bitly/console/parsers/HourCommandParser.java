package inf122.bitly.console.parsers;

import inf122.bitly.console.commands.Command;
import inf122.bitly.console.commands.HourCommand;

public class HourCommandParser extends BaseKnownCommandParser{

	@Override
	protected Command parseWords(String[] commandWords) {
		if (commandWords.length != 1)
		{
			return parseFailure();
		}
		return new HourCommand();
	}

	@Override
	protected String[] getFormatMessages() {
		return new String[] {
				"HOUR"
		};
	}

}
