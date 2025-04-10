package uno.lode.cursojava.e0400.modelos;
import uno.lode.cursojava.e0400.calculos.Clasificable;

public class Episodio extends Titulo implements Clasificable
{
	private int numero;
	private String nombre;
	private Serie serie;

	public void setNombre( String nombre ) {
		this.nombre = nombre;
	}
	public void setNumero( int numero ) {
		this.numero = numero;
	}
	public void setSerie( Serie serie ) {
		this.serie = serie;
	}

	public String getNombre() {
		return this.nombre;
	}
	public int getNumero() {
		return this.numero;
	}
	public Serie getSerie() {
		return this.serie;
	}

	@Override
	public int getClasificacion(){
		// Regla diferente a Pelicula 
		if (visualizaciones > 100) {
			return 4;
		} else {
			return 2;
		}
	}
}
