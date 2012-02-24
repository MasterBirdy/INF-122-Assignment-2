package inf122.bitly.console.parsers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LogoutCommandParserTest {

	private LogoutCommandParser lcp;
	
	@Before
	public void setUp() {
		lcp = new LogoutCommandParser();
	}

	@Test
	public void testParseWords() {
		lcp.parseWords(new String[] {"LOGOUT"});
		assertTrue(true);
	}
	
	@Test(expected = InvalidCommandException.class)
	public void parseFailure() {
		lcp.parseWords(new String[] {"LOGOUT", "http://www.google.com"});
	}

	@Test
	public void testGetFormatMessages() {
		assertArrayEquals(new String[] {
				"LOGOUT"
			}, lcp.getFormatMessages());
	}
}
