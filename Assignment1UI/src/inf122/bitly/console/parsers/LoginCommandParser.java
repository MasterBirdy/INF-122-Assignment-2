package inf122.bitly.console.parsers;

import inf122.bitly.console.commands.Command;
import inf122.bitly.console.commands.LoginCommand;

public class LoginCommandParser extends BaseKnownCommandParser{
	
	public LoginCommandParser(){
		
	}

	@Override
	protected Command parseWords(String[] commandWords) {
			if (commandWords.length != 2)
			{
				return parseFailure();
			}
			
			String apiKey = commandWords[1];
			return new LoginCommand(apiKey);
	}

	@Override
	protected String[] getFormatMessages() {
		return new String[] {
				"LOGIN <apikey>",
				"     apikey - an api key which you get from bit.ly to run commands"
			};
	}

}
