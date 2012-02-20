package inf122.bitly.console.state;

public class LoggedInBitlyState extends BitlyState {
	
	private String loginName;
	private String apiKey;
	
	public LoggedInBitlyState(String loginName, String apiKey)
	{
		this.loginName = loginName;
		this.apiKey = apiKey;
	}
	
	public String getLoginName()
	{
		return loginName;
	}
	
	public String getAPIKey()
	{
		return apiKey;
	}
	
	public BitlyState logout()
	{
		return new LoggedOutBitlyState();
	}
	
	public String shorten (String longURL)
	{
		return tr.shorten(longURL, loginName, apiKey);
	}
	
	public String expand (String shortURL)
	{
		return tr.expand(shortURL, loginName, apiKey);
	}

}
