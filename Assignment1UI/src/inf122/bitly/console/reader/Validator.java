package inf122.bitly.console.reader;

public class Validator {
	
	static public boolean validateShortURL(String s)
	{
		return (s.contains(BIT_LY) || s.contains(BITLY_COM) || s.contains(J_MP)); 
	}
	
	static final String BIT_LY = "http://bit.ly";
	static final String BITLY_COM = "http://bitly.com";
	static final String J_MP = "http://j.mp";

}
