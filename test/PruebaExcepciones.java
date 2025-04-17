public class PruebaExcepciones
{
	public static void main (String[] args)
	{
		try 
		{
 			 Integer i = null;
			 System.out.println(i.toString());
		} catch (Exception e) {
			  System.out.println("Exception");
		} catch (ArrayIndexOutOfBoundsException e) {
			  System.out.println("Array Index Out Of Bounds Exception");
		} catch (NullPointerException e) {
			  System.out.println("Null Pointer Exception");
		}
	}
}
