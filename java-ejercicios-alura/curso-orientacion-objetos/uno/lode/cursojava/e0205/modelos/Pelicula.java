package uno.lode.cursojava.e0205.modelos;

public class Pelicula
{
	private String titulo; // Especificador private
	private int anio; // Especificador private
	private int duracion; // Especificador private
	private boolean incluidaEnElPlan; // Especificador private
	private int sumatoriaPuntuaciones;
	private int cantidadPuntuaciones;

	public void mostrarFichaTecnica()
	// Especificador public es requerido
	{
		System.out.println("""
			Título: %s
			Fecha de lanzamiento: %s
			Duración: %s
		""".formatted(titulo, anio, duracion));

	}

	public void puntuar(int nota)
	// Especificador public es requerido
	{
		sumatoriaPuntuaciones += nota;
		cantidadPuntuaciones++;
	}

	public double obtenerPuntaje()
	// Especificador public es requerido
	{
		return (sumatoriaPuntuaciones / cantidadPuntuaciones);
	}
	
	public int obtenerCantidadPuntuaciones()
	{
		return this.cantidadPuntuaciones;
	}

	public int getAnio() {
		return this.anio;
	}

	public int getCantidadPuntuaciones() {
		return this.cantidadPuntuaciones;
	}

	public int getDuracion() {
		return this.duracion;
	}

	public boolean getIncluidaEnElPlan() {
		return this.incluidaEnElPlan;
	}

	public int getSumatoriaPuntuaciones() {
		return this.sumatoriaPuntuaciones;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setAnio( int anio ) {
		this.anio = anio;
	}

	public void setDuracion( int duracion ) {
		this.duracion = duracion;
	}

	public void setTitulo( String titulo ) {
		this.titulo = titulo;
	}
}
