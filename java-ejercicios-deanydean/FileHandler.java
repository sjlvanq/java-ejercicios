/*************************************************************
 * FileHandler.java
 * Dean & Dean
 *
 * Esto almacena y recupera un objeto.
 *************************************************************/
import java.util.*;
import java.io.*;
public class FileHandler
{
	public static void write(Object object, String filename)
	{
		ObjectOutputStream fileOut;
		try
		{
		}
		catch (IOException e)
		{
			System.out.println(e.getMessage());
		}
	} // end write
	//**********************************************************
	public static Object read(String filename)
	{
		ObjectInputStream fileIn;
		Object object;
		try
		{
			//<provide code fragment here>
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			return new Object();
		}
	} // end read
} // end FileHandler class
