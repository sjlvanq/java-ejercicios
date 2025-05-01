// Fig. 2.15: Comparacion.java
// Compara enteros utilizando instrucciones if, operadores relacionales
// y de igualdad.
import java.util.Scanner; // el programa utiliza la clase Scanner
public class Comparacion
{
	// el método main empieza la ejecución de la aplicación en Java
	public static void main(String[] args)
	{
		// crea objeto Scanner para obtener la entrada de la ventana de comandos
		Scanner entrada = new Scanner(System.in);
		int numero1; // primer número a comparar
		int numero2; // segundo número a comparar
		System.out.print(“Escriba el primer entero: ”); // indicador
		numero1 = entrada.nextInt(); // lee el primer número del usuario
		System.out.print(“Escriba el segundo entero: ”); // indicador
		numero2 = entrada.nextInt(); // lee el segundo número del usuario
		if (numero1 == numero2)
			System.out.printf(“%d == %d%n”, numero1, numero2);
		if (numero1 != numero2)
			System.out.printf(“%d != %d%n”, numero1, numero2);
		if (numero1 < numero2)
			System.out.printf(“%d < %d%n”, numero1, numero2);

		Fig. 2.15 冷 Comparación de enteros mediante instrucciones if, operadores de igualdad y relacionales
			(parte 1 de 2).

			M02_DEITEL_COMO-PROGRAMAR-EN-JAVA_SE_10ED_C2_034-068_3802-1.indd 55

			5/4/16 11:27 AM

			56

			Capítulo 2 Introducción a las aplicaciones en Java: entrada/salida y operadores

			31
			32
			if (numero1 > numero2)
				33
					System.out.printf(“%d > %d%n”, numero1, numero2);
		34
			35
			if (numero1 <= numero2)
				36
					System.out.printf(“%d <= %d%n”, numero1, numero2);
		37
			38
			if (numero1 >= numero2)
				39
					System.out.printf(“%d >= %d%n”, numero1, numero2);
		40
	} // fin del método main
	41 } // fin de la clase Comparacion
