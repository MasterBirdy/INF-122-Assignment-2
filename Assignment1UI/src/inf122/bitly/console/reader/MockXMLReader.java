package inf122.bitly.console.reader;

public class MockXMLReader implements XMLReaderInterface {

	@Override
	public int parseHour(String shortURL) {
		return 5;
	}

	@Override
	public int parseWeek(String shortURL) {
		return 6;
	}

}
