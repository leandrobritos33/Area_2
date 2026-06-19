package supermercado;

public abstract class Producto {

	double precio;
	String marca;

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Producto(double precio, String marca) {
		super();
		this.precio = precio;
		this.marca = marca;
	}

}
