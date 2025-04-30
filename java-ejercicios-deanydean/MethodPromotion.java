/***************************************************
 * MethodPromotion.java
 * Dean & Dean
 *
 * Promote type in method call
 ***************************************************/
public class MethodPromotion
{
	public static void main(String[] args)
	{
		float x = 4.5f;
		printSquare(x);
		printSquare(3);
	}

	private static void printSquare(double num)
	{
		System.out.println(num * num);
	}
} // end class MethodPromotion
