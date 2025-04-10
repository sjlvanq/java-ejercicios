package uno.lode.cursojava.e0400.modelos;
import uno.lode.cursojava.e0400.calculos.Clasificable;

public class Pelicula extends Titulo implements Clasificable
{
	private String director;
	
	public String getDirector(){
		return this.director;
	}
	
	public void setDirector(String director){
		this.director = director;
	}
	
	@Override
	public int getClasificacion(){
		// Casting porque calculaMedia retorna double
		return (int) (obtenerPuntaje() / 2);
	}
}
