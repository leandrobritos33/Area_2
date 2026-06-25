package NoMeGustaElArte;

public class Escultura extends ObraArte {

	String material;

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Escultura(String autor, String material) {
		super(autor);
		this.material = material;
	}

}
