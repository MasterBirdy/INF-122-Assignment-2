package inf122.bitly.console.commands;

import inf122.bitly.console.results.CommandResult;
import inf122.bitly.console.results.ShortenCommandResult;
import inf122.bitly.console.state.BitlyContext;

public class ShortenCommand implements Command{
	
	private String longURL;

	public ShortenCommand(String longURL) {
		this.longURL = longURL;
	}

	@Override
	public CommandResult execute(BitlyContext state) {
		String shortURL = state.shorten(longURL);
		return new ShortenCommandResult(shortURL);
	}

}
