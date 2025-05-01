// Fig. 5.19: OperadoresLogicos.java
// Los operadores lógicos.
public class OperadoresLogicos
{
	public static void main(String[] args)
	{
		// crea tabla de verdad para el operador && (AND condicional)
		System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
				"AND condicional (&&)", "false && false", (false && false)
				false),
			"false && true", (false && true)
				true),
			"true && false", (true && false)
				false),
			"true && true", (true && true)
				true));
		// crea tabla de verdad para el operador || (OR condicional)
		System.out.printf(“%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n”,
				“OR condicional (||)”, “false || false”, (false || false)
				false),
			“false || true”, (false || true)
				true),
			“true || false”, (true || false)
				false),
			“true || true”, (true || true)
				true));
		// crea tabla de verdad para el operador & (AND lógico booleano)
		System.out.printf(“%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n”,
				“AND logico booleano (&)”, “false & false”, (false & false)
				false),
			“false & true”, (false & true)
				true),
			“true & false”, (true & false)
				false),
			“true & true”, (true & true)
				true));
		// crea tabla de verdad para el operador | (OR inclusivo lógico booleano)
		System.out.printf(“%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n”,
				“OR inclusivo logico booleano (|)”,
				“false | false”, (false | false)
				false),
			“false | true”, (false | true)
				true),
			“true | false”, (true | false)
				false),
			“true | true”, (true | true)
				true));
		// crea tabla de verdad para el operador ^ (OR exclusivo lógico booleano)
		System.out.printf(“%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n”,
				“OR exclusivo logico booleano (^)”,
				“false ^ false”, (false ^ false)
				false),
			“false ^ true”, (false ^ true)
				true),
			“true ^ false”, (true ^ false)
				false),
			“true ^ true”, (true ^ true)
				true));
		// crea tabla de verdad para el operador ! (negación lógica)
		System.out.printf(“%s%n%s: %b%n%s: %b%n”, “NOT logico (!)”,
				“!false”, (!false)
				(!false), “!true”, (!true)
				(!true));
	}
} // fin de la clase OperadoresLogicos

