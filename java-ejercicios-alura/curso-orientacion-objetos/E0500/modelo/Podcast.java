package modelo;

import modelo.enums.Categoria;

public class Podcast extends Audio {
	//private int episodio;
	
	public Podcast(String titulo, Categoria categoria) {
		super(titulo, categoria);
	}
	
	@Override
	public String toString() {
		return "Podcast\t(Vistas: %s)\t---\tCategoría: %s\tTítulo %s".formatted(this.getReproducciones(), this.getCategoria().getFriendlyName(), this.getTitulo());
	}
	
}
