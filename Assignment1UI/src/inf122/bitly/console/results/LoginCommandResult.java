package inf122.bitly.console.results;

import java.util.Arrays;
import java.util.List;

public class LoginCommandResult implements CommandResult{
	
	private boolean success;
	private String loginName;
	private String apiKey;

	public LoginCommandResult(String loginName, String apiKey) {
		this.loginName = loginName;
		this.apiKey = apiKey;
		success = true;
	}

	public LoginCommandResult() {
		success = false;
	}

	@Override
	public List<String> getConsoleOutput() {
		if (success)
			return Arrays.asList("You were logged in as: " + loginName + " with API Key: " + apiKey);
		else
			return Arrays.asList("Login unsuccessful");
	}

	@Override
	public boolean stopConsole() {
		// TODO Auto-generated method stub
		return false;
	}

}
