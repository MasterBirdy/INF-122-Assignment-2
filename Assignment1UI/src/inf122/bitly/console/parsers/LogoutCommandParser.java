package inf122.bitly.console.parsers;

import inf122.bitly.console.commands.Command;
import inf122.bitly.console.commands.LogoutCommand;

public class LogoutCommandParser extends BaseKnownCommandParser{

	@Override
	protected Command parseWords(String[] commandWords) {
		if (commandWords.length != 1)
		{
			return parseFailure();
		}
		return new LogoutCommand();
	}

	@Override
	protected String[] getFormatMessages() {
		return new String[] {
				"LOGOUT"
		};
	}

}
