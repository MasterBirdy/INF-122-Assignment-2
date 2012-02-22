package inf122.bitly.console.state;

public class LoggedOutBitlyState extends BitlyState{


	public BitlyState login(String loginName, String apiKey)
	{
			return new LoggedInBitlyState(loginName, apiKey);
	}
}
