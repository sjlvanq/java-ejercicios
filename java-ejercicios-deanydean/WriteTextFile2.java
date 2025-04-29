/****************************************************************
* WriteTextFile2.java
* Dean & Dean
*
* Esto agrega datos en un archivo de texto existente.
****************************************************************/
import java.util.Scanner;
import java.io.*;
public class WriteTextFile2
{
public static void main(String[] args)
{
Scanner stdIn = new Scanner(System.in);
PrintWriter fileOut;
String text = "¡Hola, mundo!";
try
{
System.out.print("Introduzca el nombre del archivo: ");
fileOut =
new PrintWriter(new FileWriter(stdIn.nextLine(), true));
fileOut.println(text);
fileOut.close();
}
catch (IOException e)
{
System.out.println("IO: " + e.getMessage());
}
} // end main
} // end WriteTextFile2 class
