// Fig. 5.13: PruebaBreak.java
// La instrucción break para salir de una instrucción for.
public class PruebaBreak
{
	public static void main(String[] args)
	{
		int cuenta; // la variable de control también se usa cuando termina el
		ciclo
			for (cuenta = 1; cuenta <= 10; cuenta++) // itera 10 veces
			{
				if ( cuenta == 5 )
					break; // termina el ciclo si cuenta es 5
				System.out.printf("%d ", cuenta);
			}
		System.out.printf("%nSalio del ciclo en cuenta = %d%n", cuenta);
	}
} // fin de la clase PruebaBreak

