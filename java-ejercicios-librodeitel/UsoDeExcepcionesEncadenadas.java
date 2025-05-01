// Fig. 11.7: UsoDeExcepcionesEncadenadas.java
// Las excepciones encadenadas.
public class UsoDeExcepcionesEncadenadas
{
	public static void main(String[] args)
	{
		try
		{
			metodo1();
		}
		catch (Exception excepcion) // excepciones lanzadas desde metodo1
		{
			excepcion.printStackTrace();
		}
	}
	// llama a metodo2; lanza las excepciones de vuelta a main
	public static void metodo1() throws Exception
	{
		try
		{
			metodo2();
		} // fin de try
		catch (Exception excepcion ) // excepción lanzada desde metodo2
		{
			throw new Exception(“La excepcion se lanzo en metodo1”, excepcion);
		}
	}
	// llama a metodo3; lanza las excepciones de vuelta a metodo1
	public static void metodo2() throws Exception
	{
		try
		{
			metodo3();
		}
		catch (Exception excepcion) // excepción lanzada desde metodo3
		{
			throw new Exception(“La excepcion se lanzo en metodo2”, excepcion);
		}
	}
	// lanza excepción Exception de vuelta a metodo2
	public static void metodo3() throws Exception
	{
		throw new Exception(“La excepcion se lanzo en metodo3”);
	}
} // fin de la clase UsoDeExcepcionesEncadenadas

