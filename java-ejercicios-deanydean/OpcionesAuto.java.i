/************************************************************
* OpcionesAuto.java
* Dean & Dean
*
* Esta clase para opciones "custom" automóviles
*************************************************************/
import java.util.Scanner;
public class OpcionesAuto
{
private String serial;
// numero de serie de auto
private char bastidor = 'x';
// tipo de bastidor: A,B
private String carroceria = ""; // estilo de carroceria:
private int hp = 0;
// caballos de fuerza del motor: 85,
// transmission: false = manual, true = automatica
private boolean automatico = false;
//****************************************************************
public OpcionesAuto setSerial(String serial)
{
this.serial = serial;
return this;
} // fin de set Serial
//****************************************************************
public OpcionesAuto especificarBastidor()
{
Scanner stdIn = new Scanner(System.in);
while (this.bastidor != 'A' && this.bastidor != 'B')
{
System.out.print("Introduzca bastidor (A o B): ");
this.bastidor = stdIn.nextLine().charAt(0);
} // fin del while
return this;
} // fin de especificarBastidor
//****************************************************************
public OpcionesAuto especificarCarroceria()
{
Scanner stdIn = new Scanner(System.in);
while (!this.carroceria.equals("2-puertas")
&& !this.carroceria.equals("4-puertas"))
{
System.out.print(
"Introduzca (2-puertas o 4-puertas): ");
this.carroceria = stdIn.nextLine();
} // fin del while
return this;
} // fin de especificarCarroceria
//*********************************************************
public boolean esAjustado()
{
boolean ajustado = false;
if (this.bastidor == 'A' && this.carroceria.equals("4-puertas"))
{
ajustado = true;
}
return ajustado;
} // fin de esAjustado
//*********************************************************
public void especificarMotor(boolean ajustado)
{
Scanner stdIn = new Scanner(System.in);
if (ajustado)
{
while (this.cf != 85 && this.cf != 115)
{
System.out.print("Introduzca CF (85 o 115): ");
this.cf = stdIn.nextInt();
} // fin del while
}
else
{
while (this.cf != 85 && this.cf != 115 && this.cf != 165)
{
System.out.print("Introduzca CF (85, 115, 165): ");
this.cf = stdIn.nextInt();
} // fin del while
} // fin del else de ajustado
stdIn.nextLine(); // flush \r\n after nextInt
} // fin de especificarMotor
//*********************************************************
public void especificarTransmision()
{
Scanner stdIn = new Scanner(System.in);
System.out.print("Automatico (s/n?): ");
if (stdIn.nextLine().charAt(0) == 'y')
{
this.automatico = true;
}
} // fin de especificarTransmision
//***********************************************************
public void imprimirOpciones()
{
System.out.printf("# serial %s\n%s bastidor\n%s\n%-3d CF\n",
this.serial, this.bastidor, this.carroceria, this.cf);
if (automatico)
{
System.out.println(" automatico");
}
else
{
System.out.println("manual 4 velocidades");
}
} // fin de imprimirOpciones
} // fin clase OpcionesAuto
