package supermercado;

public class Electronica extends Producto {

	String modelo;
	int voltaje;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVoltaje() {
		return voltaje;
	}

	public void setVoltaje(int voltaje) {
		this.voltaje = voltaje;
	}

	public Electronica(double precio, String marca, String modelo, int voltaje) {
		super(precio, marca);
		this.modelo = modelo;
		this.voltaje = voltaje;
	}

}
