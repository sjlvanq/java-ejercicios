public class Matriz
{
	public static void main (String[] args)
	{
		int[][] miMatriz = new int[5][5];
		for (int y=0; y<miMatriz.length; y++)
		{
			for (int x=0; x<miMatriz[0].length; x++)
			{
				miMatriz[y][x] = (int)(Math.random() * 100 + 1);
				System.out.printf("%3d ",miMatriz[y][x]);
			}
			System.out.println("");
		}

		// Mostrar en consola el promedio de la matriz.
		int sum = 0;
		for(int[] fila : miMatriz)
			for(int celda : fila)
				sum+=celda;
				
		System.out.println("Promedio: %f".formatted(
			(float) sum / (float) (miMatriz.length * miMatriz[0].length)
		));
		
		// Mostrar en consola el número mayor y la cantidad de veces que este se repite.
		int max = 0;
		int max_count = 0;
		for(int[] fila : miMatriz)
			for(int celda : fila)
				if(celda>max) max=celda;
		for(int[] fila : miMatriz)
			for(int celda : fila)
				if(celda==max) max_count++;
		
		System.out.println("Mayor: %d, repetido %d veces".formatted(
			max, max_count)
		);
		
		// Mostrar en consola la suma de las diagonales
		int sum_di = 0, sum_id = 0;
		for(int i=0, j=4; i<=4 && j>=0; i++, j--){
			sum_di+=miMatriz[i][i];
			sum_id+=miMatriz[j][i];
		}
		System.out.println("Sumatoria diagonal 1: %d".formatted(sum_id));
		System.out.println("Sumatoria diagonal 2: %d".formatted(sum_di));
		
		// Mostrar en consola la suma de la la última fila.
		sum = 0;
		for (int celda : miMatriz[miMatriz.length-1]){
			sum += celda;
		} System.out.println("Sumatoria última fila: %d".formatted(sum));
		
	}
}
