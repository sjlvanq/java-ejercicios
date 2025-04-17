package models;

import java.util.List;
import java.util.ArrayList;

public class Monedero {
	private static int monedas;
	private static List<Producto> compras = new ArrayList<>();
	
	public static void comprar(Producto producto) {
		if(producto.getPrecio() <= Monedero.monedas) {
			monedas -= producto.getPrecio();
			compras.add(producto);
		}
	}	
	
	public static void setMonedas(int cantMonedas) {
		monedas = cantMonedas;
	}
	
	public static int getMonedas() {
		return monedas;
	}
	
	public static List<Producto> getCompras(){
		//return compras; // Devuelve referencia
		//return List.copyOf(compras); // Devuelve lista inmutable
		return new ArrayList<>(compras);
	}

	public static boolean meAlcanzaParaAlgo(Tienda tienda) {
		return tienda.getProductos().stream().anyMatch(
				prod -> prod.getPrecio() <= monedas);
	}
	
}
