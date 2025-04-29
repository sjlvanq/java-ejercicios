/**************************************************************
* ControladorOpcionesAuto.java
* Dean & Dean
*
* Ésta para ejercicios de la clase AutoOptions.
**************************************************************/
import java.util.Scanner;
public class ControladorOpcionesAuto
{
public static void main(String[] args)
{
Scanner stdIn = new Scanner(System.in);
String serial;
OpcionesAuto auto = new OpcionesAuto();
System.out.print("Introduzca el numero de serie: ");
serial = stdIn.nextLine();
auto.especificarMotor(auto.setSerial(serial).especificarBastidor().especificarCarroceria().esAjustado());
auto.especificarTransmision();
auto.imprimirOpciones();
} // fin de main
} // fin de la clase ControladorOpcionesAuto
