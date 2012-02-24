package inf122.bitly.console.results;

import java.util.Arrays;
import java.util.List;

public class HourCommandResult implements CommandResult {

	@Override
	public List<String> getConsoleOutput() {
		// TODO Auto-generated method stub
		return Arrays.asList("End of Hour List");
	}

	@Override
	public boolean stopConsole() {
		// TODO Auto-generated method stub
		return false;
	}

}
