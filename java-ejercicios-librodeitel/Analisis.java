1 // Fig. 4.12: Analisis.java
2 // Analisis de los resultados de un examen, utilizando instrucciones de control
anidadas.

3 import java.util.Scanner; // esta clase utiliza la clase Scanner
4
5
public class Analisis
6
{
	7
		public static void main(String[] args)
		8
		{
			9
				// crea objeto Scanner para obtener la entrada de la ventana de comandos
				10
				Scanner entrada = new Scanner(System.in);
			11
				12
				// inicialización de las variables en declaraciones
				13
				int aprobados = 0;
			14
				int reprobados = 0;
			15
				int contadorEstudiantes = 1;
			16
				17
				7
				// procesa 10 estudiantes, usando ciclo controlado por contador
				18
				while (contadorEstudiantes <= 10)
					19
					{
						20
							// pide al usuario la entrada y obtiene el valor
							21
							System.out.print("Escriba el resultado (1 = aprobado, 2 = reprobado): ");
						22
							int resultado = entrada.nextInt();
						23
							24
							// if...else anidado en la instrucción while
							25
							if (resultado == 1)
								26
									aprobados = aprobados + 1;
						27
							7
							else
								28
									reprobados = reprobados + 1;
						29

							Fig. 4.12 冷 Análisis de los resultados de un examen, utilizando instrucciones de control anidadas (parte 1 de 2).

							M04_DEITEL_COMO-PROGRAMAR-EN-JAVA_SE_10ED_C4_101-151_3802-1.indd 129

							5/4/16 11:28 AM

							130

							Capítulo 4 Instrucciones de control: parte 1: operadores de asignación, ++ y --

							// incrementa contadorEstudiantes, para que el ciclo termine en un
							momento dado
							contadorEstudiantes = contadorEstudiantes + 1;

						30
							31
							32
							33
							34
							35
							36
							37
							7
							38
							39
							40
							41

					}
			// fase de terminación; prepara y muestra los resultados
			System.out.printf("Aprobados: %d%nReprobados: %d%n", aprobados, reprobados);
			// determina si más de 8 estudiantes aprobaron
			if (aprobados > 8)
				System.out.println( "Bono para el instructor!" );
		}
} // fin de la clase Analisis
