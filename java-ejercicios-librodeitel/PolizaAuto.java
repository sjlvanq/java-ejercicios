// Fig. 5.11: PolizaAuto.java
// Clase que representa una póliza de seguro de automóvil.
public class PolizaAuto
{
	private int numeroCuenta; // número de cuenta de la póliza
	private String marcaYModelo; // auto al que se aplica la póliza
	private String estado; // abreviación del estado en dos letras
	// constructor
	public PolizaAuto(int numeroCuenta, String marcaYModelo, String estado)
	{
		this.numeroCuenta = numeroCuenta;
		this.marcaYModelo = marcaYModelo;
		this.estado = estado;
	}
	// establece el numeroCuenta
	public void establecerNumeroCuenta(int numeroCuenta)
	{
		this.numeroCuenta = numeroCuenta;
	}
	// devuelve el numeroCuenta
	public int obtenerNumeroCuenta()
	{
		return numeroCuenta;
	}
	// establece la marcaYModelo
	public void establecerMarcaYModelo(String marcaYModelo)
	{
		this.marcaYModelo = marcaYModelo;
	}
	// devuelve la marcaYModelo
	public String obtenerMarcaYModelo()
	{
		return marcaYModelo;
	}
	// establece el estado
	public void establecerEstado(String estado)
	{
		this.estado = estado;
	}
	// devuelve el estado
	public String obtenerEstado()
	{
		return estado;
	}
	// método predicado que devuelve si el estado tiene seguro sin culpa
	public boolean esEstadoSinCulpa()
	{
		boolean estadoSinCulpa;
		// determina si el estado tiene seguro de auto sin culpa
		switch (obtenerEstado()) // obtiene la abreviación del estado del objeto
			PolizaAuto
			{
				case “MA”: case “NJ”: case “NY”: case “PA”:
					estadoSinCulpa = true;
					break;
				default:
					estadoSinCulpa = false;
					break;
			}
		return estadoSinCulpa;
	}
} // fin de la clase PolizaAuto

