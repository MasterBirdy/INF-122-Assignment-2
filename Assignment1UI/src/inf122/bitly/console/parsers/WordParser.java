// WordParser.java
//
// Informatics 122 Winter 2012
// Assignment #1: Who's Gonna Ride Your Wild Horses?
//
// Interface for objects that parse single words and return a value
// of some type.  It is expected that these throw exceptions deriving
// from RuntimeException when they fail.

package inf122.bitly.console.parsers;


interface WordParser<T>
{
	T parse(String word);
}
