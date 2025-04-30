/***************************************************************
 * ReporteDePresupuesto.java
 * Dean & Dean
 *
 * Este programa genera un reporte de presupuesto.
 ***************************************************************/
public class ReporteDePresupuesto
{
	public static void main(String[] args)
	{
		final String CAD_FMT_ENCABEZADO = "% - 25s%13s%13s%15s\n";
		final String CAD_FMT_DATOS = "%-25s%,13.2f%,13.2f%(,15.2f\n";
		double actual1 = 1149.999; // cantidad gastada en la 1era cuenta
		double presup1 = 1400;
		// presupuesto para la 1era cuenta
		double actual2 = 2100.111; // cantidad gastada en la 2da cuenta
		double presup2 = 2000;
		// presupuesto para la 2da cuenta
		double remanente1, remanente2; // cantidades no gastadas

		System.out.printf(CAD_FMT_ENCABEZADO,
				"Cuenta", "Actual", "Presupuesto", "Remanente");
		System.out.printf(CAD_FMT_ENCABEZADO,
				"-------", "------", "------", "---------");
		remanente1 = presup1 - actual1 ;
		System.out.printf(CAD_FMT_DATOS,
				"Artículos de oficina", actual1, presup1, remanente1);
		remanente2 = presup2 - actual2;
		System.out.printf(CAD_FMT_DATOS,
				"Fotocopiado", actual2, presup2, remanente2);
		System.out.printf(
				"\nRemanente total: $%(,.2f\n", remanente1 + remanente2);
	} // fin del main
} // fin de la clase ReporteDePresupuesto
