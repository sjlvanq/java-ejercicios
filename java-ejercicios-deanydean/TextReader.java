/*************************************************************
* TextReader.java
* Dean & Dean
*
* This reads a line of text from a text file.
*************************************************************/
import java.util.Scanner;
import java.io.FileNotFoundException;

public class TextReader
{
public static void main(String[] args)
{
//File file = <fragment>;
Scanner fileIn;
try
{
//fileIn = <fragment>;
System.out.println(fileIn.nextLine());
//<fragment>
// close the file
}
catch (FileNotFoundException e)
{
System.out.println(e.getMessage());
}
} // end main
} // end TextReader class
