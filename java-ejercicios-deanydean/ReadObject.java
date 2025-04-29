/**************************************************************
* ReadObject.java
* Dean & Dean
*
* Esto lee dos objetos desde un archivo binario.
**************************************************************/
import java.io.*;
import java.util.Scanner;
public class ReadObject
{
public static void main(String[] args)
{
Scanner stdIn = new Scanner(System.in);
ObjectInputStream fileIn = null;
TestObject testObject;
System.out.print("Introduzca el nombre del archivo: ");
try
{

fileIn = new ObjectInputStream(
new FileInputStream(stdIn.nextLine()));

testObject = (TestObject) fileIn.readObject();
testObject.display();
testObject = (TestObject) fileIn.readObject();
testObject.display();
fileIn.close();
}
catch (IOException e)
{
System.out.println("IO Error: " + e.getMessage());
}
catch (ClassNotFoundException e)
{
System.out.println("ClassNotFound " + e.getMessage());
}
} // end main
} // end ReadObject class
