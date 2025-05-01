// Fig. 4.15: Incremento.java
// Operadores de preincremento y postincremento.
public class Incremento
{

	Fig. 4.15 冷 Operadores de preincremento y postincremento (parte 1 de 2).

		M04_DEITEL_COMO-PROGRAMAR-EN-JAVA_SE_10ED_C4_101-151_3802-1.indd 132

		5/4/16 11:28 AM

		4.13 Operadores de incremento y decremento

		6
		7
		8
		9
		10
		11
		12
		13
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

		133

		public static void main(String[] args)
		{
			// demuestra el operador de postincremento
			int c;= 5;
			System.out.printf(“c antes del postincremento: %d%n”, c);
			// imprime 5
			System.out.printf(“
					postincremento de c: %d%n”, c++); // imprime 5
			System.out.printf(“ c despues del postincremento: %d%n”, c);
			// imprime 6
			System.out.println(); // omite una línea
			// demuestra el operador de preincremento
			c = 5;
			System.out.printf(“c antes del preincremento: %d%n”, c);
			// imprime 5
			System.out.printf(“
					preincremento de c: %d%n”, ++c); // imprime 6
			System.out.printf(“ c despues del preincremento: %d%n”, c);
			// imprime 6
		}
} // fin de la clase Incremento
