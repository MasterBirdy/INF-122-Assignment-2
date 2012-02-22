package inf122.bitly.console.commands;

import inf122.bitly.console.results.CommandResult;
import inf122.bitly.console.results.UnwatchCommandResult;
import inf122.bitly.console.state.BitlyContext;

public class UnwatchCommand implements Command {
	
	private String shortURL;

	public UnwatchCommand(String shortURL) {
		this.shortURL = shortURL;
	}

	@Override
	public CommandResult execute(BitlyContext state) {
		boolean success = state.unwatch(shortURL);
		return new UnwatchCommandResult(success);
	}

}
