public class Sort
{
	public static void sort(int[] list)
	{
		int j;
		// índice del valor más pequeño
		for (int i=0; i<list.length-1; i++)
		{
			j = indexOfNextSmallest(list, i);
			swap(list, i, j);
		}
	} // end sort
	//****************************************************************
	private static int indexOfNextSmallest(
			int[] list, int startIndex)
	{
		int minIndex = startIndex; // índice del valor más pequeño
		for (int i=startIndex+1; i<list.length; i++)
		{
			if (list[i] < list[minIndex])
			{
				minIndex = i;
			}
		} // end for
		return minIndex;
	} // end indexOfNextSmallest
	//****************************************************************
	private static void swap(int[] list, int i, int j)
	{
		int temp;
		// almacenamiento temporal del número
		temp = list[i];
		list[i] = list[j];
		list[j] = temp;
	} // end swap
} // end Sort
