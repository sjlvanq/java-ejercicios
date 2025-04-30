/*****************************************************************
 * ByteOverflowDemo.java
 * Dean & Dean
 *
 * This demonstrates integer overflow.
 *****************************************************************/
public class ByteOverflowDemo
{
	public static void main(String[] args)
	{
		byte value = 64;
		System.out.println("Initial byte value = " + value);
		System.out.println("Byte maximum = " + Byte.MAX_VALUE);
		value += value;
		System.out.println("Twice initial byte value = " + value);
	} // end main
} // end ByteOverflowDemo class
