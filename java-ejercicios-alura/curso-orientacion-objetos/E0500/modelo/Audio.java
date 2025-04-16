package modelo;

import modelo.enums.Categoria;

public class Audio {
	private Categoria categoria;
	private String titulo;
	private int reproducciones;
	//private int reacciones;
	
	public Audio(String titulo, Categoria categoria) {
		this.titulo = titulo;
		this.categoria = categoria;
	}
		
	public void reproducir() {
		this.reproducciones++;
	}
	
	/*
	public void reaccionar() {
		this.reacciones++;
	}
	*/

	public Categoria getCategoria() {return categoria;}
	
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	public String getTitulo() {return titulo;}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public int getReproducciones() {return reproducciones;}
	
	//public int getReacciones() {return reacciones;}
	

}
