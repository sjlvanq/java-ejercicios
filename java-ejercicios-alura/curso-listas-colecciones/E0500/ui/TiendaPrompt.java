package ui;

import java.util.Scanner;

import models.Monedero;
import models.Tienda;
import util.UIFunctions;

public class TiendaPrompt { //implements PantallaImprimible {
	
	public static void mostrar(Tienda tienda) {
		System.out.print("<Te quedan %s monedas>%nElige una opción %s: "
			.formatted(
				Monedero.getMonedas(),
				UIFunctions.serializaOpciones(tienda.countProductos())
			)
		);
	}
	
	public static int leer(Scanner lector) {
		String inputLine = lector.nextLine();
		inputLine = inputLine.replaceAll("[^0-9]","");
		if (inputLine.length()<=0){return 0;}
		return Integer.valueOf(inputLine);
	}

}
