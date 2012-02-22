package inf122.bitly.console.commands;

import java.io.IOException;

import inf122.bitly.console.reader.TextReader;
import inf122.bitly.console.results.CommandResult;
import inf122.bitly.console.results.LoginCommandResult;
import inf122.bitly.console.state.BitlyContext;

public class LoginCommand implements Command{

	private String loginName;
	private String apiKey;

	public LoginCommand(String loginName, String apiKey) {
		this.loginName = loginName;
		this.apiKey = apiKey;
	}

	@Override
	public CommandResult execute(BitlyContext state) {
		try {
			if (state.login(loginName, apiKey, new TextReader().login(loginName, apiKey)))
				return new LoginCommandResult(loginName, apiKey);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new LoginCommandResult();
	}

}
