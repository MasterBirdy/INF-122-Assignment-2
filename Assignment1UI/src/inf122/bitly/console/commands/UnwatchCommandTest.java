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

public class UnwatchCommandTest {
	
	private BitlyContext bc;
	private UnwatchCommand uc;
	private UnwatchCommand uc2;
	
	@Before
	public void setUpContext() {
		bc = new BitlyContext(new MockTextReaderTrue());
		uc = new UnwatchCommand("http://bit.ly/wLewii");
		uc2 = new UnwatchCommand("http://bit.ly/wfciv");
		try {
			bc.login("abc", "123");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		bc.watch(new Observer("http://bit.ly/wLewii", new MockXMLReader()));
	}

	@Test
	public void testExecute() {
		assertEquals("URL has been successfully removed", uc.execute(bc).getConsoleOutput().get(0));
	}
	
	@Test
	public void testExecute2() {
		assertEquals("URL was not removed", uc2.execute(bc).getConsoleOutput().get(0));
	}

}
