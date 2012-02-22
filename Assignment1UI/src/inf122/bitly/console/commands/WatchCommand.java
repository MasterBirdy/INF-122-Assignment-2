package inf122.bitly.console.commands;

import inf122.bitly.console.results.CommandResult;
import inf122.bitly.console.results.WatchCommandResult;
import inf122.bitly.console.state.BitlyContext;

public class WatchCommand implements Command {
	
	private String shortURL;

	public WatchCommand(String shortURL) {
		this.shortURL = shortURL;
	}

	@Override
	public CommandResult execute(BitlyContext state) {
		boolean success = state.watch(shortURL);
		return new WatchCommandResult(success);
	}

}
