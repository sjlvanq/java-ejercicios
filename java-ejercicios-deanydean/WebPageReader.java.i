/*************************************************************
 * WebPageReader.java
 * Dean & Dean
 *
 * Esto lee una página en la red.
 *************************************************************/
import java.util.Scanner;
import java.io.BufferedReader;
public class WebPageReader
{
        BufferedReader reader;
        public WebPageReader(String webAddress)
        {
                URL url = new URL(webAddress);
                URLConnection connection = url.openConnection();
                InputStream in = connection.getInputStream();
                reader = new BufferedReader(new InputStreamReader(in));
        } // end constructor
        //**********************************************************
        public String readLine()
        {
                return reader.readLine();


        } // end readLine
        //**********************************************************
        public static void main(String[] args)
        {
                Scanner stdIn = new Scanner(System.in);
                String url, line;
                System.out.print("Introduzca una dirección URL completa: ");
                url = stdIn.nextLine();
                WebPageReader wpr = new WebPageReader(url);
                while ((line = wpr.readLine()) != null)
                {
                        System.out.println(line);
                }
        } // end main
} // end WebPageReader
