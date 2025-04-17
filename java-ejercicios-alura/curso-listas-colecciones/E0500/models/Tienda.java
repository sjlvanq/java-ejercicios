package models;
import java.util.ArrayList;
import java.util.List;

import ui.TiendaMenu;

public class Tienda {
	final private String nombre;
	final private String descripcion;
	private ArrayList<Producto> productos;
	
	public Tienda(String nombre, String descripcion){
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.productos = new ArrayList<>();
	}

	public void addProducto(String nombre, String descripcion, int precio) {
		this.productos.add(new Producto(nombre, descripcion, precio));
	}
	
	public List<Producto> getProductos() {
		return List.copyOf(productos);
	}
	
	public Producto getProductoAt(int i) {
		return productos.get(i);
	}
	
	public int countProductos() {
		return productos.size();
	}
	
	public boolean isFundida() {
		return productos.size() == 0;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}

	public boolean vender(int itemIndex) {
		if(itemIndex >= 0 && itemIndex < productos.size())
		{
			if(Monedero.comprar(productos.get(itemIndex))) {
				this.productos.remove(itemIndex);
				return true;
			} else {
				System.out.println("No se pudo concretar la compra por falta de monedas");
				return false;
			}
		} 
		else {
			System.out.println("Índice de producto incorrecto\n");
			return false;
		}
	}
	
	@Override
	public String toString() {
		return TiendaMenu.construir(this);
	}
	
}
