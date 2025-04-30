/*************************************************************
 * Division2.java
 * Dean & Dean
 *
 * Esto intenta evitar la división entre cero.
 *************************************************************/
import java.util.Scanner;
public class Division2
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);

		double n;
		int d;
		System.out.print("Introduzca el numerador: ");
		n = stdIn.nextDouble();
		System.out.print("Introduzca el divisor: ");
		d = stdIn.nextInt();
		System.out.println(n / d);
	} // end main
} // end Division2 class
