/*******************************************************
* HTMLGenerator.java
* Dean & Dean
*
* Este programa copia el contenido de un archivo especificado
* por el usuario y lo pasa a un nuevo archivo generado por HTML.
*******************************************************/
import java.util.Scanner;
import java.io.*;
public class HTMLGenerator
{
public static void main(String[] args)
{
Scanner stdIn = new Scanner(System.in);
String filenameIn;
// nombre del archivo original
Scanner fileIn;
// conexión al archivo de entrada
int dotIndex;
// posición del punto en el nombre del archivo
String filenameOut;
// nombre del archivo HTML
PrintWriter fileOut; // conexión al archivo HTML
String line;
// línea desde el archivo de entrada
System.out.print("Introduzca el nombre del archivo: ");
filenameIn = stdIn.nextLine();
try
{
fileIn = new Scanner(new FileReader(filenameIn));
// Compose the new filename
dotIndex = filenameIn.lastIndexOf(".");
if (dotIndex == -1) // no dot found
{
filenameOut = filenameIn + ".html";
}
else // dot found
{
filenameOut =
filenameIn.substring(0, dotIndex) + ".html";
}
fileOut = new PrintWriter(filenameOut);

// La primera línea se usa para elementos del título y del encabezado.
line = fileIn.nextLine();
if (line == null)
{
System.out.println(filenameIn + " está vacío.");
}
else
{
// Write the top of the HTML page.
fileOut.println("<html>");
fileOut.println("<head>");
fileOut.println("<title>" + line + "</title>");
fileOut.println("</head>");
fileOut.println("<body>");
fileOut.println("<h1>" + line + "</h1>");
while (fileIn.hasNextLine())
{
line = fileIn.nextLine();
// Blank lines generate p tags.
if (line.isEmpty())
{
fileOut.println("<p>");
} // end if
else
{
fileOut.println(line);
}
} // end while
// Write ending HTML code.
fileOut.println("</body>");
fileOut.println("</html>");
} // end else
fileIn.close();
fileOut.close();
} // end try
catch (FileNotFoundException e)
{
System.out.println("Error: " + e.getMessage());
} // end catch
} // end main
} // end class HTMLGenerator
