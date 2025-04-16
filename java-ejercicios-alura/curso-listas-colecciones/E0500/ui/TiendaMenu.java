package ui;
import models.Tienda;

public class TiendaMenu { //implements PantallaImprimible {
	
	public static void mostrar(Tienda tienda) {
		System.out.println("_____ %s _____".formatted(tienda.getNombre()));
		System.out.println("%s%n".formatted(tienda.getDescripcion()));
		
		// Notifica fañta de stock
		if(tienda.isFundida()) {
			System.out.println("No quedan productos en la tienda");
		} else {
			// Imprime lista de productos con precio
			for(int i=1; i<=tienda.countProductos(); i++) {
				System.out.println(
						"%d.\t%s ($%d)"
							.formatted( 
								i, tienda.getProductoAt(i-1).getNombre(), 
								tienda.getProductoAt(i-1).getPrecio()
							));
				System.out.println("\t"+tienda.getProductoAt(i-1).getDescripcion());
			}
		}
		System.out.print("\n");
	}
}
