package inf122.bitly.console.commands;

import inf122.bitly.console.results.CommandResult;
import inf122.bitly.console.results.WeekCommandResult;
import inf122.bitly.console.state.BitlyContext;

public class WeekCommand implements Command {

	@Override
	public CommandResult execute(BitlyContext state) {
		state.week();
		return new WeekCommandResult();
	}

}
