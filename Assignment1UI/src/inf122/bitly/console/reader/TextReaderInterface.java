package inf122.bitly.console.reader;

public interface TextReaderInterface {

	public boolean login(String loginName, String apiKey);
	public String shorten(String longURL, String loginName, String apiKey);
	public String expand(String shortURL, String loginName, String apiKey);
}
