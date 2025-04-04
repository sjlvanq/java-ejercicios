public class E0212 {
	public static void main(String[] args) {
		String saludo = "Hola, mi nombre es ";
		String nombre = "Alicia ";
		String continuacion = "y mi edad es ";
		int edad = 17;

		System.out.println(saludo + nombre + continuacion + edad);
		System.out.printf("%s%s%s%d%n", saludo, nombre, continuacion, edad);
		System.out.printf("%s%s%s%s%n", saludo, nombre, continuacion, edad);
		System.out.printf("%s%s%s%s%n", saludo, nombre, continuacion, String.valueOf(edad)); // Cast innecesario
		//System.out.println(saludo + nombre + continuacion + edad); // Cast necesario
		System.out.println(saludo + nombre + continuacion + String.valueOf(edad));
		System.out.printf("%s%n", saludo + nombre + continuacion + String.valueOf(edad));
		System.out.println("""
				%s%s%s%s""".formatted(saludo, nombre, continuacion, edad));
                System.out.println("""
                                %s%s%s%d""".formatted(saludo, nombre, continuacion, edad));
	}
}
