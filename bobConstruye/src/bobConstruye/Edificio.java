package bobConstruye;

public abstract class Edificio {

	Double mtCuadrados;
	String direccion;

	public Double getMtCuadrados() {
		return mtCuadrados;
	}

	public void setMtCuadrados(Double mtCuadrados) {
		this.mtCuadrados = mtCuadrados;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Edificio(Double mtCuadrados, String direccion) {
		super();
		this.mtCuadrados = mtCuadrados;
		this.direccion = direccion;
	}

}
