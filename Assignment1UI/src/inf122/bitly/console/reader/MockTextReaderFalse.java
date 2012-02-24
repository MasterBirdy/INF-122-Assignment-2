package inf122.bitly.console.reader;

public class MockTextReaderFalse implements TextReaderInterface {

	@Override
	public boolean login(String loginName, String apiKey) {
		return false;
	}

	@Override
	public String shorten(String longURL) {
		// TODO Auto-generated method stub
		return "http://bit.ly/wLewii";
	}

	@Override
	public String expand(String shortURL) {
		// TODO Auto-generated method stub
		return "http://tf2pug.heroku.com/topics/3073";
	}

}
