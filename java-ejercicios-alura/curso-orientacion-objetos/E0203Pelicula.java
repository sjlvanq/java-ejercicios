public class E0203Pelicula
{
	String titulo;
	int anio;
	int duracion;
	boolean incluidaEnElPlan;
	private int sumatoriaPuntuaciones;
	private int cantidadPuntuaciones;

	void mostrarFichaTecnica()
	{
		System.out.println("""
			Título: %s
			Fecha de lanzamiento: %s
			Duración: %s
		""".formatted(titulo, anio, duracion));

	}

	void puntuar(int nota)
	{
		sumatoriaPuntuaciones += nota;
		cantidadPuntuaciones++;
	}

	double obtenerPuntaje()
	{
		return (sumatoriaPuntuaciones / cantidadPuntuaciones);
	}
	
	int obtenerCantidadPuntuaciones()
	{
		return this.cantidadPuntuaciones;
	}
}
