package inf122.bitly.console.state;

public class LoggedOutBitlyState extends BitlyState{


	public BitlyState login(String loginName, String apiKey)
	{
		String s = tr.login(loginName, apiKey);
		int booleanValue = Integer.parseInt(s);
		if (booleanValue != 0)
			return new LoggedInBitlyState(loginName, apiKey);
		else
			throw new InvalidLoginException();
	}
}
