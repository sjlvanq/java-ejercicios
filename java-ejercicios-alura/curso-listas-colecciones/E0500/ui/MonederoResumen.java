package ui;

import java.util.Collections;

import models.Monedero;
import models.Producto;

public class MonederoResumen { //implements PantallaImprimible {
	
	public static void mostrar() {
		if(Monedero.getCompras().size()==0) return;
		
		System.out.println("_____ Compras _____\n");
		Collections.sort(Monedero.getCompras());
		for (Producto compra : Monedero.getCompras()) {
			System.out.println("%s\t\t$%d".formatted(compra.getNombre(), compra.getPrecio()));
		}
		System.out.print("\n");
	}
}
