import java.util.Scanner;

public class E0305PruebaCuenta
{
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);

		E0305Cuenta miCuenta = new E0305Cuenta("Juancito Pérez");

		System.out.printf("El nombre inicial es: %s%n%n", miCuenta.obtenerNombre());
		System.out.println("Introduzca el nombre: ");
		String elNombre = entrada.nextLine();
		miCuenta.establecerNombre(elNombre);
		System.out.println();

		System.out.printf("El nombre en el objeto miCuenta es:%n%s%n",
				miCuenta.obtenerNombre());
	}
}


