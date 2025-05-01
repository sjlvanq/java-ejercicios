// Fig. 8.15: PruebaDatosPaquete.java
// Los miembros con acceso a nivel de paquete de una clase son accesibles
// para las demás clases en el mismo paquete.
public class PruebaDatosPaquete
{
	public static void main(String[] args)
	{
		DatosPaquete datosPaquete = new DatosPaquete();
		// imprime la representación String de datosPaquete
		System.out.printf("Despues de instanciar:%n%s%n", datosPaquete);
		// modifica los datos con acceso a nivel de paquete en el objeto datosPaquete
		datosPaquete.numero = 77;
		datosPaquete.cadena = "Adios";
		// imprime la representación String de datosPaquete
		System.out.printf("%nDespues de modificar valores:%n%s%n", datosPaquete);
	}
} // fin de la clase PruebaDatosPaquete

// clase con variables de instancia con acceso a nivel de paquete
class DatosPaquete
{
	int numero; // variable de instancia con acceso a nivel de paquete
	String cadena; // variable de instancia con acceso a nivel de paquete
	// constructor
	public DatosPaquete()
	{
		numero = 0;
		cadena = "Hola";
	}
	// devuelve la representación String del objeto DatosPaquete
	public String toString()
	{
		return String.format("numero: %d; cadena: %s", numero, cadena);
	}
} // fin de la clase DatosPaquete

// Interes.java
// Cálculos del interés compuesto con BigDecimal.
import java.math.BigDecimal;
import java.text.NumberFormat;
public class Interes
{
	public static void main(String args[])
	{
		// monto principal inicial antes de los intereses
		BigDecimal principal = BigDecimal.valueOf(1000.0);
		BigDecimal tasa = BigDecimal.valueOf(0.05); // tasa de interés
		// muestra los encabezados
		System.out.printf("%s%20s%n", "Anio", "Monto en deposito");
		// calcula el monto en depósito para cada uno de diez años
		for (int anio = 1; anio <= 10; ++anio)
		{
			// calcula el nuevo monto para el año especificado
			BigDecimal monto =
				principal.multiply(tasa.add(BigDecimal.ONE).pow(anio));
			// muestra el año y el monto
			System.out.printf("%4d%20s%n", anio,
					NumberFormat.getCurrencyInstance().format(monto)
					NumberFormat.getCurrencyInstance().format(monto));
		}
	}
} // fin de la clase Interes

