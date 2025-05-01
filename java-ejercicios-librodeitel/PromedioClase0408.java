1 // Fig. 4.8: PromedioClase.java
2 // Cómo solucionar el problema del promedio de la clase mediante la repetición
controlada por contador.

3 import java.util.Scanner; // el programa usa la clase Scanner
4
5
public class PromedioClase
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
				// fase de inicialización
				13
				int total = 0; // inicializa la suma de calificaciones introducidas por el
			14
				15
				16
				17
				7
				18
				19
				20
				21
				22
				23
				24

				usuario
				int contadorCalificaciones = 1; // inicializa # de calificación a
			introducir a continuación
				// la fase de procesamiento usa la repetición controlada por contador
				while (contadorCalificaciones <= 10) // itera 10 veces
				{
					System.out.print("Escriba la calificacion: "); // indicador
					int calificacion = entrada.nextInt(); // recibe siguiente calificación
					de entrada
						total = total + calificacion; // suma calificación al total
					contadorCalificaciones = contadorCalificaciones + 1; // incrementa el
					contador en 1"
				}

			Fig. 4.8 冷 Cómo solucionar el problema del promedio de la clase mediante la repetición controlada por
				contador (parte 1 de 2).

				M04_DEITEL_COMO-PROGRAMAR-EN-JAVA_SE_10ED_C4_101-151_3802-1.indd 116

				5/4/16 11:28 AM

				4.9 Formulación de algoritmos: repetición controlada por un contador

				25
				26
				27
				28
				29
				30
				31
				32

				117

				// fase de terminación
				int promedio = total / 10; // la división de enteros produce resultado entero
			// muestra el total y el promedio de las calificaciones
			System.out.printf("%nEl total de las 10 calificaciones es %d%n", total);
			System.out.printf("El promedio de la clase es %d%n", promedio);
		} // fin de main
} // fin de la clase PromedioClase
