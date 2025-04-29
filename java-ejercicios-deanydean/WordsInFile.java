/*************************************************************
* WordsInFile.java
* Dean & Dean
*
* Esto cuenta las palabras en un archivo de texto.
*************************************************************/
import java.io.*;
import java.util.*;
public class WordsInFile
{
public static void main(String[] args)
{
Scanner stdIn = new Scanner(System.in);
Scanner fileIn;
int numWords = 0;
try
{
//<fragment>
} // end try
catch (FileNotFoundException e)
{
System.out.println("Nombre de archivo inválido.");
}
catch (Exception e)
{
System.out.println("Error de lectura desde el archivo.");
}
} // end main
} // end WordsInFile class
