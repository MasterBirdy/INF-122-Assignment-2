package inf122.bitly.console.results;

import java.util.Arrays;
import java.util.List;

public class ShortenCommandResult implements CommandResult {
	
	private String shortURL;

	public ShortenCommandResult(String shortURL) {
		this.shortURL = shortURL;
	}

	@Override
	public List<String> getConsoleOutput() {
		if (!shortURL.equals("") && !shortURL.equals("ALREADY_A_BITLY_LINK"))
			return Arrays.asList("URL has been shortened to " + shortURL);
		else
			return Arrays.asList("URL shortening unsuccessful");
	}

	@Override
	public boolean stopConsole() {
		// TODO Auto-generated method stub
		return false;
	}

}
