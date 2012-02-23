package inf122.bitly.console.state;

import inf122.bitly.console.reader.TextReaderInterface;

public class LoggedOutBitlyState extends BitlyState{


	public LoggedOutBitlyState(TextReaderInterface tr) 
	{
		this.tr = tr;
	}

	public BitlyState login(String loginName, String apiKey)
	{
		if (tr.login(loginName, apiKey))
			return new LoggedInBitlyState(loginName, apiKey, tr);
		else
			return new LoggedInBitlyState("", "", tr);
	}
}
