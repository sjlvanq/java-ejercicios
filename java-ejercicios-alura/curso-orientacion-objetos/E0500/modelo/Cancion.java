package modelo;

import modelo.enums.Categoria;
import modelo.enums.Genero;

public class Cancion extends Audio {
	private Genero genero;
	
	public Cancion(String titulo, Genero genero) {
		super(titulo, Categoria.MUSICA);
		super.setTitulo(titulo);
		this.genero = genero;
	}
	
	public String getGenero() {
		return this.genero.getFriendlyName();
	}
	
	@Override
	public String toString() {
		return "Canción\t(Vistas: %s)\t---\tGénero: %-10s\tTítulo: %s".formatted(this.getReproducciones(), this.getGenero(), this.getTitulo());
	}
}
