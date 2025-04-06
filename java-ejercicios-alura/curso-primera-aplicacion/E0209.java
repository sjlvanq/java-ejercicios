public class E0209 {
	public static void main(String[] args){
		String nombre = "Juan";
		int aulas = 4;
		String mensaje = """
			Hola, %s. 
			Bienvenido al curso de Java.
			Tendremos %d aulas.""".formatted(nombre, aulas);
		
		System.out.println(mensaje);
		System.out.print("\n");
		
		System.out.printf("Hola, %s. Son %d aulas.%n", nombre, aulas);
		System.out.printf("Hola, %s. Son %d aulas.%n".formatted(nombre, aulas));
	}
}

