package ui;

import java.util.Collections;
import java.util.List;

import models.Monedero;
import models.Producto;

public class MonederoResumen {
	
	public static String construir() {
		List<Producto> compras = Monedero.getCompras();
		if(compras.size()==0) return "";
		StringBuilder sb = new StringBuilder();
		
		sb.append("_____ Compras _____\n");
		Collections.sort(compras);
		for (Producto compra : compras) {
			sb.append("%s\t\t$%d%n".formatted(compra.getNombre(), compra.getPrecio()));
		}
		sb.append("\n");
		return sb.toString();
	}
	
	@Deprecated
	public static void mostrar() {
		System.out.print(MonederoResumen.construir());
	}
}
