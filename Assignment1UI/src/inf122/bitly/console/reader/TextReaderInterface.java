package inf122.bitly.console.reader;

public interface TextReaderInterface {

	public boolean login(String loginName, String apiKey);
	public String shorten(String longURL);
	public String expand(String shortURL);
}
