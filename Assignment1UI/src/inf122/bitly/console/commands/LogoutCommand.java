package inf122.bitly.console.commands;

import inf122.bitly.console.results.CommandResult;
import inf122.bitly.console.state.BitlyContext;
import inf122.bitly.console.results.LogoutCommandResult;

public class LogoutCommand implements Command{

	@Override
	public CommandResult execute(BitlyContext state) {
		state.logout();
		return new LogoutCommandResult();
	}

}
