// Fig. 8.3: PruebaAccesoMiembros.java
// Los miembros private de la clase Tiempo1 no son accesibles.
public class PruebaAccesoMiembros
{
	public static void main(String[] args)
	{
		Tiempo1 tiempo = new Tiempo1(); // crea e inicializa un objeto Tiempo1
		tiempo.hora = 7;
		// error: hora tiene acceso privado en Tiempo1
		tiempo.minuto = 15; // error: minuto tiene acceso privado en Tiempo1
		tiempo.segundo = 30; // error: segundo tiene acceso privado en Tiempo1
	}
} // fin de la clase PruebaAccesoMiembros

