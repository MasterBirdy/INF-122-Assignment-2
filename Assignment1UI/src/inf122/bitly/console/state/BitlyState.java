package inf122.bitly.console.state;

public abstract class BitlyState {
	
	public BitlyState login(String apiKey)
	{
		throw new AlreadyLoggedInException();
	}

	public BitlyState logout()
	{
		throw new AlreadyLoggedOutException();
	}
	
	public String shorten(String url)
	{
		throw new NotLoggedInException();
	}
	
	public String expand(String shortenedUrl)
	{
		throw new NotLoggedInException();
	}
	
	public String watch(String shortenedUrl)
	{
		throw new NotLoggedInException();
	}
	
	public String hour()
	{
		throw new NotLoggedInException();
	}
	
	public String week()
	{
		throw new NotLoggedInException();
	}
}
