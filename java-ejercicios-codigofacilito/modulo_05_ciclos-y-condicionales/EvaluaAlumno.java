/*
 * Mostrar en consola el mensaje de "Aprobado" en caso la calificación de un 
 * alumno sea mayor igual a 70, en caso contrario mostrar el mensaje 
 * "Reprobado".
 */

import java.util.Scanner;

public class EvaluaAlumno
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Nota del alumno: ");
		int nota = sc.nextInt();
		sc.close();
		
		if (nota >= 70) {
			System.out.println("Aprobado");
		}else {
			System.out.println("Reprobado");
		}
		
	}
}
