package inf122.bitly.console.commands;

import inf122.bitly.console.results.CommandResult;
import inf122.bitly.console.state.BitlyContext;

public class LoginCommand implements Command{
	
	private String apiKey;

	public LoginCommand(String apiKey) {
		this.apiKey = apiKey;
	}

	@Override
	public CommandResult execute(BitlyContext state) {
		// TODO Auto-generated method stub
		return null;
	}

}
