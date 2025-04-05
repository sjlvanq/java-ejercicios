import java.util.Scanner;
public class E0213
{
	public static void main (String[] args)
	{
		String seleccion;
		String inputLine;
		int temperatura;
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("""
		
			CONVERSOR DE TEMPERATURAS
			^^^^^^^^^^^^^^^^^^^^^^^^^^
			Seleccione una opción:
			
			    1. Celsius a Farenheit
			    2. Fahrenheit a Celsius
			    
			""");
		do {
			System.out.print("(1/2) --> ");
			seleccion = String.valueOf(entrada.nextLine());
		} while(!seleccion.equals("1") && !seleccion.equals("2"));
		
		System.out.print("\nTemperatura --> ");
		
		inputLine = entrada.nextLine();
		inputLine = inputLine.replaceAll("[^0-9]","");
		if (inputLine.length()<=0){return;}//else{temperatura = Integer.valueOf(inputLine);}
		temperatura = Integer.valueOf(inputLine);

		if ( seleccion.equals("1")) {
			System.out.println("\nSALIDA: " + ((temperatura * 1.8) + 32));
		} else {
			System.out.println("\nno implementado");
		}
	}
}
