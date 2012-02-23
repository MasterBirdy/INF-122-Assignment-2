package inf122.bitly.console.commands;

import inf122.bitly.console.reader.XMLReader;
import inf122.bitly.console.results.CommandResult;
import inf122.bitly.console.results.UnwatchCommandResult;
import inf122.bitly.console.state.BitlyContext;
import inf122.bitly.console.watchlist.Observer;

public class UnwatchCommand implements Command {
	
	private String shortURL;

	public UnwatchCommand(String shortURL) {
		this.shortURL = shortURL;
	}

	@Override
	public CommandResult execute(BitlyContext state) {
		boolean success = state.unwatch(new Observer(shortURL, new XMLReader()));
		return new UnwatchCommandResult(success);
	}

}
