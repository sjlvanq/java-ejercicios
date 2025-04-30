/*************************************************************
 * Envoltorio.java
 * Dean & Dean
 *
 * Este programa pone en práctica el uso de números envoltorio primitivos.
 *************************************************************/
public class Envoltorio
{
	public static void main(String[] args)
	{
		double x = 44.5;
		double y = 44.5;
		Double xE = new Double(x);
		// el objeto x envoltorio
		Double yE = new Double(y);
		// el objeto y envoltorio
		System.out.println("objeto == objeto? " + (xE == yE));
		System.out.println("valor == valor? " +
				(xE.doubleValue() == yE.doubleValue()));
		System.out.println(
				"object.equals(object)? " + xE.equals(yE));
		System.out.println("objeto.compareTo(objeto)? " +
				xE.compareTo(yE));
		yE = new Double(y + 3.0);
		System.out.println("object.compareTo(largerObject)? " +
				xE.compareTo(yE));
		yE = new Double(Double.NEGATIVE_INFINITY);
		System.out.println("-infinito esInfinito()? " +
				yE.isInfinite());
	} // fin del main
} // fin de la clase Envoltorio
