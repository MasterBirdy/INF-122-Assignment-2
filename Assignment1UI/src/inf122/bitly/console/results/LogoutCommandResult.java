package inf122.bitly.console.results;

import java.util.Arrays;
import java.util.List;

public class LogoutCommandResult implements CommandResult{

	@Override
	public List<String> getConsoleOutput() {
		return Arrays.asList("Logout successful");
	}

	@Override
	public boolean stopConsole() {
		// TODO Auto-generated method stub
		return false;
	}

}
