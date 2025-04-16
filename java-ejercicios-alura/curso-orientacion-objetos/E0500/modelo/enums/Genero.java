package modelo.enums;

public enum Genero {
	ALTERNATIVO("Alternativo"),
	BLUES("Blues"),
	CLASICA("Clásica"),
	ELECTRONICA("Electrónica"),
	EXPERIMENTAL("Experimental"),
	FOLCKLORE("Folcklore"),
	GLAM("Glam"),
	GRUNGE("Grunge"),
	JAZZ("Jazz"),
	LOUNGE("Lounge"),
	METAL("Metal"),
	POP("Pop"),
	POPROCK("Pop rock"),
	REGGAE("Reggae"),
	ROCK("Rock"),
	SOFTROCK("Soft rock"),
	TANGO("Tango"),	
	TRASH("Trash");
	
	private final String friendlyName;
	
	Genero(String friendlyName) {
		this.friendlyName = friendlyName;
	}
	
	public String getFriendlyName() {
		return this.friendlyName;
	}
}
