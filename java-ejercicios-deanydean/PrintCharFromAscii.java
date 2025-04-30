/***************************************************************
 * PrintCharFromAscii.java
 * Dean & Dean
 *
 * This illustrates manipulation of ASCII code values.
 ***************************************************************/
import java.util.*;
public class PrintCharFromAscii
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		int asciiValue; // user entered ASCII value
		char ch;
		// the asciiValue’s associated character
		char nextCh;
		// the character after ch in the ASCII table
		System.out.print("Enter an integer between 0 and 127: ");
		asciiValue = stdIn.nextInt();

		ch = (char) asciiValue;
		nextCh = (char) (asciiValue + 1); 
		System.out.println("Entered number: " + asciiValue);
		System.out.println("Associated character: " + ch);
		System.out.println("Next character: " + nextCh);
	} // end main
} // end class PrintCharFromAscii
