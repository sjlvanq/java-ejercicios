/*********************************************************************
 * SalesClerks.java
 * Dean & Dean
 *
 * Esta clase almacena nombres y ventas de empleados de ventas.
 *********************************************************************/
class SalesClerks
{
	private SalesClerk[] clerks;
	private int filledElements = 0;
	// contiene nombres y ventas
	// número de elementos llenos
	//*****************************************************************
	public SalesClerks(int initialSize)
	{
		clerks = new SalesClerk[initialSize];
	} // end SalesClerks constructor
	//*****************************************************************
	//Procesa una venta para el empleado cuyo nombre ha sido pasado.
	//Si el nombre no está ya en el arreglo clerks, crea un nuevo objeto e
	//inserta una referencia a éste en el siguiente elemento del arreglo,
	//duplicando la longitud del arreglo en caso de ser necesario.
	public void addSale(String name, double amount)
	{
		int clerkIndex = findClerk(name);
		if (clerkIndex == -1)
			// agrega un nuevo empleado
		{
			if (filledElements == clerks.length)
			{
				doubleLength();
			}
			clerkIndex = filledElements;
			clerks[clerkIndex] = new SalesClerk(name);
			filledElements++;
		} // end if
		clerks[clerkIndex].adjustSales(amount);
	} // end addSale
	//***************************************************************
	//Imprime todos los datos: nombre del empleado y ventas.
	public void dumpData()
	{
		for (int i=0; i<filledElements; i++)
		{
			System.out.printf("%s: %6.2f\n",
					clerks[i].getName(), clerks[i].getSales());
		}
	} // end dumpData
	//***************************************************************
	//Busca el nombre dado. Si lo encuentra, devuelve el índice.
	//En caso contrario, regresa -1.
	private int findClerk(String name)
	{
		for (int i=0; i<filledElements; i++)
		{
			if (clerks[i].getName().equals(name))
			{
				return i;
			}
		} // end for
		return -1;
	} // end findClerk
	//***************************************************************
	//Duplica la longitud del arreglo.
	private void doubleLength()
	{
		SalesClerk[] clerks2 = new SalesClerk[2 * clerks.length];
		System.arraycopy(clerks, 0, clerks2, 0, clerks.length);
		clerks = clerks2;
	} // end doubleLength
} // end class SalesClerks