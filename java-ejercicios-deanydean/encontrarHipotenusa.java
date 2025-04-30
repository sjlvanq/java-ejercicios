/******************************************************************
 * encontrarHipotenusa.java
 * Dean & Dean
 *
 * Este programa calcula la hipotenusa de un triángulo rectángulo.
 ******************************************************************/
import java.util.Scanner;
public class encontrarHipotenusa
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		double base;
		double altura;
		double hipotenusa;
		System.out.print("Introduzca la base del triángulo rectángulo: ");
		base = stdIn.nextDouble();
		System.out.print("Introduzca la altura del triángulo rectángulo: ");
		altura = stdIn.nextDouble();
		hipotenusa = Math.sqrt(base * base + altura * altura);
		System.out.println("Longitud de la hipotenusa = " + hipotenusa);
	} // fin del main
} // fin de la clase encontrarHipotenusa
