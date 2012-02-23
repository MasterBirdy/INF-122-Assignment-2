package inf122.bitly.console.commands;

import inf122.bitly.console.results.CommandResult;
import inf122.bitly.console.results.HourCommandResult;
import inf122.bitly.console.state.BitlyContext;

public class HourCommand implements Command {

	@Override
	public CommandResult execute(BitlyContext state) {
		state.hour();
		return new HourCommandResult();
	}

}
