// Fig. 5.2: ContadorFor.java
// Repetición controlada con contador, con la instrucción de repetición for.
public class ContadorFor
{
	public static void main(String[] args)
	{
		// el encabezado de la instrucción for incluye la inicialización,
		// la condición de continuación de ciclo y el incremento
		for (int contador = 1; contador <= 10; contador++)
			System.out.printf("%d ", contador);
		System.out.println();
	}
} // fin de la clase ContadorFor

