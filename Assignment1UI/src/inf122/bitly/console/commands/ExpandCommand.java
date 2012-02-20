package inf122.bitly.console.commands;

import inf122.bitly.console.results.CommandResult;
import inf122.bitly.console.results.ExpandCommandResult;
import inf122.bitly.console.state.BitlyContext;

public class ExpandCommand implements Command{
	
	private String shortURL;

	public ExpandCommand(String shortURL) {
		this.shortURL = shortURL;
	}

	@Override
	public CommandResult execute(BitlyContext state) {
		String longURL = state.shorten(shortURL);
		return new ExpandCommandResult(longURL);
	}

}
