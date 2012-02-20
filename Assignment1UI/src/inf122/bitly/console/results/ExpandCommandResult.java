package inf122.bitly.console.results;

import java.util.Arrays;
import java.util.List;

public class ExpandCommandResult implements CommandResult{

	private String longURL;

	public ExpandCommandResult(String longURL) {
		this.longURL = longURL;
	}

	@Override
	public List<String> getConsoleOutput() {
		if (!longURL.equals("") && !longURL.equals("NOT_FOUND"))
			return Arrays.asList("URL has been expanded to " + longURL);
		else
			return Arrays.asList("URL shortening unsuccessful");
	}

	@Override
	public boolean stopConsole() {
		// TODO Auto-generated method stub
		return false;
	}

}
