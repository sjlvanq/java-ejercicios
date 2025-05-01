// Ejercicio 4.25: Misterio2.java
public class Misterio2
{
	public static void main(String[] args)
	{
		int cuenta = 1;
		while (cuenta <= 10)
		{
			System.out.println(cuenta % 2 == 1 ? "****" : "++++++++");
			++cuenta;
		}
	}
} // fin de la clase Misterio2

