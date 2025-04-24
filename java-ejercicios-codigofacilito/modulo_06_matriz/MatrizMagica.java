import java.util.ArrayList;
public class MatrizMagica
{
	public static void main (String[] args)
	{
		while(true){
		
		int[][] miMatriz = new int[3][3];
		ArrayList<Integer> inventario = new ArrayList<>((int)Math.pow(miMatriz.length,2));
		for (int i=1; i<=Math.pow(miMatriz.length,2); i++) {
			inventario.add(i);
		}
			
		for (int y=0; y<miMatriz.length; y++)
		{
			for (int x=0; x<miMatriz[0].length; x++)
			{
				//miMatriz[y][x] = miMatriz.length * y + x +1;
				int indice = (int) (Math.random() * inventario.size());
				miMatriz[y][x] = (int) inventario.get(indice);
				inventario.remove(indice);
				System.out.printf("%2d ",miMatriz[y][x]);
			}
			System.out.println("");
		}
		
		/*
		 * Formula de la constante mágica para una matriz[n][n]
		 * 
		 * n(n^2+1)
		 * ________
		 *    2 
		 */
		
		int tamanio_matriz = miMatriz.length;
		double constante_magica = (tamanio_matriz * (Math.pow(tamanio_matriz,2)+1)) / 2;
		
		
		int[] sumColumnas = new int[miMatriz.length];
		int x = 0, y = 0, sumFila = 0;
		for(y=0; y<miMatriz.length; y++){
			for(x=0, sumFila=0; x<miMatriz[y].length; x++){
				sumColumnas[x]+=miMatriz[y][x];
				sumFila+=miMatriz[y][x];
			} if(sumFila!=constante_magica){System.out.println();break;}
		}
		if(y==tamanio_matriz){
			for(x = 0; x < sumColumnas.length; x++){
				if(sumColumnas[x] != constante_magica){break;}
			}
		}
		
		if(y==miMatriz.length && x==sumColumnas.length){
			//Comprueba diagonales
			int sum_di = 0, sum_id = 0;
			for(int i=0, j=miMatriz.length-1; i<miMatriz.length && j>=0; i++, j--){
				sum_di+=miMatriz[i][i];
				sum_id+=miMatriz[j][i];
			}
			
			//###########################
			if(sum_di == constante_magica && sum_id == constante_magica)
			{
				System.out.println("CUADRADO MÁGICO");
				break;
			}
			//###########################
			
			}
		}
		
		/*
		// Diagonales
		if( flagMagica &&
			sum_di != constante_magica || sum_id != constante_magica) {
				flagMagica=false;
		}
		*/
	}
}
