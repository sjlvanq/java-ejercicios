package modelo.enums;

public enum Categoria {
	ARTE("Arte"),
	DEPORTES("Deportes"),
	ENTRETENIMIENTO("Entretenimiento"),
	FINANZAS("Finanzas"),
	HOGAR("Hogar"),
	HUMANIDADES("Humanidades"),
	INFORMATICA("Informática"),
	LITERATURA("Literatura"),
	MANUALIDADES("Manualidades"),
	MUSICA("Música"),
	OFICIOS("Oficios"),
	OTROS("Otra"),
	POLITICA("Política"),
	VIDEOJUEGOS("Videojuegos");
	
	private final String friendlyName;
	
	Categoria(String friendlyName) {
		this.friendlyName = friendlyName;
	}
	
	public String getFriendlyName() {
		return this.friendlyName;
	}
}
