package inf122.bitly.console.parsers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WeekCommandParserTest {

	private WeekCommandParser wcp;

	@Before
	public void setUp() {
		wcp = new WeekCommandParser();
	}

	@Test
	public void testParseWords() {
		wcp.parseWords(new String[] {"WEEK"});
		assertTrue(true);
	}
	
	@Test(expected = InvalidCommandException.class)
	public void parseFailure() {
		wcp.parseWords(new String[] {"WEEK", "http://www.google.com"});
	}

	@Test
	public void testGetFormatMessages() {
		assertArrayEquals(new String[] {
				"WEEK"
			}, wcp.getFormatMessages());
	}
}
