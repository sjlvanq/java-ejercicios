/*************************************************************
 * TextWriter.java
 * Dean & Dean
 *
 * Esto escribe dos líneas de texto hacia un archivo de texto.
 *************************************************************/
//<fragment>
public class TextWriter
{
        public static void main(String[] args)
        {
                String[] churchill =
                {"Antes del Alamein nunca habíamos tenido una victoria.",
                        "Después del Alamein nunca tuvimos una derrota."};
                PrintWriter fileOut;
                try
                {
                        //<fragment>
                        for (String line : churchill)
                        {
                                //<fragment>
                        }
                        //<fragment>
                }
                catch (FileNotFoundException e)
                {
                        System.out.println(e.getMessage());
                }
        } // end main
} // end TextWriter class
