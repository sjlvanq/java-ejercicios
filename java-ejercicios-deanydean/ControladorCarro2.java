/**************************************************************
 * ControladorCarro2.java
 * Dean & Dean
 *
 * Esta clase demuestra el controlador de la clase Carro2.
 **************************************************************/
public class ControladorCarro2
{
	public static void main(String[] args)
	{
		Carro2 carroNathan = new Carro2();
		Carro2 carroNick = new Carro2();
		carroNathan.setMarca("Audi");
		carroNathan.setAnio(1998);
		carroNathan.setColor("verde");
		carroNick.setMarca("Audi");
		carroNick.setAnio(1998);
		carroNick.setColor("verde");
		if (carroNathan.equals(carroNick))
		{
			System.out.println("Los carros tienen características idénticas.");
		}
	} // fin de main
} // fin de clase ControladorCarro2
