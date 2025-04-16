package util;

public class UIFunctions {
	public static String serializaOpciones(int total) {
		String serializacion = "[";
		for(int i = 1; i <= total; i++) {
			serializacion+=String.valueOf(i)+", ";
		}
		serializacion+="otra=salir]";
		return serializacion;
	}
}
