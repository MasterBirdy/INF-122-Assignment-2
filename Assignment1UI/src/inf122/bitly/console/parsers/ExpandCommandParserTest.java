package inf122.bitly.console.parsers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ExpandCommandParserTest {
	
	private ExpandCommandParser ecp;
	
	@Before
	public void setUp() {
		ecp = new ExpandCommandParser();
	}

	@Test
	public void testParseWords() {
		ecp.parseWords(new String[] {"EXPAND", "http://bit.ly/wLewii"});
		assertTrue(true);
	}
	
	@Test(expected = InvalidCommandException.class)
	public void parseFailure() {
		ecp.parseWords(new String[] {"EXPAND"});
	}

	@Test
	public void testGetFormatMessages() {
		assertArrayEquals(new String[] {
				"EXPAND <shortened_url>",
				"     shortened_url - an URL that has been shortened by bit.ly",
			}, ecp.getFormatMessages());
	}

}
