/*************************************************************
 * TestExceptions.java
 * Dean & Dean
 *
 * Esto busca el valor en el índice calculado.
 *************************************************************/
public class TestExceptions
{
	private double[] value =
		new double[] {1.0, 0.97, 0.87, 0.7, 0.47, 0.17};
	private int num;
	//**********************************************************
	public double eval(String n1, String n2)
			throws IndexOutOfBoundsException
		{
			try
			{
				num = Integer.parseInt(n1) / Integer.parseInt(n2);
			}
			catch (NumberFormatException nfe)
			{
				num++;
				System.out.println("en el primer catch");
			}
			catch (ArithmeticException ae)
			{
				num++;
				System.out.println("en el segundo catch");
			}
			return value[num];
		}
	//**********************************************************
	public static void main(String[] args)
	{
		TestExceptions te = new TestExceptions();
		try
		{
			System.out.println(te.eval("5.0", "4"));

			System.out.println(te.eval("5", "0"));
			System.out.println(te.eval("22", "5"));
			System.out.println(te.eval("33", "5"));
		}
		catch (Exception e)
		{
			System.out.println("en el catch de main");
		}
		System.out.println("Bye");
	} // end main
} // end TestExceptions class
