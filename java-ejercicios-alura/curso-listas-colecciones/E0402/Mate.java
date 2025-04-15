
import java.util.Collections;

public class Mate implements Comparable<Mate>{
	private Yerbas yerba;
	private TiposDeMate tipo;
	//private byte cebadas;
	public Mate(Yerbas yerba, TiposDeMate tipoMate) {
		this.yerba = yerba;
		this.tipo = tipoMate;
	}
	public Yerbas getYerba() {
		return yerba;
	}
	public TiposDeMate getTipo() {
		return tipo;
	}
	@Override
	public int compareTo(Mate o) {
		return this.getYerba().name().compareTo(o.getYerba().name());
	}
}
