package NoMeGustaElArte;

public class Pintura extends ObraArte {

	String lienzo;

	public String getLienzo() {
		return lienzo;
	}

	public void setLienzo(String lienzo) {
		this.lienzo = lienzo;
	}

	public Pintura(String autor, String lienzo) {
		super(autor);
		this.lienzo = lienzo;
	}

}
