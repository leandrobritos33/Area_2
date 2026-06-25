package NoMeGustaElArte;

public abstract class ObraArte {

	String autor;

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public ObraArte(String autor) {
		super();
		this.autor = autor;
	}

}
