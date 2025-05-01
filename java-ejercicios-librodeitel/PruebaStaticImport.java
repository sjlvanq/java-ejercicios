// Fig. 8.14: PruebaStaticImport.java
// Uso de importación static para importar métodos de la clase Math.
import static java.lang.Math.*;
public class PruebaStaticImport
{
	public static void main(String[] args)
	{
		System.out.printf("sqrt(900.0) = %.1f%n", sqrt(900.0));
		System.out.printf("ceil(-9.8) = %.1f%n", ceil(-9.8));
		System.out.printf("E = %f%n", E);
		System.out.printf("PI = %f%n", PI);
	}
} // fin de la clase PruebaImportStatic

