package inf122.bitly.console.parsers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HourCommandParserTest {

	private HourCommandParser hcp;
	
	@Before
	public void setUp() {
		hcp = new HourCommandParser();
	}

	@Test
	public void testParseWords() {
		hcp.parseWords(new String[] {"HOUR"});
		assertTrue(true);
	}
	
	@Test(expected = InvalidCommandException.class)
	public void parseFailure() {
		hcp.parseWords(new String[] {"HOUR", "http://www.google.com"});
	}

	@Test
	public void testGetFormatMessages() {
		assertArrayEquals(new String[] {
				"HOUR"
			}, hcp.getFormatMessages());
	}

}
