package inf122.bitly.console.results;

import java.util.Arrays;
import java.util.List;

public class UnwatchCommandResult implements CommandResult {
	
	private boolean success;

	public UnwatchCommandResult(boolean success) {
		this.success = success;
	}

	@Override
	public List<String> getConsoleOutput() {
		if (success)
			return Arrays.asList("URL has been successfully removed");
		else
			return Arrays.asList("URL was not removed");
	}


	@Override
	public boolean stopConsole() {
		// TODO Auto-generated method stub
		return false;
	}

}
