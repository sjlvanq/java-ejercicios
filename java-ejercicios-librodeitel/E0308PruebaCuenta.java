import java.util.Scanner;

public class E0308PruebaCuenta
{
	public static void main(String[] args)
	{
		E0308Cuenta cuenta1 = new E0308Cuenta("Juancito Pérez",234599.10);
		E0308Cuenta cuenta2 = new E0308Cuenta("Ramiro González", 40673208.25);

		System.out.printf("Saldo de %s: $%.2f%n",
				cuenta1.obtenerNombre(),cuenta1.obtenerSaldo());
		System.out.printf("Saldo de %s: $%.2f%n",
				cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());

		Scanner entrada = new Scanner(System.in);

		System.out.print("Escriba el monto a depositar para cuenta1: ");
		double montoDeposito = entrada.nextDouble();
		System.out.printf("Sumando %.2f al saldo de cuenta1%n%n",
				montoDeposito);
		cuenta1.depositar(montoDeposito);

		// muestra los saldos
		System.out.printf("Saldo de %s: %.2f%n",
				cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
		System.out.printf("Saldo de %s: %.2f%n",
				cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());

		System.out.print("Escriba el monto a depositar para cuenta2: ");
		montoDeposito = entrada.nextDouble();
		System.out.printf("Sumando %.2f al saldo de cuenta2%n%n",
				montoDeposito);
		cuenta2.depositar(montoDeposito);

		// muestra los saldos
		System.out.printf("Saldo de %s: %.2f%n",
				cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
		System.out.printf("Saldo de %s: %.2f%n",
				cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());

	}
}


