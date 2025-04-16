package models;

public class Producto implements Comparable<Producto>{
	private int precio;
	private String nombre;
	private String descripcion;
	
	public Producto(String nombre, String descripcion, int precio) {
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
