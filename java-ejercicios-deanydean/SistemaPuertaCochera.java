/********************************************************************
 * SistemaPuertaCochera.java
 * Dean & Dean
 *
 * Esta clase representa la puerta de una cochera.
 ********************************************************************/
import java.util.Scanner;
public class SistemaPuertaCochera
{
	private int estado;
	// 0=abajo, 1=hacia arriba, 2=arriba, 3=hacia abajo
	private Controlador control;
	private Switch switchSuperior;
	// interruptor de limite superior
	private Switch switchInferior;
	// interruptor de limite inferior
	private Switch boton;
	// boton de presion electronico
	//****************************************************************
	public SistemaPuertaCochera()
	{
		this.estado = 0;
		System.out.println("Puerta inicialmente hacia abajo.");
		this.control = new Controlador(this, this.estado);
		this.switchSuperior =
			new Switch(false, this.control, "Limite superior");
		this.switchInferior =
			new Switch(false, this.control, "Limite inferior");
		this.boton = new Switch(true, this.control, "Boton");
	} // end constructor
	//****************************************************************
	public void setEstado(int estado)
	{
		this.estado = estado;
	}
	//****************************************************************
	public void ejecutar(int pasos)
	{
		Scanner stdIn = new Scanner(System.in);
		char entrada;
		boolean correcto = false;
		for (int paso=0; paso<paso; paso++)
		{
			System.out.print(
					"Introduzca 'b' para botón o 'f' para interruptor final: ");
			do
			{
				entrada = stdIn.nextLine().charAt(0);
				if (entrada == 'b')
				{
					boton.presionar();
					switch (estado)
					{
						case 0: case 2:
							System.out.println("Botón presionado.");
							break;
						case 1:
							System.out.println("Moviendo hacia arriba.");
							break;
						case 3:
							System.out.println("Moviendo hacia abajo.");
					} // fin de switch
					correcto = true;
				}
				else
				{
					switch (estado)
					{
						case 1:
							switchSuperior.presionar();
							System.out.println("La puerta está arriba.");
							correcto = true;
							break;
						case 3:
							switchInferior.presionar();
							System.out.println("La puerta está abajo.");
							correcto = true;
							break;
						default:
							System.out.print("Ahora detenida. Introduzca 'b': ");
							correcto = false;
					} // fin de switch
				} // fin de if
			} while (!correcto);
		} // fin del for
	} // fin de ejecutar
} // fin de la clase SistemaPuertaCochera
