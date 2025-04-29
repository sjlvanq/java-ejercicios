/************************************************************
* ControladorPuertaCochera.java
* Dean & Dean
*
* Este programa simula la instalación y prueba.
************************************************************/
import java.util.Scanner;
public class ControladorPuertaCochera
{
public static void main(String[] args)
{
SistemaPuertaCochera sistema;
Scanner stdIn = new Scanner(System.in);
// Instala sistema
sistema = new SistemaPuertaCochera();
// Prueba sistema
System.out.print("Introduzca el número de operaciones: ");
sistema.ejecutar(stdIn.nextInt());
} // fin de main
} // fin de clase ControladorPuertaCochera
