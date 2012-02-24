package inf122.bitly.console.reader;

import static org.junit.Assert.*;
import inf122.bitly.console.state.BitlyContext;

import java.io.IOException;
import java.net.MalformedURLException;

import org.junit.Before;
import org.junit.Test;

public class XMLReaderTest {
	
	private XMLReader xr;
	private BitlyContext bc;
	
	@Before
	public void createTextReader()
	{
		 xr = new XMLReader();
		 bc = new BitlyContext(new MockTextReaderTrue());
		 try {
			bc.login("masterbirdy", "R_fa9db7ada9c06caf5ca2301ff479b3d0");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//
	@Test
	public void testParseHour() {
		assertEquals(0, xr.parseHour("http://bit.ly/wLewii"));
	}

	// at the time I am testing this, http://bit.ly/wLewii gave an answer of 6. This changes for the week, however
	@Test
	public void testParseWeek() {
		assertEquals(6, xr.parseWeek("http://bit.ly/wLewii"));
	}

}
