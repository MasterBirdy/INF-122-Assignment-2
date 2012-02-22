package inf122.bitly.console.results;

import java.util.Arrays;
import java.util.List;

public class WatchCommandResult implements CommandResult {
	
	private boolean success;

	public WatchCommandResult(boolean success) {
		this.success = success;
	}

	@Override
	public List<String> getConsoleOutput() {
		if (success)
			return Arrays.asList("URL has been successfully added");
		else
			return Arrays.asList("URL was not added");
	}

	@Override
	public boolean stopConsole() {
		// TODO Auto-generated method stub
		return false;
	}

}
