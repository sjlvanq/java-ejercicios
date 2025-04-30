/*******************************************************
 * CreateNewFile.java
 * Dean & Dean
 *
 * Esto crea un nuevo archivo.
 *******************************************************/
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class CreateNewFile
{
        public static void main(String[] args)
        {
                Scanner stdIn = new Scanner(System.in);
                String fileName; // user-specified file name
                File file;
                System.out.print("Introduzca el archivo a crear: ");
                fileName = stdIn.nextLine();
                file = new File(fileName);
                if (file.exists())
                {
                        System.out.println("Lo siento, el archivo ya existe.");
                }
                else
                {
                        file.createNewFile();
                        System.out.println(fileName + " creado.");
                }
        } // end main
} // end CreateNewFile class
