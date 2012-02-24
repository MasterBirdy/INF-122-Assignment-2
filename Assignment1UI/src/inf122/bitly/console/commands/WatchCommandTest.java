package inf122.bitly.console.commands;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.MalformedURLException;

import inf122.bitly.console.reader.MockTextReaderTrue;
import inf122.bitly.console.reader.MockXMLReader;
import inf122.bitly.console.state.BitlyContext;
import inf122.bitly.console.watchlist.Observer;

import org.junit.Before;
import org.junit.Test;

public class WatchCommandTest {
	
	private BitlyContext bc;
	private BitlyContext bc2;
	private WatchCommand wc;
	
	@Before
	public void setUpContext() {
		bc = new BitlyContext(new MockTextReaderTrue());
		bc2 = new BitlyContext(new MockTextReaderTrue());
		wc = new WatchCommand("http://bit.ly/wLewii");
		try {
			bc.login("abc", "123");
			bc2.login("abc", "123");
			bc2.watch(new Observer("http://bit.ly/wLewii", new MockXMLReader()));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testExecute() {
		assertEquals("URL has been successfully added", wc.execute(bc).getConsoleOutput().get(0));
	}

	public void testExecute2() {
		assertEquals("URL was not added", wc.execute(bc2).getConsoleOutput().get(0));
	}
}
