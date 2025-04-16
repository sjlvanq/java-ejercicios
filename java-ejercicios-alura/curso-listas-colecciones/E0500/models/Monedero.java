package models;

import java.util.ArrayList;

public class Monedero {
	private static int monedas;
	private static ArrayList<Producto> compras = new ArrayList<>();
	
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
	
	public static ArrayList<Producto> getCompras(){
		return compras;
	}

	public static boolean meAlcanzaParaAlgo(Tienda tienda) {
		return tienda.getProductos().stream().anyMatch(
				prod -> prod.getPrecio() <= monedas);
	}
	
}
