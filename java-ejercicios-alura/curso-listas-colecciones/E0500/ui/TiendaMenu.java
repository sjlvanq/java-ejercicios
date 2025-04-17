package ui;
import models.Tienda;

public class TiendaMenu { //implements PantallaImprimible {
	
	public static String construir(Tienda tienda) {
	    StringBuilder sb = new StringBuilder();
		sb.append("_____ %s _____%n".formatted(tienda.getNombre()));
		sb.append("%s%n%n".formatted(tienda.getDescripcion()));
		// Notifica fañta de stock
		if(tienda.isFundida()) {
			sb.append("No quedan productos en la tienda%n");
		} else {
			// Imprime lista de productos con precio
			for(int i=1; i<=tienda.countProductos(); i++) {
				sb.append(
						"%d.\t%s ($%d)%n"
							.formatted( 
								i, tienda.getProductoAt(i-1).getNombre(), 
								tienda.getProductoAt(i-1).getPrecio()
							));
				sb.append("\t%s%n".formatted(tienda.getProductoAt(i-1).getDescripcion()));
			}
		}
		sb.append("\n");
		return sb.toString();
	}
	
	@Deprecated
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
