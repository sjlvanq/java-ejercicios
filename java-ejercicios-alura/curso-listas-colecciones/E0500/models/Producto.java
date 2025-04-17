package models;

public class Producto implements Comparable<Producto>{
	final private int precio;
	final private String nombre;
	final private String descripcion;
	
	public Producto(String nombre, String descripcion, int precio) {
		if(precio <= 0) {
			throw new IllegalArgumentException(
					"(%s) El precio del producto no puede ser menor o igual a 0"
					.formatted(nombre));
		}
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}
	
	public int getPrecio() {
		return this.precio;
	}

	@Override
	public int compareTo(Producto otroProducto) {
		return Integer.compare(this.precio, otroProducto.precio);
	}
	
}
