import java.util.Scanner;

public class E0400
{
	public static void main (String[] args)
	{
		int opcion=0;
		double saldo=200000;
		double movimiento=0;
		String nombre = "José Mercado";
		Scanner lector = new Scanner(System.in);

		do {
			System.out.println("""
				********************
				Cliente: %s
				Saldo: %s
				********************
			""".formatted(nombre, saldo));

			System.out.println("""

				1.- Consultar saldo
				2.- Retirar
				3.- Depositar
				0.- Salir
			""");

			opcion = lector.nextInt();
			switch( opcion ){
				case 1:
					System.out.println("Saldo disponible: " + saldo + "\n");
					break;
				case 2:
					System.out.print("Suma a retirar: ");
					movimiento = lector.nextInt();
					if ( saldo - movimiento >= 0 ){
						saldo -= movimiento;
					} else {
						System.out.println("Fondos insuficientes");
					}
					break;
				case 3:
					System.out.print("Suma a depositar: ");
					movimiento = lector.nextInt();
					saldo += movimiento; 
					break;
				case 0:
					System.out.println("Retire su tarjeta");
					break;
			}
		} while ( opcion != 0 );
		lector.close();
	}
}
