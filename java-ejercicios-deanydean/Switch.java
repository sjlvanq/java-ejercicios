/*********************************************************************
* Switch.java
* Dean & Dean
*
* Esta clase modela interruptores.
*********************************************************************/
import java.util.Scanner;
public class Switch
{
public final boolean NORMALMENTE_ABIERTO;
public String uso;
private Controlador control;

// presion hace conexion
// papel en el sistema

//******************************************************************
public Switch(
boolean normalmenteAbierto, Controlador control, String uso)
{
this.NORMALMENTE_ABIERTO = normalmenteAbierto;
this.control = control;
this.uso = uso;
} // fin de constructor
//******************************************************************
public void presionar()
{
System.out.print(this.uso + " interruptor presionado. ");
control.accionEvento();
} // fin de presion
} // fin de la clase Switch
