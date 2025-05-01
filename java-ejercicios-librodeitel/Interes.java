// Fig. 5.6: Interes.java
// Cálculo del interés compuesto con for.
public class Interes
{
	public static void main(String[] args)
	{
		double monto; // monto depositado al final de cada año
		double principal = 1000.0; // monto inicial antes de los intereses
		double tasa = 0.05; // tasa de interés
		// muestra los encabezados
		System.out.printf(“%s%20s%n”, “Anio”, “Monto en deposito”);
		// calcula el monto en depósito para cada uno de diez años
		for (int anio = 1; anio <= 10; ++anio)
		{
			// calcula el nuevo monto para el año especificado
			monto = principal * Math.pow(1.0 + tasa, anio);
			// muestra el año y el monto
			System.out.printf(“%4d%,20.2f%n”, anio, monto);
		}
	}
} // fin de la clase Interes

