package inf122.bitly.console.parsers;

import inf122.bitly.console.commands.Command;
import inf122.bitly.console.commands.LoginCommand;

public class LoginCommandParser extends BaseKnownCommandParser{

	@Override
	protected Command parseWords(String[] commandWords) {
			if (commandWords.length != 3)
			{
				return parseFailure();
			}
			
			String loginName = commandWords[1];
			String apiKey = commandWords[2];
			return new LoginCommand(loginName, apiKey);
	}

	@Override
	protected String[] getFormatMessages() {
		return new String[] {
				"LOGIN <login_name> <apikey>",
				"     login_name - an username for the bit.ly API",
				"     apikey - an api key which you get from bit.ly to run commands"
			};
	}

}
