package inf122.bitly.console.watchlist;

import static org.junit.Assert.*;
import inf122.bitly.console.reader.MockXMLReader;

import org.junit.Before;
import org.junit.Test;

public class ObserverTest {

	private Observer testObserver;
	
	@Before
	public void createObserver()
	{
		testObserver = new Observer("http://j.mp/w2ea1h", new MockXMLReader());
	}
	
	@Test
	public void testHour()
	{
		assertEquals("5 clicks - http://j.mp/w2ea1h", testObserver.hour());
	}
	
	@Test
	public void testWeek()
	{
		assertEquals("6 clicks - http://j.mp/w2ea1h", testObserver.week());
	}

}
