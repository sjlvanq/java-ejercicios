1 // Fig. 4.10: PromedioClase.java
2 // Cómo resolver el problema del promedio de una clase mediante la repetición
controlada por centinela.

3 import java.util.Scanner; // el programa usa la clase Scanner

Fig. 4.10 冷 Cómo resolver el problema del promedio de una clase mediante la repetición controlada por
centinela (parte 1 de 2).

M04_DEITEL_COMO-PROGRAMAR-EN-JAVA_SE_10ED_C4_101-151_3802-1.indd 122

5/4/16 11:28 AM

4.10 Formulación de algoritmos: repetición controlada por un centinela

123

4
5 public class PromedioClase
6 {
	7
		public static void main(String[] args)
		8
		{
			9
				// crea objeto Scanner para obtener entrada de la ventana de comandos
				10
				Scanner entrada = new Scanner(System.in);
			11
				12
				// fase de inicialización
				13
				int total = 0; // inicializa la suma de calificaciones
			14
				int contadorCalificaciones = 0; // inicializa # de calificaciones introducidas
			hasta ahora

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
				25

				// fase de procesamiento
				// pide entrada y lee calificación del usuario
				System.out.print("Escriba la calificacion o -1 para terminar: ");
			int calificacion = entrada.nextInt();
			// itera hasta recibir el valor centinela del usuario
			while (calificacion != -1)
			{
				total = total + calificacion; // suma calificacion al total
				contadorCalificaciones = contadorCalificaciones + 1; // incrementa el
				contador

					26
					27
					7
					28
					29
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
					42
					43
					44
					45
					46
					47
					7

					// pide entrada y lee la siguiente calificación del usuario
					System.out.print("Escriba la calificacion o -1 para terminar: ");
				calificacion = entrada.nextInt();
				{
					// fase de terminación
					// si el usuario introdujo al menos una calificación...
					if (contadorCalificaciones != 0)
					{
						// usa número con punto decimal para calcular promedio de calificaciones
						double promedio = (double) total / contadorCalificaciones;
						// muestra total y promedio (con dos dígitos de precisión)
						System.out.printf("%nEl total de las %d calificaciones introducidas es %d%n",
								contadorCalificaciones, total);
						System.out.printf("El promedio de la clase es %.2f%n", promedio);
					}
					else // no se introdujeron calificaciones, por lo que se muestra el mensaje
						apropiado
							System.out.println("No se introdujeron calificaciones");
				}
			} // fin de la clase PromedioClase
