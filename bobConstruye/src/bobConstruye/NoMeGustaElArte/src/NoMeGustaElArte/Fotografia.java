package NoMeGustaElArte;

public class Fotografia extends ObraArte {

	String resolucion;

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	public Fotografia(String autor, String resolucion) {
		super(autor);
		this.resolucion = resolucion;
	}

}
