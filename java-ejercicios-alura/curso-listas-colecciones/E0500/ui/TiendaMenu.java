package ui;
import models.Tienda;
import models.Producto;

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
				Producto producto = tienda.getProductoAt(i-1);
				sb.append(
						"%d.\t%s ($%d)%n"
							.formatted( 
								i, producto.getNombre(), 
								producto.getPrecio()
							));
				sb.append("\t%s%n".formatted(tienda.getProductoAt(i-1).getDescripcion()));
			}
		}
		sb.append("\n");
		return sb.toString();
	}
	
}
