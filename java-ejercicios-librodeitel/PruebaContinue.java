// Fig. 5.14: PruebaContinue.java
// Instrucción continue para terminar una iteración de una instrucción for.
public class PruebaContinue
{
	public static void main(String[] args)
	{
		for (int cuenta = 1; cuenta <= 10; cuenta++) // itera 10 veces
		{
			if (cuenta == 5)
				continue; // omite el resto del código en el ciclo si cuenta es 5
			System.out.printf(“%d ”, cuenta);
		}
		System.out.println(“%nSe uso continue para omitir imprimir 5%n”);
	} // fin de main
} // fin de la clase PruebaContinue

