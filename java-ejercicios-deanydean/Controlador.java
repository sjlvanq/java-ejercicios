/*******************************************************************
 * Controlador.java
 * Dean & Dean
 *
 * Esta clase modela el controlador con sensores.
 ********************************************************************/
public class Controlador
{
	private SistemaPuertaCochera sistema;
	private int estado;
	// 0=abajo, 1=hacia arriba, 2=arriba, 3=hacia abajo
	private boolean direccionMotor = false;
	// true = go up
	//*****************************************************************
	public Controlador(SistemaPuertaCochera sistema, int estado)
	{
		this.sistema = sistema;
		this.estado = estado;
		if (estado < 2)
		{
			this.direccionMotor = true;
		}
	} // fin de constructor
	//*****************************************************************
	public void accionEvento()
	{
		this.estado++;
		this.estado %= 4;
		if (this.estado % 2 == 0)
		{
			this.direccionMotor = !this.direccionMotor;
		}
		sistema.setEstado(this.estado);
	} // fin accionEvento
} // fin de la clase Controlador
