package inf122.bitly.console.parsers;

import inf122.bitly.console.commands.Command;
import inf122.bitly.console.commands.WeekCommand;

public class WeekCommandParser extends BaseKnownCommandParser{

	@Override
	protected Command parseWords(String[] commandWords) {
		if (commandWords.length != 1)
		{
			return parseFailure();
		}
		return new WeekCommand();
	}

	@Override
	protected String[] getFormatMessages() {
		return new String[] {
				"WEEK"
		};
	}

}
