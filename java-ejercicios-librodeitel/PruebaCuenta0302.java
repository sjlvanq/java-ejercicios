// Fig. 3.2: PruebaCuenta.java
// Crear y manipular un objeto Cuenta.
import java.util.Scanner;
public class PruebaCuenta
{
	public static void main(String[] args)
	{
		// crea un objeto Scanner para obtener la entrada desde el símbolo del sistema
		Scanner entrada = new Scanner(System.in);
		// crea un objeto Cuenta y lo asigna a miCuenta
		Cuenta miCuenta = new Cuenta();
		// muestra el valor inicial del nombre (null)
		System.out.printf("El nombre inicial es: %s%n%n", miCuenta.obtenerNombre());

		Fig. 3.2 冷 Creación y manipulación de un objeto Cuenta (parte 1 de 2).

			M03_DEITEL_COMO-PROGRAMAR-EN-JAVA_SE_10ED_C3_069-100_3802-1.indd 74

			5/4/16 11:27 AM

			3.2 Variables de instancia, métodos establecer y métodos obtener

			75

			18
			// pide y lee el nombre
			19
			System.out.println("Introduzca el nombre:");
		20
			String elNombre = entrada.nextLine(); // lee una línea de texto
		21
			miCuenta.establecerNombre(elNombre); // coloca elNombre en miCuenta
		22
			System.out.println(); // imprime una línea en blanco
		23
			24
			// muestra el nombre almacenado en el objeto miCuenta
			25
			System.out.printf("El nombre en el objeto miCuenta es:%n%s%n",
					26
					miCuenta.obtenerNombre());
		27
			7
	}
	28 } // fin de la clase PruebaCuenta
