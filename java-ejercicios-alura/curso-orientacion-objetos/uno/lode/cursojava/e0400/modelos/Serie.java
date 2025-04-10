package uno.lode.cursojava.e0400.modelos;
import uno.lode.cursojava.e0400.calculos.Clasificable;

public class Serie extends Titulo implements Clasificable
{
	int temporadas;
	int episodiosXTemporada;
	int duracionEpisodios;

	public int getDuracionEpisodios() {
		return this.duracionEpisodios;
	}
	public void setDuracionEpisodios( int duracionEpisodios ) {
		this.duracionEpisodios = duracionEpisodios;
	}
	public void setEpisodiosXTemporada( int episodiosXTemporada ) {
		this.episodiosXTemporada = episodiosXTemporada;
	}
	public void setTemporadas( int temporadas ) {
		this.temporadas = temporadas;
	}
	public int getEpisodiosXTemporada() {
		return this.episodiosXTemporada;
	}
	public int getTemporadas() {
		return this.temporadas;
	}
	public int getClasificacion(){
		return 0;
	}
}
