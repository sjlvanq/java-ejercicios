import java.util.Arrays;

public class Arreglo
{
	public static void main (String[] args)
	{
		int [] miArreglo = new int [100];
		for (int i=0; i < miArreglo.length; i++) {
			miArreglo[i] = (int)(Math.random() * 100 + 1);
		}
		for (int item : miArreglo) {
			System.out.print("%d ".formatted(item));
		}
		System.out.println();

		// Mostrar en consola el número mayor.

		/*
		int mayor = 0;
		for (int item : miArreglo) {
			if (item > mayor) {mayor = item;}
		}
		*/

		// max() retorna un OptionalInt
		// incompatible types: OptionalInt cannot be converted to int
		// entonces, getAsInt()
		// https://docs.oracle.com/javase/8/docs/api/java/util/OptionalInt.html

		int mayor = Arrays.stream(miArreglo).max().getAsInt();
		System.out.printf("Max: %d%n".formatted(mayor));

		// Mostrar en consola el número menor.

		/*
		int menor = 100;
		for (int item : miArreglo) {
			if (item < menor) {menor = item;}
		}
		*/

		// max() retorna un OptionalInt
		// incompatible types: OptionalInt cannot be converted to int
		// entonces, getAsInt()
		// https://docs.oracle.com/javase/8/docs/api/java/util/OptionalInt.html

		int menor = Arrays.stream(miArreglo).min().getAsInt();
		System.out.printf("Min: %d%n".formatted(menor));

		// Mostrar en consola todos los números primos.
		System.out.print("Primos: ");
		int i;
		for (int item : miArreglo) { 
			for(i=2; i<item; i++){
				if(item % i == 0){ break;}
			}
			if(i == item){
				System.out.printf("%d ".formatted(item));
			}
		} System.out.println();

		// Mostrar en consola todos los números pares.
		System.out.print("Pares: ");
		for (int item : miArreglo) { 
			if(item % 2 == 0){
				System.out.printf("%d ".formatted(item));
				continue;
			}
		} System.out.println();

		// Mostrar en consola el arreglo de forma ascendente.
		Arrays.sort(miArreglo);
		System.out.print("Ordenado: ");
		for (int item : miArreglo) {
			System.out.printf("%d ", item);
		} System.out.println();

		// Mostrar en consola el promedio del arreglo.

		/*
		int sum=0;
		for (int item : miArreglo) {sum+=item;}
		System.out.println("Promedio: %f".formatted((float) sum / (float) miArreglo.length));
		*/

		// average() retorna un OptionalDouble
		// entonces, getAsDouble()
		// https://docs.oracle.com/javase/8/docs/api/java/util/OptionalDouble.html

		double average = Arrays.stream(miArreglo).average().getAsDouble();
		System.out.println("Promedio: %f".formatted(average));

		// Mostrar en consola la suma del primer y último elemento del arreglo.
		System.out.println("Primero + último: %d".formatted(miArreglo[0]+miArreglo[miArreglo.length-1]));

		// Mostrar en consola el mensaje "Existe cien" en dado caso el arreglo almacene por los menos un cien.
		
		for (int item : miArreglo) {
			if (item == 100) {
				System.out.println("Existe cien");
				break;
			}
		}
	}
}
