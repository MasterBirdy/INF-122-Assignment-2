package inf122.bitly.console.parsers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WatchCommandParserTest {

	private UnwatchCommandParser ucp;

	@Before
	public void setUp() {
		ucp = new UnwatchCommandParser();
	}

	@Test
	public void testParseWords() {
		ucp.parseWords(new String[] {"UNWATCH", "http://bit.ly/wLewii"});
		assertTrue(true);
	}
	
	@Test(expected = InvalidCommandException.class)
	public void parseFailure() {
		ucp.parseWords(new String[] {"UNWATCH"});
	}

	@Test
	public void testGetFormatMessages() {
		assertArrayEquals(new String[] {
				"UNWATCH <shortened_url>",
				"     shortened_url - an URL that has been shortened by bit.ly",
			}, ucp.getFormatMessages());
	}

}
