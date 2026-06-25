package bobConstruye;

public class Apartamento extends Edificio {

	int Piso;
	int nroApt;

	public int getPiso() {
		return Piso;
	}

	public void setPiso(int piso) {
		Piso = piso;
	}

	public int getNroApt() {
		return nroApt;
	}

	public void setNroApt(int nroApt) {
		this.nroApt = nroApt;
	}

	public Apartamento(Double mtCuadrados, String direccion, int piso, int nroApt) {
		super(mtCuadrados, direccion);
		Piso = piso;
		this.nroApt = nroApt;
	}

	

}
