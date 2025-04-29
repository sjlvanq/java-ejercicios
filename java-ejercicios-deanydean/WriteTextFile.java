/******************************************************
* WriteTextFile.java
* Dean & Dean
*
* Esto escribe una cadena en un archivo de texto.
******************************************************/
import java.util.Scanner;
import java.io.*;
public class WriteTextFile
{
public static void main(String[] args)
{
Scanner stdIn = new Scanner(System.in);
PrintWriter fileOut;
String text = "¡Hola, mundo!";
try
{
System.out.print("Introduzca el nombre del archivo: ");
fileOut = new PrintWriter(stdIn.nextLine());
fileOut.println(text);
fileOut.close();
}
catch (FileNotFoundException e)
{
System.out.println("Error: " + e.getMessage());
}
} // end main
} // end WriteTextFile class
