import java.util.Scanner;
import java.util.Random;

/*
 * Crea un programa que simule un juego de adivinanzas. 
 * El programa debe generar un número aleatorio entre 0 
 * y 100, y pedir al usuario que intente adivinar ese 
 * número en un máximo de 5 intentos. En cada intento, 
 * el programa debe informar si el número ingresado por 
 * el usuario es mayor o menor que el número generado.
 *
 * Consejos:
 * Para generar un número aleatorio en Java: new Random().nextInt(100);
 * Utiliza el Scanner para obtener los datos del usuario.
 * Utiliza una variable para contar los intentos.
 * Utiliza un bucle para controlar los intentos.
 * Utiliza la instrucción ‘break;’ para salir del bucle.
 *
 */

public class E0312
{
	public static void main (String[] args)
	{
		int numeroJugado;
		int numeroSecreto;
		int intentos;

		String opcionMenu;
		String menorMayor;

		Scanner crupier = new Scanner(System.in);
		Random ruleta = new Random();
		
		System.out.println("Juego del número secreto");
		do {
			System.out.println("Crupier: -He pensado un número entre 0 y 9");
			numeroSecreto = ruleta.nextInt(10);
			System.out.printf("%s",numeroSecreto);
			intentos = 3;
			do {
				System.out.print("Tú: -¿Acaso el ___ ?\rTú: -¿Acaso el _");
				numeroJugado = crupier.nextInt();
				
				if ( numeroJugado == numeroSecreto ) {
					System.out.println("Crupier: -¡Lo has adivinado!");
					break;
				} 
				
				menorMayor = numeroSecreto < numeroJugado ? "menor" : "mayor";
				System.out.printf("Crupier: -Es un número %s que %s. ", menorMayor, numeroJugado);
				System.out.printf("Te quedan %s intentos.\n", intentos-1);

				intentos--;
			} while ( intentos > 0 );
			if(intentos==3){System.out.printf("Crupier: -El número era el %s\n", numeroSecreto);}
			System.out.printf("¿Juegas de nuevo? (s/n): ");
			crupier.nextLine();
			opcionMenu = crupier.nextLine();
		} while ( !opcionMenu.equals("n") && !opcionMenu.equals("N"));
		crupier.close();
		System.out.print("\n");
	}
}
