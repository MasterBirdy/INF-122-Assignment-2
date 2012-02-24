package inf122.bitly.console.reader;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.MalformedURLException;

import inf122.bitly.console.state.BitlyContext;

import org.junit.Before;
import org.junit.Test;

public class TextReaderTest {

	private TextReader tr;
	private TextReader tr2;
	private BitlyContext bc;
	
	@Before
	public void createTextReader()
	{
		 tr = new TextReader();
		 tr2 = new TextReader();
		 bc = new BitlyContext(tr2);
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
	
	@Test
	public void testLogin() {
		assertTrue(tr.login("masterbirdy", "R_fa9db7ada9c06caf5ca2301ff479b3d0"));
	}
	
	@Test
	public void testLogin2() {
		assertEquals(false, tr.login("masterbirdy", "R_fa9db7fds9c06caf5ca2301ff479b3d0"));
	}

	@Test
	public void testShorten() {
		assertEquals("http://bitly.com/wLewii", bc.shorten("http://tf2pug.heroku.com/topics/3073"));
	}

	@Test
	public void testExpand() {
		assertEquals("http://tf2pug.heroku.com/topics/3170-intel-norcal-lanfest-part-two",bc.expand("http://bit.ly/xIfb7d"));
	}

}
