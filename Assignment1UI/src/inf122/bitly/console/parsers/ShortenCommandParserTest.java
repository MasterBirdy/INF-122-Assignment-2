package inf122.bitly.console.parsers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ShortenCommandParserTest {

	private ShortenCommandParser scp;
	
	@Before
	public void setUp() {
		scp = new ShortenCommandParser();
	}

	@Test
	public void testParseWords() {
		scp.parseWords(new String[] {"SHORTEN", "http://www.google.com"});
		assertTrue(true);
	}
	
	@Test(expected = InvalidCommandException.class)
	public void parseFailure() {
		scp.parseWords(new String[] {"SHORTEN"});
	}

	@Test
	public void testGetFormatMessages() {
		assertArrayEquals(new String[] {
				"SHORTEN <url>",
				"     url - an URL for the bit.ly service to shorten",
			}, scp.getFormatMessages());
	}

}
