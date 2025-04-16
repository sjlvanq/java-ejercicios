import java.util.Scanner;

import models.Monedero;
import models.Tienda;
import ui.TiendaPrompt;
import ui.MonederoResumen;
import ui.TiendaMenu;

public class Principal {

	public static void main(String[] args) {
		Monedero.setMonedas(14);
		Scanner lector = new Scanner(System.in);
		
		Tienda herreria = new Tienda("Herrería","Hay cosas de metal, un enano en overol te observa");
		herreria.addProducto("Martillo","Un pesado martillo.", 6);
		herreria.addProducto("Hacha","Ideal para romper vidrios durante un incendio.", 4);
		herreria.addProducto("Guadaña","Mantén tu jardín libre de vivos.", 5);
		
		while(Monedero.meAlcanzaParaAlgo(herreria) && !herreria.isFundida()) {
			System.out.print("\n");
			TiendaMenu.mostrar(herreria);
			MonederoResumen.mostrar();
			TiendaPrompt.mostrar(herreria);
			herreria.vender(TiendaPrompt.leer(lector)-1);
			
		}
				
		System.out.println("\n¡Gracias por su compra!");
		MonederoResumen.mostrar();
		
	}

}
